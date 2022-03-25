class Time {
  private int hour; // 0~23 값을 가져야 함
  private int minute; // 0~59
  private int second; // 0~59

  public void setHour(int hour) {
    if (isNotValidHour(hour)) {
      return;
    } // end if

    this.hour = hour; // private 변수에 메서드로 통해서 접근
  }// end setHour

  // 매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드
  private boolean isNotValidHour(int hour) {
    return hour < 0 || hour > 23;
  }// end isNotValidHour

  public int getHour() {
    return hour;
  }// end getHour

  public void setMinute(int minute) {
    if (isNotValidMinute(minute)) {
      return;
    } // end if

    this.minute = minute;
  }// end setMinute

  // 매개변수로 넘겨진 minute가 유효한지 확인해서 알려주는 메서드
  private boolean isNotValidMinute(int minute) {
    return minute < 0 || minute > 59;
  }// end isNotValidMinute

  public int getMinute() {
    return minute;
  }// end getMinute

  public void setSecond(int second) {
    if (isNotValidSecond(second)) {
      return;
    } // end if

    this.second = second;
  }// end setSecond

  // 매개변수로 넘겨진 second가 유효한지 확인해서 알려주는 메서드
  private boolean isNotValidSecond(int second) {
    return second < 0 || second > 59;
  }// end isNotValidSecond

  public int getSecond() {
    return second;
  }// end getSecond
}// end Time

public class Ex6_5 {
  public static void main(String[] args) {
    Time t = new Time();
    t.setHour(100);
    System.out.println(t.getHour());
    t.setHour(21);
    System.out.print(t.getHour() + " : ");
    t.setMinute(34);
    System.out.print(t.getMinute() + " : ");
    t.setSecond(55);
    System.out.print(t.getSecond());
  }// end main
}// end Ex6_5
