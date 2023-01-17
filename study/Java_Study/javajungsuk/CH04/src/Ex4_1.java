public class Ex4_1 {
    public static void main(String[] args) throws Exception {
        // int[] score; // 배열 score를 선언(참조변수)
        // score = new int[5]; // 배열의 생성(int 저장공간 x 5)

        int[] score = new int[5]; // 배열의 선언과 생성을 동시에
        score[3] = 100; // 배열 score의 3번째 인덱스에 값 100을 저장

        System.out.println("score[0] = " + score[0]); // 배열 score의 0번째 인덱스 값 출력
        System.out.println("score[1] = " + score[1]); // 배열 score의 1번째 인덱스 값 출력
        System.out.println("score[2] = " + score[2]); // 배열 score의 2번째 인덱스 값 출력
        System.out.println("score[3] = " + score[3]); // 배열 score의 3번째 인덱스 값 출력
        System.out.println("score[4] = " + score[4]); // 배열 score의 4번째 인덱스 값 출력

        int value = score[3]; // 배열 score의 3번째 인덱스에 있는 값을 value 변수에 저장
        System.out.println("value = " + value);
    }// end main
}// end class
