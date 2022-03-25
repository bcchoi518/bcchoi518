import javax.swing.JOptionPane;

public class Ex10_3 {
  public static void main(String[] args) {
    ThreadEx5_1 th1 = new ThreadEx5_1();
    th1.start();

    String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
    System.out.println("입력하신 값은 " + input + "입니다.");
  }// end main
}// end Ex10_3

class ThreadEx5_1 extends Thread {
  public void run() {
    for (int i = 10; i > 0; i--) {
      System.out.println(i);
      try {
        sleep(1000);
      } catch (Exception e) {
      } // end try-catch
    } // end for
  } // end run
}// end ThreadEx5_1