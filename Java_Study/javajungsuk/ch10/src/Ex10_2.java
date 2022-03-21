public class Ex10_2 {
  static long startTime = 0;

  public static void main(String[] args) {
    ThreadEx2_1 th1 = new ThreadEx2_1();
    ThreadEx2_2 th2 = new ThreadEx2_2();

    th1.start();
    th2.start();
    startTime = System.currentTimeMillis();

    try {
      th1.join(); // main쓰레드가 th1 의 작업이 끝날 때까지 기다린다.
      th2.join(); // main쓰레드가 th2 의 작업이 끝날 때까지 기다린다.
    } catch (InterruptedException e) {
    } // end try-catch

    System.out.print("소요시간 : " + (System.currentTimeMillis() - startTime));
  }// end main
}// end Ex10_2

class ThreadEx2_1 extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 300; i++) {
      System.out.print(new String("-"));
    } // end for
  }// end run
}// end ThreadEx2_1

class ThreadEx2_2 extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 300; i++) {
      System.out.print(new String("|"));
    } // end for
  }// end run
}// end ThreadEx2_2