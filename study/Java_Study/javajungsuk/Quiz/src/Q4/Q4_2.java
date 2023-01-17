package Q4;

public class Q4_2 {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 1; i <= 20; i++) {
      if (i % 2 != 0 && i % 3 != 0) {
        sum += i;
      } // end if
    } // end for
    System.out.println("sum = " + sum);
  }// end main
}// end Q4_2
