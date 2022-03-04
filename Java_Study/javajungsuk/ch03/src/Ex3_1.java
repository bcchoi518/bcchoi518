import java.util.Scanner;

public class Ex3_1 {
    public static void main(String[] args) {
        int score = 0;
        char grade = 'D', opt = '0';

        System.out.print("점수를 입력하세요 : ");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            }
        } else if (score >= 70) {
            grade = 'C';
            if (score >= 78) {
                opt = '+';
            } else if (score < 74) {
                opt = '-';
            } // end if
        } // end if
          // else { // 초기값을 D로 초기화 했기 때문에 else문이 필요없다. 이렇게 코드를 간편하게 할 수 있다.
          // grade = 'D';
          // }
        System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
    }// end main
}// end class
