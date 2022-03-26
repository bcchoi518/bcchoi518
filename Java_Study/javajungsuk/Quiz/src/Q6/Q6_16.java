package Q6;

public class Q6_16 {
  public static void change(String str) {
    str += "456";
  }

  public static void main(String[] args) {
    String str = "ABC123";
    System.out.println(str);
    change(str);
    System.out.println("After change: " + str);
  }
}
// 1. 문자열을 참조변수 str에 저장한 다음 메서드 change를 호출하면서 참조변수 str을 넘겨준다.
// 2. 메서드 change의 지역에 변수 str의 주소값이 저장되어 메서드 change의 지역 변수도 문자열을 참조하게 된다.
// 3. 메서드 change에서 넘겨 받은 문자열의 뒤에 "456"을 붙인다.
// ※문자열은 내용을 변경 할 수 없기 때문에 덧셈연산을 하면 새로운 문자열이 생성되고 주소가 메서드 change의 지역변수에 저장된다.
// 4. change 메서드가 종료되고 작업에 사용하던 메모리를 반환하므로 change 메서드내 지역변수도 메모리에서 제거된다.
// 5. main 메서드로 돌아와서 문자열 str 값을 출력하면 처음의 값과 변함없는 값이 출력된다.
// 6. 문자열 "ABC123456"은 참조하는 변수가 하나도 없으므로 적절한 시기에 garbage collector에 의해 제거된다
// ※매개변수가 참조형이기 때문에 main 메서드의 문자열이 변경될 것이라고 쉽게 생각 할 수 있으므로 실수하지 않도록 주의해야한다!!!!