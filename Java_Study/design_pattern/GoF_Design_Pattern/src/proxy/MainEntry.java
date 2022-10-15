package proxy;

public class MainEntry {
  public static void main(String[] args) {
    // Display display = new ScreenDisplay();
    Display display = new BufferDisplay(5);

    display.print("안녕하세요.");
    display.print("GIS 디벨로퍼 김형준입니다.");
    display.print("소프트웨어 설계를 위한 디자인패턴은");
    display.print("이해하기 난해한 부분도 있지만..");
    display.print("이해하고 개발에 적용을 하면");
    display.print("큰 규모의 소프트웨어 개발에 큰 도움이 됩니다.");
    display.print("또한 유지보수와 기능확장에도 매우 도움이 됩니다.");

    ((BufferDisplay) display).flush();
  }// main
}// MainEntry