from selenium import webdriver                    # selenium의 webdriver를 사용하기 위한 import
from selenium.webdriver.common.keys import Keys   # selenium으로 키를 조작하기 위한 import
from selenium.webdriver.common.by import By       # selenium으로 Element를 선택하기 위한 import
from datetime import datetime                     # 현재 시각을 구하기 위한 import
import configparser as parser                     # 외부설정파일을 읽기 위한 import
import time                                       # 페이지 로딩을 기다리는데에 사용할 time 모듈 import

# 설정 파일 읽기
configs = parser.ConfigParser()
configs.read('attendance\config.ini')

# id, pw 값 읽기
id = configs['account']['id']
pw = configs['account']['pw']

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
now = datetime.now()
hr = now.hour

# 현재 시각이 9시 전이면 출근, 18시 이후면 퇴근 버튼 클릭
if 8 < hr < 9 :
  driver.find_element(By.XPATH, '//*[@id="workIn"]/span').click()
elif 17 < hr :
  driver.find_element(By.XPATH, '//*[@id="workOut"]/span').click()

time.sleep(60)