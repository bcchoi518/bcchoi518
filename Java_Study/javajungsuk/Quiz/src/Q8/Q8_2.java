package Q8;

public class Q8_2 {
  public static void main(String[] args) {
    // java.lang.ArithmeticException : / by zero
    // at ExceptionEx18.method2(ExceptionEx18.java:12)
    // at ExceptionEx18.method1(ExceptionEx18.java:8)
    // at ExceptionEx18.main(ExceptionEx18.java:4)

    // 예외의 종류는 ArithmeticException이고 0으로 나눠서 발생하였다.
    // 예외가 발생한 곳은 method2이고 ExceptionEx18.java의 12번째 줄이다.
    // 예외가 발생했을 당시의 호출스택은 맨 위에 있는 메서드가 현재 실행 중인 메서드이다. (main -> method1 -> method2)
    // method1의 괄호안 내용은 method2를 호출한 라인이다.
    // main의 괄호안 내용은 method1을 호출한 라인이다.
  }
}
