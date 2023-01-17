import java.util.Objects;

public class Ex7_4 {
  public static void main(String[] args) {
    Value v1 = new Value(10);
    Value v2 = new Value(10);

    if (v1.equals(v2)) {
      System.out.println("v1과 v2는 같습니다.");
    } else {
      System.out.println("v1과 v2는 다릅니다.");
    } // end if

    System.out.println(v1.hashCode());
    System.out.println(v2.hashCode());
  }// end main
}// end Ex7_4

class Value {
  int value;

  Value(int value) {
    this.value = value;
  }

  public int hashCode() {
    return Objects.hash(value);
  }

  // Object의 equals()를 오버라이딩해서 주소가 아닌 value를 비교
  public boolean equals(Object obj) {
    // return this == obj; // 주소비교, 서로 다른 객체는 항상 거짓
    // 참조변수의 형변환 전에는 반드시 instanceof로 확인 해야함.
    if (!(obj instanceof Value)) {
      return false;
    }
    Value v = (Value) obj; // obj를 Value로 형변환
    return this.value == v.value;
  }
}// end Value