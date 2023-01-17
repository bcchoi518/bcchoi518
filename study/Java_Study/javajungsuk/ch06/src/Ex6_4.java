public class Ex6_4 {
  public static void main(String[] args) {

    Child c = new Child();
    c.method();

  }// end main
}// end Ex6_4

class Parent {
  int x = 10; /* super.x */ // super : 조상의 멤버를 자신의 멤버와 구별할 때 사용
}// end Parent

class Child extends Parent {
  // 부모 클래스와 자식 클래스에 변수 중복 선언 가능
  int x = 20; /* this.x */ // this : 인스턴스 메서드(생성자) 내에만 존재, iv와 lv를 구별할 때 사용

  void method() {
    System.out.println("x = " + x);
    System.out.println("this.x = " + this.x);
    System.out.println("super.x = " + super.x);
  }
}// end Child