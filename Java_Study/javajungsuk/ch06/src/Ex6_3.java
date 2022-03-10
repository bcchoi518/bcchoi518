class MyPoint {
  int x;
  int y;

  MyPoint() { // 기본 생성자 작성 필수!!
  }

  MyPoint(int x, int y) {
    this.x = x;
    this.y = y;
  }

  String getLocation() {
    return "x: " + x + ", y: " + y;
  }
}// end MyPoint

class MyPoint3D extends MyPoint {
  int z;

  MyPoint3D() {
  }

  MyPoint3D(int x, int y, int z) {
    super(x, y); // 조상의 멤버는 super()로 초기화
    this.z = z;
  }

  // 조상의 getLocation()을 오버라이딩
  String getLocation() {
    return "x: " + x + ", y: " + y + ", z: " + z;
  }
}// end MyPoint3D

public class Ex6_3 {
  public static void main(String[] args) {
    MyPoint3D p = new MyPoint3D(3, 5, 7);

    System.out.println(p.getLocation());
  }// end main
}// end Ex6_3
