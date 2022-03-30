package Q10;

import java.util.*;
import java.text.*;

public class Q10_2 {
  public static void main(String[] args) {
    String pattern = "yyyy/MM/dd"; // 날짜 형식을 패턴으로 저장
    String pattern2 = "입력하신 날짜는 E요일입니다."; // 'E'는 일~토 중의 하나가 된다.

    DateFormat df = new SimpleDateFormat(pattern);
    DateFormat df2 = new SimpleDateFormat(pattern2);

    Scanner s = new Scanner(System.in);

    Date inDate = null;

    do {
      System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요. (입력예:2017/05/11)");
      System.out.print(">> ");
      try {
        inDate = df.parse(s.nextLine()); // 입력받은 날짜를 Date로 변환한다.
        break;
      } catch (Exception e) {
      } // end try-catch
    } while (true);
    System.out.println(df2.format(inDate));
  }// end main
}// end Q10_2
