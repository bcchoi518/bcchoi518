package Q4;

public class Q4_9 {
  public static void main(String[] args) {
    int num = 12345;
    int sum = 0;

    while (num > 0) {
      sum += num % 10;
      num /= 10;
    } // end while
    System.out.println("sum = " + sum);
  }// end main
}// end Q4_9
