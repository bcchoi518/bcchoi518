public class Ex10_6 {
  public static void main(String[] args) {
    ThreadEx8_1 th1 = new ThreadEx8_1();
    ThreadEx8_2 th2 = new ThreadEx8_2();
    th1.start();
    th2.start();

    // try { // Exception의 자손이므로 예외처리가 필수라서 매번 예외처리가 불편함
    // // th1.sleep(2000); // th1을 2초동안 잠자게? (안됨, 코드를 수행하는 main 쓰레드가 잠)
    // Thread.sleep(2000); // 이렇게 작성해야 정상
    // } catch (InterruptedException e) {
    // }

    delay(2 * 1000); // delay method를 만들어 둠으로 간결한 코드 작성 가능

    System.out.print("<<main 종료>>");
  } // end main

  static void delay(long millis) { // main method가 static 이므로 static
    try { // 예외 처리가 되어 있는 메서드 작성
      Thread.sleep(millis);
    } catch (InterruptedException e) {
    } // end try-catch
  }// end delay
}// end Ex10_6

class ThreadEx8_1 extends Thread {
  public void run() {
    for (int i = 0; i < 300; i++)
      System.out.print("-");
    System.out.print("<<th1 종료>>");
  } // end run
}// end ThreadEx8_1

class ThreadEx8_2 extends Thread {
  public void run() {
    for (int i = 0; i < 300; i++)
      System.out.print("|");
    System.out.print("<<th2 종료>>");
  }// end run
}// end ThreadEx8_2