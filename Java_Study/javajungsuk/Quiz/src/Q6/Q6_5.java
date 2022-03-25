package Q6;

class PlayingCard {
  int kind; // iv(인스턴스 변수)
  int num; // iv(인스턴스 변수)

  static int width; // cv(클래스 변수, static 변수)
  static int height; // cv(클래스 변수, static 변수)

  PlayingCard(int k, int n) {
    kind = k; // lv(지역변수)
    num = n; // lv(지역변수)
  }
}

public class Q6_5 {
  public static void main(String[] args) { // args : lv(지역변수)
    PlayingCard card = new PlayingCard(1, 1); // card : lv(지역변수)
  }
}
