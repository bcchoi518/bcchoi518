import java.util.*;

public class ScanfEx1 {
    public static void main(String[] args) {
        // 키보드에서 키 하나를 입력하면 프로그램에서는 숫자로 된 키코드를 읽기 위해서 System.in의 read를 이용
        Scanner scanner = new Scanner(System.in); // 사용자로부터 입력을 받기위해 Scanner class의 scanner 생성

        // int num1 = scanner.nextInt(); // 정수타입의 변수 num1에 정수를 입력받는다
        // int num2 = scanner.nextInt(); // 정수타입의 변수 num2에 정수를 입력받는다
        // System.out.println(num1); // num1을 출력한다.
        // System.out.println(num2); // num2를 출력한다

        String input = scanner.nextLine(); // 문자열 타입의 input에 라인전체(공백포함)를 입력받는다
        int num3 = Integer.parseInt(input); // input에 저장된 문자열을 int타입으로 변환하여 정수타입의 변수 num3에 저장한다

        System.out.println(num3); // num3을 출력한다
    }
}
