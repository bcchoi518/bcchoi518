package singleton;

public class King {
  private static King self; // 자기 자신을 static 영역에 할당

  private King() { // 생성자를 숨기고
  }

  public synchronized static King getInstance() { // King 클래스를 인스턴스화 하는 메소드
    if (self == null) {
      self = new King();
    } // if
    return self;
  }// getInstance

  public void say() {
    System.out.println("I am only one..");
  }// say
}// King
