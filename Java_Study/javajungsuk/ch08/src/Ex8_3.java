import java.util.*;

public class Ex8_3 {
  public static void main(String[] args) {
    // if (args.length != 1) {
    // System.out.println("Usase:java Ex8_3 \"EXPRESSION\"");
    // System.out.println("Example:java Ex8_3 \"((2+3)*1)+3\"");
    // System.exit(0);
    // }

    Stack st = new Stack();
    String expression = "((2+3)*1)+3"; // args[0]

    System.out.println("expression: " + expression);

    try {
      for (int i = 0; i < expression.length(); i++) {
        char ch = expression.charAt(i);

        if (ch == '(') {
          st.push(ch + "");
        } else if (ch == ')') {
          st.pop();
        } // end if
      } // end for
      if (st.isEmpty()) {
        System.out.println("괄호가 일치합니다.");
      } else {
        System.out.println("괄호가 일치하지 않습니다.");
      } // end if
    } catch (EmptyStackException e) {
      System.out.println("괄호가 일치하지 않습니다.(예외발생)");
    } // end try-catch
  }// end main
}// end Ex8_3
