package Q6;

import java.util.Arrays;

public class Q6_17 {
  public static int[] shuffle(int[] arr) {
    // ※매개변수로 어떤 값이 넘어올지 모르기 때문에 작업을 시작하기 전에 값의 유효성체크는 반드시 해야한다※
    if (arr == null || arr.length == 0) {
      return arr;
    } // end if
    for (int i = 0; i < arr.length; i++) {
      int j = (int) (Math.random() * arr.length);
      int tmp = 0;
      tmp = arr[i];
      arr[i] = arr[j];
      arr[j] = tmp;
    } // end for
    return arr;
  }// end shuffle

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
    System.out.println(arr.length);
    System.out.println("before: " + Arrays.toString(arr));
    shuffle(arr);
    System.out.println("after: " + Arrays.toString(arr));
  }// end main
}// end Q6_17
