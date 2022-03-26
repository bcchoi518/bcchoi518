package Q6;

public class Q6_18 {
  public static boolean isNumber(String str) {

    if (str == null || str.equals("")) { // 문자열의 내용 비교는 equals() 사용
      return false;
    }
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) < '0' || '9' < str.charAt(i)) {
        return false;
      } // end if
    } // end for
    return true;
  }// end isNumber

  public static void main(String[] args) {
    String s1 = "12345";
    String s2 = "123abc";
    String s3 = "213ABC";
    String s4 = "";
    String s5 = null;

    System.out.println(s1 + "는 숫자입니까? " + isNumber(s1));
    System.out.println(s2 + "는 숫자입니까? " + isNumber(s2));
    System.out.println(s3 + "는 숫자입니까? " + isNumber(s3));
    System.out.println(s4 + "는 숫자입니까? " + isNumber(s4));
    System.out.println(s5 + "는 숫자입니까? " + isNumber(s5));
  }// end main
}// end Q6_18
