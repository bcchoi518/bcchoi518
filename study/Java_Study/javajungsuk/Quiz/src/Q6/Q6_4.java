package Q6;

public class Q6_4 {
  // 두점(x, y)와 (x1, y1)간의 거리를 구한다.
  static double getDistance(int x, int y, int x1, int y1) { // 메서드 내 인스턴스 변수를 사용하지 않으므로 static으로 선언 가능
    return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1)); // x, y는 지역변수
    // Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2));
  }

  public static void main(String[] args) {
    System.out.println(getDistance(1, 1, 2, 2));
  }// end main
}// end Q6_4
