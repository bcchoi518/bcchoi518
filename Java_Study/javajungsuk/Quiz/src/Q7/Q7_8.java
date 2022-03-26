package Q7;

class Outer2 { // 외부 클래스
  int value = 10; // Outer2.this.value

  class Inner2 { // 내부 클래스(static 클래스)
    int value = 20; // this.value

    void method2() {
      int value = 30; // value

      System.out.println(value);
      System.out.println(this.value);
      System.out.println(Outer2.this.value);
    }// end method
  }// end Inner2
}// end Outer2

public class Q7_8 {
  public static void main(String[] args) {
    Outer2 out = new Outer2();
    Outer2.Inner2 in = out.new Inner2();

    in.method2();

  }// end main
}// end Q7_7
