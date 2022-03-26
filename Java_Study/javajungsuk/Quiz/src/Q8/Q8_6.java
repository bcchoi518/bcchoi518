package Q8;

public class Q8_6 {
  static void method(boolean b) {
    try {
      System.out.println(1);
      if (b) {
        System.exit(0); // if문이 실행되면 프로그램을 종료함(JVM 종료)
      }
      System.out.println(2);
    } catch (RuntimeException r) {
      System.out.println(3);
      return;
    } catch (Exception e) {
      System.out.println(4);
      return;
    } finally { // System.exit(0)로 프로그램을 즉시 종료하여 finally 문장이 수행되지 않음
      System.out.println(6);
    }
  }

  public static void main(String[] args) {
    method(true); // method 호출 후 1출력하고 b가 true로 if문이 실행되어 프로그램이 종료되므로 다음문장인 method(false)도 실행안됨
    method(false); // method 호출 후 1출력하고 b가 false이고 예외도 없으므로 2 6이 출력되고 method가 종료되고 main도 종료됨
  }// end main
}// end Q8_6

// System Class
// java.lang 패키지에 속해 있는 System class
// 운영체제의 일부를 사용할 수 있게 해주는 클래스
// 프로그램 종료, 키보드로부터 입력, 모니터로 출력, 메모리 정리, 현재 시간 읽기, 시스템 프로퍼티 읽기, 환경 변수 읽기 등이 가능
// System 클래스의 모든 필드와 메서드는 정적(static) 필드와 정적(static) 메서드로 구성되어 있음

// System.exit()
// - 강제적으로 JVM을 종료시킬 때나 현재 실행되고 있는 프로세스를 강제 종료시킬 때 exit() 메서드를 호출하여 사용
// - int형 매개변수를 지정해야 하는데 이 값을 종료 상태값이라고 함
// - 일반적인 정상 종료값은 exit(0) 이고 비정상 종료값은 0 이외의 다른 값임
// - 어떤 특정 값이 입력되었을 경우에만 종료하고 싶다면 자바의 보안 관리자를 직접 설정해서 종료 상태값을 확인하면 됨
// - 값이 입력되지 않으면 SecurityException을 발생시켜 System.exit()를 호출한 곳에서 예외 처리를 하도록 함

// System.gc()
// JVM은 메모리가 부족할 때와 CPU가 한가할 때에 Garbage Collector를 실행시켜 사용하지 않는 개체를 자동 제거함
// Garbage Collector은 개발자가 직접 코드로 실행시킬 수 없지만 JVM에게 가능한 빨리 삭제해달라고 요청할 때 사용함

// System.currentTimeMillis(), System.nanoTime()
// 컴퓨터 시꼐로부터 현재 시간을 읽어서 밀리세컨드(1/1000초)와 나노세컨드(1/10^9초) 단위의 long값을 리턴함

// System.getProperty()
// JVM이 시작할 때 자동 설정되는 시스템의 속성값인 시스템 프로퍼티를 읽어 오게 해주는 메서드
// 운영체제의 종류, 자바 프로그램을 실행시킨 사용자 아이디, jVM의 버전, 운영체제에서 사용되는 파일 경로 구분자 등
// 시스템 프로퍼티는 키(key)와 값(value)로 구성되어 있음

// System.getenv()
// 환경 변수(Environment Variable)는 운영체제에서 이름(Name)과 값(Value)으로 관리되는 문자열 정보 임
// 운영체제가 설치될 때 기본적인 내용이 설정되고, 사용자가 직접 설정하거나 응용 프로그램이 설지될 때 자동으로 추가 설정되기도 함
// 자바 활용 시, 환경 변수의 값이 필요할 경우 사용함