public class Ex4_5 {
    public static void main(String[] args) {
        int[] score = { 79, 88, 91, 33, 100, 55, 95 };

        int max = score[0]; // 배열의 첫 번째 값으로 최대값을 초기화 한다.
        int min = score[0]; // 배열의 첫 번째 값으로 최소값을 초기화 한다.
        // 배열 전체를 순회할때 배열이름.length까지 반복문
        for (int i = 1; i < score.length; i++) {
            if (max < score[i]) {
                max = score[i];
            } else if (min > score[i]) {
                min = score[i];
            } // end if
        } // end for

        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    } // end main
} // end class
