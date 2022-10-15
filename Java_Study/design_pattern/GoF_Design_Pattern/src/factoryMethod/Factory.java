package factoryMethod;

public abstract class Factory {
  public Item create(String name) {
    boolean bCreatable = this.isCreatable(name);
    if (bCreatable) {
      Item item = this.createItem(name);
      postProcessItem(name);
      return item;
    } // if

    return null;
  }// create

  public abstract boolean isCreatable(String name);

  public abstract Item createItem(String name);

  public abstract void postProcessItem(String name);
}// Factory
