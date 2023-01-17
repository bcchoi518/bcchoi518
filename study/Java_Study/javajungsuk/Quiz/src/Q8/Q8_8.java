package Q8;

public class Q8_8 {
  public static void main(String[] args) {
    try {
      method1(); // method2에서 예외 되던지기로 인해 예외 발생
      System.out.println(6); // method1에서 예외 되던지기로 인해 예외가 발생해서 실행되지 않는다.
    } catch (Exception e) {
      System.out.println(7);
    } // end try-catch
  }// end main

  static void method1() throws Exception {
    try {
      method2();
      System.out.println(1); // 예외가 발생해서 실행되지 않는다.
    } catch (NullPointerException e) {
      System.out.println(2); // method2의 NullPointerException을 catch하여 이 문장이 실행 됨
      throw e; // 예외를 다시 발생시킨다. 예외 되던지기(re-throwing)
    } catch (Exception e) { // 위에서 예외를 처리하였으므로 예외 되던지기를 하여도 여기서 처리되는 것이 아님
      System.out.println(3);
    } finally {
      System.out.println(4); // 예외 처리 여부와 상관없이 finally 문장은 실행 됨
    } // end try-catch
    System.out.println(5); // 예외 되던지기로 인해 예외가 다시 발생되었고 처리되지 않아 이 문장은 실행 안됨
  }// end method1

  static void method2() {
    throw new NullPointerException(); // NullPointerException을 발생시킨다.
  }// end method2
}// end Q8_8
