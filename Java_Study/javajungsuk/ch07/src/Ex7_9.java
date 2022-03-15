import java.util.*;

public class Ex7_9 {
  static int getDayDiff(String yyyymmdd1, String yyyymmdd2) {
    int diff = 0;
    try {
      int year1 = Integer.parseInt(yyyymmdd1.substring(0, 4));
      int month1 = Integer.parseInt(yyyymmdd1.substring(4, 6)) - 1;
      int day1 = Integer.parseInt(yyyymmdd1.substring(6, 8));
      int year2 = Integer.parseInt(yyyymmdd2.substring(0, 4));
      int month2 = Integer.parseInt(yyyymmdd2.substring(4, 6)) - 1;
      int day2 = Integer.parseInt(yyyymmdd2.substring(6, 8));
      Calendar date1 = Calendar.getInstance();
      Calendar date2 = Calendar.getInstance(); // date1과 date2에서 약간의 차이가 존재
      // 특정 날짜들 사이의 계산은 clear를 사용하여야 한다.
      date1.clear();
      date2.clear(); // 둘다 clear를 해줌으로 둘의 값의 차이를 없엔다
      date1.set(year1, month1, day1);
      date2.set(year2, month2, day2);
      diff = (int) ((date1.getTimeInMillis() - date2.getTimeInMillis()) / (24 * 60 * 60 * 1000));
    } catch (Exception e) {
      diff = 0; // substring(), parseInt()에서 예외가 발생하면 0을 반환한다.
    } // end try-catch
    return diff;
  }// end getDayDiff

  public static void main(String[] args) {
    System.out.println(getDayDiff("20220315", "20220313"));
    System.out.println(getDayDiff("20220315", "20220315"));
    System.out.println(getDayDiff("20220315", "202203"));
  }// end main
}// end Ex7_9
