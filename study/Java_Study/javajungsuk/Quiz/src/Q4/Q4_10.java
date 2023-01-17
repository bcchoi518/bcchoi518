package Q4;

import java.util.*;

public class Q4_10 {
  public static void main(String[] args) {
    int quizNum = 0;
    int answer = 0;
    int count = 0;

    Scanner scanner = new Scanner(System.in);

    quizNum = (int) (Math.random() * 100) + 1;

    while (true) {
      count++;
      System.out.print("컴퓨터가 생각한 값은 무엇일까요 ? (1~100사이) >> ");
      answer = scanner.nextInt();
      if (answer < quizNum) {
        System.out.println("아쉬워요~ 더 높은 수로 다시 도전해 보세요.");
        System.out.println();
      } else if (answer > quizNum) {
        System.out.println("아쉬워요~ 더 낮은 수로 다시 도전해 보세요.");
        System.out.println();
      } else {
        System.out.println("WoW~ 정답입니다 !!! " + count + "번 만에 맞추셨어요!");
        break;
      } // end if
    } // end while
    scanner.close();
  }// end main
}// end Q4_10
