import java.util.*;

public class Ex3_9 {
    public static void main(String[] args) {

        int menu = 0, num = 0;
        Scanner scanner = new Scanner(System.in); // 사용자로부터 입력받기위해 Scanner class의 객체를 생성

        outer: // while문에 outer라는 이름을 붙인다.
        while (true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.print("원하는 메뉴(1~3)를 선택하세요. (종료:0) : ");

            String temp = scanner.nextLine();
            menu = Integer.parseInt(temp);

            if (menu == 0) {
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("메뉴를 잘못 선택하셨습니다. (종료:0)");
                continue;
            } // end if

            for (;;) {
                System.out.print("계산할 값을 입력하세요.(계산종료:0, 전체 종료:99) : ");
                temp = scanner.nextLine();
                num = Integer.parseInt(temp);

                if (num == 0) {
                    break; // 계산 종료. for문을 벗어난다.
                } else if (num == 99) {
                    break outer; // 전체 종료. for문과 while문을 모두 벗어난다.
                } // end if

                switch (menu) {
                    case 1:
                        System.out.println("result = " + num * num);
                        break;
                    case 2:
                        System.out.println("result = " + Math.sqrt(num));
                        break;
                    case 3:
                        System.out.println("result = " + Math.log(num));
                        break;
                }// end switch
            } // end for
        } // end while
        System.out.println("프로그램이 종료되었습니다.");
    }// end main
}// end class
