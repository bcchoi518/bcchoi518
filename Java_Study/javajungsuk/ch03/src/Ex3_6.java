import java.util.Scanner;

public class Ex3_6 {
    public static void main(String[] args) {

        int num = 0, sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요. : ");
        // String tmp = scanner.nextLine();
        // num = Integer.parseInt(tmp);

        num = scanner.nextInt();

        while (num != 0) {
            sum += num % 10;
            System.out.println("sum = " + sum + ", num = " + num);
            num /= 10;
        }
        System.out.println("각 자리수의 합 : " + sum);
    }
}
