package Q6;

class MyPoint {
  int x;
  int y;

  MyPoint() {
  }

  MyPoint(int x, int y) {
    this.x = x;
    this.y = y;
  }

  double getDistance(int x, int y) {
    return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
  }
}// end MyPoint

public class Q6_6 {
  public static void main(String[] args) {
    MyPoint mp1 = new MyPoint(1, 1);
    MyPoint mp2 = new MyPoint(2, 2);

    System.out.println(mp1.getDistance(mp2.x, mp2.y));
  }// end main
}// end Q6_6
