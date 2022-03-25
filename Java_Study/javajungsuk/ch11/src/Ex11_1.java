public class Ex11_1 {
  public static void main(String[] args) {
    // ??? obj = (a, b) -> a > b ? a : b; // 람다식. 익명객체
    // Object obj = new Object() { // 익명 객체(Java에서는 method만 존재할 수 없기 떄문에 익명객체 안에 넣어서
    // 표현)
    // int max(int a, int b) { // method
    // return a > b ? a : b;
    // }
    // };

    // int value = obj.max(3, 5); // Object안에 max가 없음(함수형 인터페이스 필요)

    MyFunction2 f = new MyFunction2() {
      public int max(int a, int b) { // 오버라이딩 - 접근제어자는 좁게 못바꾼다.
        return a > b ? a : b;
      }
    };
    // 람다식(익명객체)을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다.
    MyFunction2 f2 = (a, b) -> a > b ? a : b; // 람다식. 익명객체

    int value = f.max(3, 5);
    int value2 = f2.max(3, 5);

    System.out.println("value : " + value);
    System.out.println("value2 : " + value2);
  }// end main
}// end Ex11_1

@FunctionalInterface // 함수형 인터페이스는 단 하나의 추상 메서드만 가져야함.
interface MyFunction2 {
  public abstract int max(int a, int b);
}// end MyFunction2