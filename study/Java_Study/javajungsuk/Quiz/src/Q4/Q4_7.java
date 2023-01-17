package Q4;

public class Q4_7 {
  public static void main(String[] args) {
    String str = "12345";
    int sum = 0;

    for (int i = 0; i < str.length(); i++) {
      sum += str.charAt(i) - 48;
    } // end for
    System.out.println("sum = " + sum);
  }// end main
}// end Q4_7
