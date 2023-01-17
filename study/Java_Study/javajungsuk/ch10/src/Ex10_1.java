public class Ex10_1 {
  public static void main(String[] args) {
    ThreadEx1_1 t1 = new ThreadEx1_1();

    Runnable r = new ThreadEx1_2();
    Thread t2 = new Thread(r); // 생성자 Thread(Runnable target)

    t1.start(); // 쓰레드의 실행 메서드
    t2.start();
  }// end main
}// end Ex10_1

class ThreadEx1_1 extends Thread { // Thread클래스를 상속해서 쓰레드를 구현
  public void run() { // 쓰레드가 수행할 작업을 작성
    for (int i = 0; i < 500; i++) {
      System.out.println(this.getName()); // 조상인 Thread의 getName()을 호출
    } // end for
  }// end run
}// end ThreadEx1_1

class ThreadEx1_2 implements Runnable { // Runnable인터페이스를 구현해서 쓰레드를 구현
  public void run() { // 쓰레드가 수행할 작업을 작성
    for (int i = 0; i < 500; i++) {
      // Thread.currentTread() - 현재 실행중인 Thread를 반환한다.
      System.out.println(Thread.currentThread().getName());
    } // end for
  }// end run
}// end ThreadEx1_2
