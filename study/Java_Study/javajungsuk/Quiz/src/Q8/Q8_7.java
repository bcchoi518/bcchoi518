package Q8;

import java.util.*;

public class Q8_7 {
  public static void main(String[] args) {
    int quizNum = 0;
    int answer = 0;
    int count = 0;

    quizNum = (int) (Math.random() * 100) + 1;

    while (true) {
      count++;
      System.out.print("컴퓨터가 생각한 값은 무엇일까요 ? (1~100사이) >> ");
      // while 밖에서 Scanner 인스턴스를 생성하면 catch안의 출력내용이 예외처리 후 다시 입력으로 들어가서 무한 반복에 빠짐
      Scanner scanner = new Scanner(System.in);
      // 사용자로부터 값을 입력받는 경우에는 유효성검사를 철저하게 해야 한다.
      try {
        answer = scanner.nextInt(); // try-catch로 감싸서 예외처리를 할 수 있도록 함
      } catch (Exception e) { // InputMismatchException 발생 예외 처리 위한 catch문
        System.out.printf("잘못 입력하셨습니다. 1~100사이의 숫자를 입력해 주세요^^%n%n");
        continue; // try-catch 다음에 문장이 없으면 continue 없어도 됨
      } // end try-catch
      if (answer < quizNum) {
        System.out.printf("아쉬워요~ 더 높은 수로 다시 도전해 보세요.%n%n");
      } else if (answer > quizNum) {
        System.out.printf("아쉬워요~ 더 낮은 수로 다시 도전해 보세요.%n%n");
      } else {
        System.out.println("WoW~ 정답입니다 !!! " + count + "번 만에 맞추셨어요!");
        break;
      } // end if
    } // end while
  }// end main
}// end Q8_7