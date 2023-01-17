import java.util.*;

public class Ex3_5 {
    public static void main(String[] args) {

        System.out.print("마름모의 세로 길이를 입력하시오. : ");
        Scanner scanner = new Scanner(System.in); // 화면으로부터 입력받기위해 Scanner 클래스 객체 생성
        int num = scanner.nextInt(); // 화면으로부터 숫자를 입력받음
        int n = num / 2;
        for (int i = -(n); i <= n + 1; i++) {
            for (int k = 0; k <= Math.abs(i) - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= (n - Math.abs(i)) * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
