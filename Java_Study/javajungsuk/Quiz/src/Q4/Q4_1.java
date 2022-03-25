package Q4;

public class Q4_1 {
  public static void main(String[] args) {
    int x = 15;
    System.out.println(10 < x && x < 20);

    char ch = ' ';
    System.out.println(ch != ' ' && ch != '\t');
    System.out.println(ch == 'x' || ch == 'X');
    System.out.println('0' < ch && ch < '9');
    System.out.println(('A' < ch && ch < 'Z') || ('a' < ch && ch < 'z'));

    int year = 20;
    System.out.println((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0));

    boolean powerOn = false;
    System.out.println(!powerOn);

    String str = "yes";
    System.out.println(str.equals("yes"));
  }
}
