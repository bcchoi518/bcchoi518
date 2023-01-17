public class Ex6_13 {
  class InstanceInner {
    int iv = 100;
    static int cv = 100; // 에러! static변수를 선언할 수 없다. (에러가 안남?)
    final static int CONST = 100; // final static은 상수이므로 허용
  }// end InstanceInner

  static class StaticInner {
    int iv = 200;
    static int cv = 200; // static 클래스만 static멤버를 정의할 수 있다.
  }// end StaticInner

  void myMethod() {
    class LocalInner {
      int iv = 300;
      static int cv = 300; // 에러! static 변수를 선언할 수 없다. (에러가 안남?)
      final static int CONST = 300; // final static은 상수이므로 허용
    }// end LocalInner
    int i = LocalInner.CONST; // OK
  }// end myMethod

  public static void main(String[] args) {
    Ex6_13 outer = new Ex6_13(); // 외부클래스의 객체 생성을 먼저 하고
    InstanceInner ii = outer.new InstanceInner(); // 외부 클래스를 참조한 내부 클래스의 객체 생성을 정의해줘야 한다.
    System.out.println(ii.iv); // static method에서 instance inner class의 iv값에 접근
    System.out.println(InstanceInner.cv); // 정상 출력이 됨?
    System.out.println(InstanceInner.CONST);
    Ex6_13.StaticInner si = new Ex6_13.StaticInner(); // 외부 클래스를 참조한 내부 static 클래스의 객체 생성을 정의
    System.out.println(si.iv); // static method에서 static inner class의 iv값에 접근
    System.out.println(StaticInner.cv);
    // System.out.println(LocalInner.CONST); // 지역 내부 클래스의 static 상수는 메서드 내에서만 사용가능
  }// end main
}// end Ex6_13
