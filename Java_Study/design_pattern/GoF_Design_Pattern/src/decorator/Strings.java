package decorator;

import java.util.ArrayList;
import java.util.Iterator;

public class Strings extends Item {
  private ArrayList<String> strings = new ArrayList<>();

  public void add(String item) {
    strings.add(item);
  }// add

  @Override
  public int getLinesCount() {
    return strings.size();
  }

  @Override
  public int getMaxLength() {
    Iterator<String> iter = strings.iterator();
    int maxWidth = 0;

    while (iter.hasNext()) {
      String string = iter.next();
      int width = string.length();

      if (width > maxWidth) {
        maxWidth = width;
      } // if
    } // while
    return maxWidth;
  }// getMaxLength

  @Override
  public int getLength(int index) {
    String string = strings.get(index);
    return string.length();
  }// getLength

  @Override
  public String getString(int index) {
    String string = strings.get(index);
    return string;
  }// getString

}// Strings
