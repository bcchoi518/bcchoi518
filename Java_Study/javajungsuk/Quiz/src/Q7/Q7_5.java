package Q7;

class MyTv1 {
  private boolean isPowerOn;
  private int channel;
  private int volume;
  private int prevChannel;

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
      prevChannel = channel++;
    } // end if
  }// end channelUp

  void channelDown() {
    // 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.
    if (channel == MIN_CHANNEL) {
      channel = MAX_CHANNEL;
    } else {
      prevChannel = channel--;
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

  public void setVolume(int volume) {
    if (MIN_VOLUME > volume && volume > MAX_VOLUME) {
      return;
    }
    this.volume = volume;
  }

  public int getVolume() {
    return volume;
  }

  public void setChannel(int channel) {
    if (MIN_CHANNEL > channel && channel > MAX_CHANNEL) {
      return;
    }
    prevChannel = this.channel; // 현재 체널을 이전 채널에 저장한다.
    this.channel = channel;
  }

  public int getChannel() {
    return channel;
  }

  public void gotoPrevChannel() {
    setChannel(prevChannel); // 현재 체널을 이전 채널로 변경한다.
  }
}// end MyTv1

public class Q7_5 {
  public static void main(String[] args) {
    MyTv1 t = new MyTv1();

    t.setChannel(10);
    System.out.println("CH Set 10");
    System.out.println("CH:" + t.getChannel());
    t.setChannel(20);
    System.out.println("CH Set 20");
    System.out.println("CH:" + t.getChannel());
    t.gotoPrevChannel();
    System.out.println("prev CH");
    System.out.println("CH:" + t.getChannel());
    t.gotoPrevChannel();
    System.out.println("prev CH");
    System.out.println("CH:" + t.getChannel());
    t.channelUp();
    t.channelUp();
    System.out.println("CH Up Up");
    System.out.println("CH:" + t.getChannel());
    t.gotoPrevChannel();
    System.out.println("prev CH");
    System.out.println("CH:" + t.getChannel());
    t.gotoPrevChannel();
    System.out.println("prev CH");
    System.out.println("CH:" + t.getChannel());
    t.channelDown();
    t.channelDown();
    System.out.println("CH Down Down");
    System.out.println("CH:" + t.getChannel());
    t.gotoPrevChannel();
    System.out.println("prev CH");
    System.out.println("CH:" + t.getChannel());
    t.gotoPrevChannel();
    System.out.println("prev CH");
    System.out.println("CH:" + t.getChannel());
  }// end main
}// end Q7_5