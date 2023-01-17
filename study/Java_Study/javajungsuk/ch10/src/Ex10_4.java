public class Ex10_4 {
  public static void main(String[] args) {
    ThreadEx6_1 th1 = new ThreadEx6_1();
    ThreadEx6_2 th2 = new ThreadEx6_2();

    // th1.setPriority(5); // 설정 디폴트 값 : 5
    th2.setPriority(7); // 우선순위 설정 : 1(우선순위낮음) ~ 10(우선순위높음)

    System.out.println("Priority of th1(-) : " + th1.getPriority());
    System.out.println("Priority of th2(|) : " + th2.getPriority());
    th1.start();
    th2.start();
  }// end main
}// end Ex10_4

class ThreadEx6_1 extends Thread {
  public void run() {
    for (int i = 0; i < 300; i++) {
      System.out.print("-");
      for (int x = 0; x < 10000000; x++) // 시간 지연용 더미
        ;
    } // end for
  }// end run
}// end ThreadEx6_1

class ThreadEx6_2 extends Thread {
  public void run() {
    for (int i = 0; i < 300; i++) {
      System.out.print("|");
      for (int x = 0; x < 10000000; x++) // 시간 지연용 더미
        ;
    } // end for
  }// end run
}// end ThreadEx6_2