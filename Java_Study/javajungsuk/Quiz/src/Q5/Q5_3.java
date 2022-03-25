package Q5;

public class Q5_3 {
  public static void main(String[] args) {
    int[] arr = { 10, 20, 30, 40, 50 };
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    } // end for
    System.out.println("배열의 모든 값을 더하면 " + sum + "입니다.");
  }// end main
}// end Q5_3