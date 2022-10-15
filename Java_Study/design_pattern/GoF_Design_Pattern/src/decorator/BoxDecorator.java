package decorator;

public class BoxDecorator extends Decorator {

  public BoxDecorator(Item item) {
    super(item);
  }

  @Override
  public int getLinesCount() {
    return item.getLinesCount() + 2;
  }// getLinesCount

  @Override
  public int getMaxLength() {
    return item.getMaxLength() + 2;
  }// getMaxLength

  @Override
  public int getLength(int index) {
    return item.getLength(index) + 2;
  }// getLength

  @Override
  public String getString(int index) {
    int maxWidth = this.getMaxLength();
    if (index == 0 || index == getLinesCount() - 1) {
      StringBuilder sb = new StringBuilder();
      sb.append('+');
      for (int i = 0; i < maxWidth - 2; i++) {
        sb.append('-');
      } // for
      sb.append('+');
      return sb.toString();
    } else {
      return '|' + item.getString(index - 1) + makeTailString(maxWidth - getLength(index - 1));
    } // if
  }// getString

  private String makeTailString(int count) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < count; i++) {
      sb.append(' ');
    } // for
    sb.append('|');

    return sb.toString();
  }// makeTailString
}// BoxDecorator
