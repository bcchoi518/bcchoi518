package Q9;

public class Q9_3 {
  public static int count(String src, String target) {
    int count = 0;

    for (int i = 0; i < src.length(); i++) {
      if (src.charAt(i) == target.charAt(0)) {
        for (int j = 0; j < target.length(); j++) {
          if (src.charAt(j) != target.charAt(j)) {
            break;
          } else if (j == target.length() - 1) {
            count += 1;
          } // end if
        } // end for
      } // end if
    } // end for
    return count;
  }// end count

  public static void main(String[] args) {
    System.out.println(count("12345AB12AB345AB", "AB"));
    System.out.println(count("12345", "AB"));
  }
}
