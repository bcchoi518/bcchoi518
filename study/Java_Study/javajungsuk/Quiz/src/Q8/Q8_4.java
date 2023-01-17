package Q8;

public class Q8_4 {
  static void method(boolean b) {
    try {
      System.out.println(1);
      if (b) {
        throw new ArithmeticException(); // RuntimeException 아래에 ArithmeticException이 존재
      }
      System.out.println(2); // 예외가 발생하면 실행되지 않는 문장
    } catch (RuntimeException r) {
      System.out.println(3);
      return; // method를 빠져나간다 (finally 블럭을 수행한 후에)
    } catch (Exception e) {
      System.out.println(4);
      return;
    } finally {
      System.out.println(5); // 예외발생여부에 관계없이 항상 실행되는 문장
    } // end try-catch
    System.out.println(6);
  }// end method

  public static void main(String[] args) {
    method(true);
    method(false);
  }// end main
}// end Q8_4
