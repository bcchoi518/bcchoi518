package Q9;

public class Q9_5 {
  public static String delChar(String src, String delCh) {
    StringBuffer sb = new StringBuffer(src.length());

    for (int i = 0; i < src.length(); i++) {
      char ch = src.charAt(i);
      // ch가 delCh에 포함되있지 않으면 (indexOf()로 못찾으면) sb에 추가
      if (delCh.indexOf(ch) == -1) { // indexOf(int ch)를 호출
        sb.append(ch);
      } // end if
    } // end for
    return sb.toString(); // StringBuffer에 저장된 내용을 String으로 반환
  }// end delChar

  public static void main(String[] args) {
    System.out.println("(1!2@3^4~5)" + "->" + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
    System.out.println("(1  2    3  4\t5)" + "->" + delChar("(1  2    3  4\t5)", " \t"));
  }// end main
}// end Q9_5

// ※ int indexOf(int ch)
// : 문자열에서 특정 문자(ch)를 찾을 때 사용, 매개변수 타입이 int지만 char값을 넣으면 된다.
// ※ int indexOf(String str)
// : 문자열에서 특정 문자열(str)을 찾을 때 사용