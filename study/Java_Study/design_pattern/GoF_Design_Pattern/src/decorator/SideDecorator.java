package decorator;

public class SideDecorator extends Decorator {
  private Character ch;

  public SideDecorator(Item item, Character ch) {
    super(item);
    this.ch = ch;
  }

  @Override
  public int getLinesCount() {
    return item.getLinesCount();
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
    return ch + item.getString(index) + ch;
  }// getString

}// SideDecorator
