package Q6;

public class Q6_21 {
  public static int abs(int value) {
    // return Math.abs(value);
    return value >= 0 ? value : -value;
  }// end abs

  public static void main(String[] args) {
    int value = 5;
    System.out.println(value + "의 절대값:" + abs(value));
    value = -10;
    System.out.println(value + "의 절대값:" + abs(value));
  }// end main
}// end Q6_21
