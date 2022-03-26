package Q6;

class MyTv {
  boolean isPowerOn;
  int channel;
  int volume;

  final int MAX_VOLUME = 100;
  final int MIN_VOLUME = 0;
  final int MAX_CHANNEL = 100;
  final int MIN_CHANNEL = 1;

  void turnOnOff() {
    // isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
    isPowerOn = !isPowerOn;
  }// end turnOnOff

  void channelUp() {
    // 만일 channel이 MAX_CHANNEL이면, channel의 값을 MIN_CHANNEL로 바꾼다.
    if (channel == MAX_CHANNEL) {
      channel = MIN_CHANNEL;
    } else {
      channel++;
    } // end if
  }// end channelUp

  void channelDown() {
    // 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.
    if (channel == MIN_CHANNEL) {
      channel = MAX_CHANNEL;
    } else {
      channel--;
    } // end if
  }// end channelDown

  void volumeUp() {
    if (volume == MAX_VOLUME) {
      System.out.println("현재 volume이 최대 volume입니다.");
    } else {
      volume++;
    } // end if
  }// end volumeUp

  void volumeDown() {
    if (volume == MIN_VOLUME) {
      System.out.println("현재 volume이 최소 volume입니다.");
    } else {
      volume--;
    } // end if
  }// end volumeDown
}// end MyTv

public class Q6_19 {
  public static void main(String[] args) {
    MyTv t = new MyTv();
    t.channel = 100;
    t.volume = 0;
    System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
    System.out.println();
    t.volume = 100;
    System.out.println("channel=100, volume=100 설정 후 둘다 UP");
    t.channelUp();
    t.volumeUp();
    System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
    System.out.println();
    t.volume = 0;
    System.out.println("volume=0 재설정 후 둘다 DOWN");
    t.channelDown();
    t.volumeDown();
    System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
  }// end main
}// end Q6_19
