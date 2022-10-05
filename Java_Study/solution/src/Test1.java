import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] intArr = {1, 0, 2, 2, 0, 1, 2, 1, 0};
        sortColors(intArr);
//        System.out.println("index: "+ a);
        System.out.println(Arrays.toString(intArr));

    }//main

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int pivot = (left + right) / 2;
            if (nums[pivot] == target) {
                return pivot;
            } else if (nums[pivot] < target) {
                left = pivot + 1;
            } else {
                right = pivot - 1;
            }//if
        }//while
        return -1;
    }//binarySearch

    public static void moveZeros(int[] nums) {
        int wIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[wIdx];
                nums[wIdx] = temp;
                wIdx++;
            }//if
        }//for
    }//moveZeros

    public static int findPivot(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int leftSum = 0;
        int rightSum = sum;

        int pastPivotNum = 0;
        for (int i = 0; i < nums.length; i ++) {
            int num = nums[i];
            rightSum -= num;
            leftSum += pastPivotNum;

            if (leftSum == rightSum) {
                return i;
            }//if
            pastPivotNum = num;
        }//for
        return -1;
    }//findPivot

    public static void sortColors(int[] nums) {
        int idx0 = 0;
        int idx2 = nums.length - 1;
        int i = 0;

        while (i <= idx2) {
            if (nums[i] == 0) {
                int tmp = nums[i];
                nums[i] = nums[idx0];
                nums[idx0] = tmp;
                idx0++;
                i++;
            } else if (nums[i] == 2) {
                int tmp = nums[i];
                nums[i] = nums[idx2];
                nums[idx2] = tmp;
                idx2--;
            } else { //nums[i] == 1
                i++;
            }//if
        }//while
    }//sortColors
}//Test1
