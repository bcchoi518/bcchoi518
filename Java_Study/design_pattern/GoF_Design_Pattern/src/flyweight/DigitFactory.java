package flyweight;

public class DigitFactory {
  private Digit[] pool = new Digit[] {
      null, null, null, null, null, null, null, null, null, null
  };

  public Digit getDigit(int n) {
    if (pool[n] != null) {
      return pool[n];
    } else {
      String fileName = String.format(
          "D:/Developement/workspace/Java_Study/design_pattern/GoF_Design_Pattern/src/flyweight/data/%d.txt", n);
      Digit digit = new Digit(fileName);
      pool[n] = digit;
      return digit;
    } // if
  }// getDigit
}// DigitFactory