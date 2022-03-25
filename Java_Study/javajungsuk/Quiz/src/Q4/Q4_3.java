package Q4;

public class Q4_3 {
  public static void main(String[] args) {

    // 나의 풀이
    // int sum = 0;
    // for (int i = 1; i <= 10; i++) {
    // for (int j = 1; j <= i; j++) {
    // sum += j;
    // } // end for
    // } // end for
    // System.out.println(sum);

    // 해답
    int sum = 0;
    int totalSum = 0;
    for (int i = 1; i <= 10; i++) {
      sum += i;
      totalSum += sum;
    } // end for
    System.out.println(totalSum);
  }// end main
}// end Q4_3
