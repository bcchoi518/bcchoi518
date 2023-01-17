class Point {
  int x;
  int y;
}// end Point

// class Circle extends Point { // 상속관계
// int r;
// }// end Circle

class Circle { // 포함관계
  Point p = new Point();
  int r;

  // 주의 (선언만 하면 생성자에서 초기화를 꼭 해준다)
  // Point p; // 선언
  // Circle() { // 생성자 초기화
  // p = new Point();
  // }
}// end Circle

public class Ex6_2 {
  public static void main(String[] args) {

    Circle c = new Circle();

    // c.x = 1;
    // c.y = 2;
    // c.r = 3;

    // System.out.println("c.x = " + c.x);
    // System.out.println("c.y = " + c.y);
    // System.out.println("c.r = " + c.r);

    c.p.x = 1;
    c.p.y = 2;
    c.r = 3;

    System.out.println("c.p.x = " + c.p.x);
    System.out.println("c.p.y = " + c.p.y);
    System.out.println("c.r = " + c.r);
  }
}
