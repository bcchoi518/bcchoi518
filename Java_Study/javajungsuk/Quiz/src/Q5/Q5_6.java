package Q5;

import java.util.*;

public class Q5_6 {
  public static void main(String[] args) {
    String[] words = { "television", "computer", "mouse", "phone" };

    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < words.length; i++) {
      char[] question = words[i].toCharArray(); // String을 char[]로 변환

      for (int j = 0; j < question.length; j++) {
        int k = (int) (Math.random() * question.length);
        char tmp = question[j];
        question[j] = question[k];
        question[k] = tmp;
      } // end for

      // char[]인 question을 String 객체로 생성하여 출력
      System.out.printf("Q%d. %s의 정답을 입력하세요. > ", i + 1, new String(question));
      String answer = scanner.nextLine();

      // trim()으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
      if (words[i].equals(answer.trim())) {
        System.out.printf("맞았습니다 !!%n%n");
      } else {
        System.out.printf("틀렸습니다..ㅜㅜ%n%n");
      } // end if
    } // end for
    scanner.close();
  }// end main
}// end Q5_6
