package factoryMethod;

public class MainEntry {
  public static void main(String[] args) {
    Factory factory = new ItemFactory();

    Item item1 = factory.create("sword");
    if (item1 != null) {
      item1.use();
    } // if

    Item item2 = factory.create("sword");
    if (item2 != null) {
      item2.use();
    } // if

    Item item3 = factory.create("sword");
    if (item3 != null) {
      item3.use();
    } // if

    Item item4 = factory.create("sword");
    if (item4 != null) {
      item4.use();
    } // if

    Item item5 = factory.create("sword");
    if (item5 != null) {
      item5.use();
    } // if

    factory.create("shield");
    factory.create("shield");
    factory.create("shield");
    factory.create("shield");
    factory.create("shield");

    factory.create("bow");
    factory.create("bow");
    factory.create("bow");
  }// main
}// MainEntry
