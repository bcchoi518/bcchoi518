public class Ex6_14 {
  private int outerIv = 0;
  private static int outerCv = 0;

  class InstanceInner2 {
    int iiv = outerIv; // 외부 클래스의 private멤버도 접근가능하다.
    int iiv2 = outerCv;
  }// end InstanceInner2

  static class StaticInner2 {
    // 스태틱 클래스는 외부 클래스의 인스턴스 멤버에 접근할 수 없다.
    // int siv = outerIv; // 에러!
    static int scv = outerCv;
  }// end StaticInner2

  void myMethod2() {
    int lv = 0; // jdk1.8부터 값이 바뀌지 않는 변수는 상수로 간주
    final int LV = 0; // jdk1.8 부터 final 생략 가능

    class LocalInner2 {
      int liv = outerIv;
      int liv2 = outerCv;
      // 외부 클래스의 지역변수는 final이 붙은 변수(상수)만 접근가능하다.
      int liv3 = lv; // 에러!!! (jdk1.8부터 에러 아님)
      int liv4 = LV; // OK
    }// end LocalInner2
  }// end myMethod2
}// end Ex6_14
