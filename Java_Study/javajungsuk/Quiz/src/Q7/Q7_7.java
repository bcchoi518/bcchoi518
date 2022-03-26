package Q7;

class Outer1 { // 외부 클래스
  static class Inner1 { // 내부 클래스(static 클래스)
    int iv = 200;
  }
}

public class Q7_7 {
  public static void main(String[] args) {
    // static Inner 클래스는 인스턴스 클래스와 달리 외부 클래스의 인스턴스를 생성하지 않고도 사용할 수 있다.
    // 마치 static 멤버를 인스턴스 생성없이 사용할 수 있는 것처럼.
    Outer1.Inner1 in = new Outer1.Inner1();
    System.out.println(in.iv);
  }// end main
}// end Q7_7
