import java.util.Scanner;

public class Ex3_6 {
    public static void main(String[] args) {

        int num = 0, sum = 0;
        Scanner scanner = new Scanner(System.in); // 화면으로부터 입력을 받기위해 Scanner Class의 객체를 생성

        System.out.print("숫자를 입력하세요. : ");
        // String tmp = scanner.nextLine(); // 문자열타입의 tmp변수에 입력받은 한줄을 다 저장
        // num = Integer.parseInt(tmp); // tmp에 입력받은 문자열을 int 타입으로 변환하여 num에 저장

        num = scanner.nextInt(); // 화면으로부터 숫자를 입력받아 num에 저장

        while (num != 0) {
            sum += num % 10;
            System.out.println("sum = " + sum + ", num = " + num);
            num /= 10;
        }
        System.out.println("각 자리수의 합 : " + sum);
    }
}
