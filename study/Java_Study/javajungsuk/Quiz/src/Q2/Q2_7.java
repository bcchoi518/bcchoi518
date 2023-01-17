package Q2;

public class Q2_7 {
  public static void main(String[] args) {
    System.out.println("1" + "2"); // 문자열 12
    System.out.println(true + ""); // 문자열 true
    System.out.println('A' + 'B'); // A : 65, B : 66 이므로 131
    System.out.println('1' + 2); // '1' : 49 이므로 51
    System.out.println('1' + '2'); // '1' : 49, '2' : 50 이므로 99
    System.out.println('J' + "ava"); // 문자열 Java
    // System.out.println(true + null); // 에러
  }
}
