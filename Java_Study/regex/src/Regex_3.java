import java.util.regex.*;

/*
String replacedString = matcher.replaceAll(String inputStr)
String replacedString = matcher.replaceFirst(String inputStr)
*/

public class Regex_3 {
  public static void main(String[] args) {
    // Lets try and reverse the order of the day and month in a few date
    // strings. Notice how the replacement string also contains metacharacters
    // (the back references to the captured groups) so we use a verbatim
    // string for that as well.
    Pattern ptrn = Pattern.compile("([a-zA-Z]+) (\\d+)");
    Matcher matcher = ptrn.matcher("June 24, August 9, Dec 12");

    // This will reorder the string inline and print:
    // 24 of June, 9 of August, 12 of Dec
    // Remember that the first group is always the full matched text, so the
    // month and day indices start from 1 instead of zero.
    String replacedString = matcher.replaceAll("$2 of $1");
    System.out.println(replacedString);
  }
}
