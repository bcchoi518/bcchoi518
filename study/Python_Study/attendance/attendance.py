import os
import sys
import configparser as parser                     # 외부설정파일을 읽기 위한 import
import time                                       # 페이지 로딩을 기다리는데에 사용할 time 모듈 import
from selenium import webdriver                    # selenium의 webdriver를 사용하기 위한 import
from selenium.webdriver.common.by import By       # selenium으로 Element를 선택하기 위한 import
from datetime import datetime                     # 현재 시각을 구하기 위한 import

# config.ini 파일을 못 읽어들여서 추가한 코드 (여전히 잘 못 읽어들여서 수동으로 attendance/data로 폴더 복사함)
if getattr(sys, 'frozen', False):
    # exe로 실행한 경우, exe를 보관한 디렉토리의 full path를 취득
    program_directory = os.path.dirname(os.path.abspath(sys.executable))
else:
    # python py로 실행한 경우, py를 보관한 디렉토리의 full path를 취득
    program_directory = os.path.dirname(os.path.abspath(__file__))
# 현재 작업 디렉토리를 변경
os.chdir(program_directory)


# 설정 파일 읽기
configs = parser.ConfigParser()
configs.read('.\data\config.ini')

# id, pw 값 읽기
id = configs['account']['id']
pw = configs['account']['pw']

# options 값 읽기
pcOnOff = configs['options']['pcOnOff']   # 퇴근 후 PC 종료 여부
holidayStart = configs['options']['holidayStart']   # 휴일 시작일
holidayEnd = configs['options']['holidayEnd']   # 휴일 종료일

# 오늘 날짜 구하기
now = datetime.now()
today = now.date()
startDate = datetime.strptime(holidayStart, '%Y-%m-%d').date()
endDate = datetime.strptime(holidayEnd, '%Y-%m-%d').date()

# 설정한 휴일에 포함되면 프로그램 종료 
if startDate <= today <= endDate :
  sys.exit()

driver = webdriver.Chrome()   # 크롬 드라이버 실행
driver.maximize_window()    # 윈도우 창 크기 최대사이즈로 설정
driver.get('https://gonet.daouoffice.com/login?returnUrl=%2Fapp%2Fehr')   # 원하는 페이지 로딩

driver.implicitly_wait(10)    # 로딩 될때까지 최대 10초 기다리기

driver.find_element(By.ID, 'username').send_keys(id)   # 아이디 입력란을 찾아 아이디 입력
driver.find_element(By.ID, 'password').send_keys(pw)   # 비밀번호 입력란을 찾아 아이디 입력
driver.find_element(By.ID, 'login_submit').click()    # 로그인 버튼을 찾아 클릭

driver.implicitly_wait(10)    # 로딩 될때까지 최대 10초 기다리기

# 화면 청소
driver.find_element(By.XPATH, '//*[@id="advancedGuideLayer"]/div/div[5]/a[1]').click()
driver.find_element(By.XPATH, '//*[@id="myInfo"]/span/div/div/a[1]').click()
driver.find_element(By.XPATH, '//*[@id="closeBadge"]/span').click()

# 현재 시각 구하기
hr = now.hour

# 현재 시각이 9시 전이면 출근, 18시 이후면 퇴근 버튼 클릭
if 6 <= hr < 9 :
  driver.find_element(By.XPATH, '//*[@id="workIn"]/span').click()
elif 17 < hr :
  driver.find_element(By.XPATH, '//*[@id="workOut"]/span').click()
  if pcOnOff == 'off' :   # 퇴근 후 PC 종료 여부 off 면 즉시 종료
    time.sleep(2)
    os.system('shutdown -s -f -t 0')

time.sleep(2)   # 퇴근 동작 여부를 확인하기 위한 시간