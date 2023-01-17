package proxy;

public class ScreenDisplay implements Display {

  @Override
  public void print(String content) {
    try {
      Thread.sleep(500); // 출력을 위한 준비 작업
    } catch (InterruptedException e) {
      e.printStackTrace();
    } // try-catch

    System.out.println(content);
  }// print

}// ScreenDisplay
