import java.util.*;

public class Ex3_7 {
    public static void main(String[] args) {

        int input = 0, answer = 0;
        Scanner scanner = new Scanner(System.in); // 사용자로부터 입력을 받기 위해 Scanner class의 객체를 생성

        answer = (int) (Math.random() * 100) + 1; // 1 ~ 100 난수 생성

        do {
            System.out.print("1부터 100사이의 정수를 입력하세요. : ");
            input = scanner.nextInt(); // 사용자로부터 정수를 입력받아 input에 저장

            if (input < answer) {
                System.out.println("더 큰 수로 다시 시도해보세요.");
            } else if (input > answer) {
                System.out.println("더 작은 수로 다시 시도해보세요.");
            }
        } while (input != answer);
        System.out.println("정답입니다.");
    }
}
