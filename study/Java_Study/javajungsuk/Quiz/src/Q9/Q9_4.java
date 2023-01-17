package Q9;

public class Q9_4 {
  public static boolean contains(String src, String target) {
    return src.indexOf(target) != -1;
  }// end contains

  public static void main(String[] args) {
    System.out.println(contains("12345", "23"));
    System.out.println(contains("12345", "67"));
  }// end main
}// end Q9_4
