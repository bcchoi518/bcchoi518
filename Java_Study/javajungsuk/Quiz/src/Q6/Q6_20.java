package Q6;

public class Q6_20 {
  public static int max(int[] arr) {
    // 주어진 배열이 null이거나 크기가 0인 경우 -999999 반환
    if (arr == null || arr.length == 0) {
      return -999999;
    } // end if
    int max = arr[0]; // 배열의 첫 번재 값으로 최대값을 초기화 한다.
    for (int i = 1; i < arr.length; i++) { // 배열의 두 번재 값부터 비교한다.
      if (max < arr[i]) {
        max = arr[i];
      } // end if
    } // end for
    return max;
  }// end max

  public static void main(String[] args) {
    int[] arr = { 5, 2, 4, 6, 8, 3 };
    System.out.println(java.util.Arrays.toString(arr));
    System.out.println("최대값:" + max(arr));
    System.out.println("최대값:" + max(null));
    System.out.println("최대값:" + max(new int[] {})); // 크기가 0인 배열
  }// end main
}// end Q6_20
