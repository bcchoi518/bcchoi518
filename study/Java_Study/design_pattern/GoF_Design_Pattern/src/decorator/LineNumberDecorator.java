package decorator;

public class LineNumberDecorator extends Decorator {

  public LineNumberDecorator(Item item) {
    super(item);
  }

  @Override
  public int getLinesCount() {
    return item.getLinesCount();
  }// getLinesCount

  @Override
  public int getMaxLength() {
    return item.getMaxLength() + 4;
  }// getMaxLength

  @Override
  public int getLength(int index) {
    return item.getLength(index) + 4;
  }// getLength

  @Override
  public String getString(int index) {
    return String.format("%02d", index) + ": " + item.getString(index);
  }// getString

}// LineNumberDecorator
