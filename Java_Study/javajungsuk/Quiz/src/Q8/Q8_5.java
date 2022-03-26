package Q8;

public class Q8_5 {
  public static void main(String[] args) {
    try {
      method1();
    } catch (Exception e) { // method1에서 처리되지 않은 예외가 넘어와서 모든 예외의 조상에서 처리가 된다.
      System.out.println(5); // 모든 예외를 처리하기 때문에 여기서 예외가 처리된다.
    } // end try-catch
  }// end main

  static void method1() {
    try {
      method2(); // method2에 try-catch가 없으므로 예외가 처리되지 않고 method1로 넘어옴
      System.out.println(1); // 예외 발생으로 이 문장은 실행되지 않는다.
    } catch (ArithmeticException e) {
      System.out.println(2);
      // }
      // catch (Exception e) {
      // System.out.println("처리");
    } finally {
      System.out.println(3); // 예외 처리 여부에 상관없이 이 문장은 실행된다.
    } // end try-catch
    System.out.println(4); // method1의 try-catch 안에서 예외가 처리 되지 않아 이 문장은 실행되지 않는다.
  }// end method1

  static void method2() {
    throw new NullPointerException(); // 예외 발생
  }// end method2
}// end Q8_5