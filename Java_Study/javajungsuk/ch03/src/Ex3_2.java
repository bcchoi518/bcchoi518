import java.util.Scanner;

public class Ex3_2 {
    public static void main(String[] args) {
        System.out.print("현재 월을 입력하세요. > "); // 문자열 출력
        Scanner scanner = new Scanner(System.in); // 사용자로부터 입력받기 위해 Scanner class의 Scanner 객체 생성
        int month = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 month에 저장

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("현재의 계절은 봄입니다.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("현재의 계절은 여름입니다.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("현재의 계절은 가을입니다.");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("현재의 계절은 겨울입니다.");
                break;
        }// end switch
    }// end main
}// end class
