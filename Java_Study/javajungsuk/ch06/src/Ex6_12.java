class AAA { // AAA는 BBB의 외부 클래스
  int i = 100;
  BBB b = new BBB();

  class BBB { // BBB는 AAA의 내부 클래스
    void method() {
      // AAA a = new AAA();
      // System.out.println(a.i);
      System.out.println(i); // 객체 생성없이 외부 클래스의 멤버 접근가능
    }
  }
}

// class CCC {
// BBB b = new BBB(); // BBB는 AAA 내부 클래스 이므로 접근 불가
// }

public class Ex6_12 {
  public static void main(String[] args) {
    // BBB b = new BBB(); // BBB class는 더이상 독립적이지 않기 때문에 바로 생성 불가능
    // b.method();
  }
}
