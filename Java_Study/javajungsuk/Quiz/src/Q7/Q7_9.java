package Q7;

import java.awt.*; // AWT : Java의 윈도우 프로그래밍
import java.awt.event.*;

public class Q7_9 {
  public static void main(String[] args) {
    Frame f = new Frame();
    // f.addWindowListener(new EventHandler());
    f.addWindowListener(new WindowAdapter() { // EventHandler 클래스를 익명클래스로 변경함
      public void windowClosing(WindowEvent e) {
        e.getWindow().setVisible(false);
        e.getWindow().dispose();
        System.exit(0);
      }// end windowClosing
    });// end addWindowListener
  }// end main
}// end Q7_9

// 익명 클래스는 이름이 없는 일회용 클래스이며 정의와 생성을 동시에 한다.
// 익명 클래스는 컴파일 하면 Outer 클래스의 이름$숫자.class 로 생성된다. (ex. Q7_9$1.class)
// class EventHandler extends WindowAdapter { // 보통 1번 쓰고 안쓰는 1회성이라 익명 클래스로 사용함
// public void windowClosing(WindowEvent e) {
// e.getWindow().setVisible(false);
// e.getWindow().dispose();
// System.exit(0);
// }
// }