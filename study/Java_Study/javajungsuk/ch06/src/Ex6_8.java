abstract class Player { // 추상 클래스
  abstract void play(int pos); // 추상 메서드

  abstract void stop(); // 추상 메서드(선언부만 있고 구현부{}가 없는 메서드)
}// end Player

// 추상 클래스는 상속을 통해 완성해야 객체 생성가능
class AudioPlayer extends Player {
  void play(int pos) {
    System.out.println(pos + "위치부터 play 합니다.");
  }// end play

  void stop() {
    System.out.println("재생을 멈춥니다.");
  }// end stop
}// end AudioPlayer

public class Ex6_8 {
  public static void main(String[] args) {
    // Player p = new Player(); // 추상 클래스의 객체를 생성 (Error)
    AudioPlayer ap = new AudioPlayer();
    ap.play(100);
    ap.stop();

    Player p = new AudioPlayer(); // 다형성
    p.play(100);
    p.stop();
  }// end main
}// end Ex6_8
