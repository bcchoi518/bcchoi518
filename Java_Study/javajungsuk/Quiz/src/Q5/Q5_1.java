package Q5;

import java.util.Arrays;

public class Q5_1 {
  public static void main(String[] args) {
    int[] arr1[]; // 배열 선언
    int[] arr2 = { 1, 2, 3, }; // 배열 선언 및 초기화(마지막 쉼포(,)는 있어도 상관없음)
    int[] arr3 = new int[3]; // 배열 선언 및 객체 생성
    // int[] arr4 = new int[5] { 1, 2, 3, 4, 5 }; // 에러. 두 번째 대괄호에 숫자 넣으면 안됨
    // int arr5[5]; // 에러. 배열을 선언할 때는 배열의 크기를 지정할 수 없음.
    int[] arr6[] = new int[3][]; // 이중 배열 선언 및 객체 생성

    System.out.println(Arrays.toString(arr2));

    for (int i = 0; i < arr2.length; i++) {
      System.out.println(arr2[i]);
    } // end for
  }// end main
}// end Q5_1
