class A {
  public void method(I i) { // 인터페이스 I를 구현한 놈들만 들어와라
    i.method();
  }
}// end A

// B클래스의 선언과 구현을 분리
interface I {
  public void method();
}// end I

class B implements I { // interface I를 구현한 B class
  public void method() {
    System.out.println("B클래스의 메서드");
  }
}// end B

class C implements I { // interface I를 구현한 C class
  public void method() {
    System.out.println("C클래스의 메서드");
  }
}// end C

public class Ex6_11 {
  public static void main(String[] args) {
    A a = new A();
    // interface I를 사용함으로 더이상 A 클래스의 내용을 변경하지 않고 다른 클래스의 메서드를 사용할 수 있음
    a.method(new B()); // A가 B를 사용(의존)
    a.method(new C()); // A가 C를 사용(의존), A클래스 안에 a.method의 매개변수 B를 C로 변경해주어야 한다.
  }// end main
}// end Ex6_11
