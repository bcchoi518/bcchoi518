import java.util.*;

public class Ex4_13 {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4 };
        int[][] arr2D = { { 11, 12 }, { 21, 22 } };

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr2D));

        String[][] str2D = { { "aaa", "bbb" }, { "AAA", "BBB" } };
        String[][] str2D2 = { { "aaa", "bbb" }, { "AAA", "BBB" } };

        System.out.println(Arrays.deepEquals(str2D, str2D2));

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = Arrays.copyOfRange(arr, 2, 4);
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = { 5, 1, 3, 6, 8, 2 };
        Arrays.sort(arr4);
        System.out.println(Arrays.toString(arr4));
    }// end main
}// end class
