package decorator;

public class MainEntry {
  public static void main(String[] args) {
    Strings strings = new Strings();

    strings.add("Hello~");
    strings.add("My Name is Kim Hyoung-Jun.");
    strings.add("I am a GIS Developer.");
    strings.add("Design-Pattern is powerful tool.");

    // strings.print();

    Item decorator = new SideDecorator(strings, '\"');
    decorator = new LineNumberDecorator(decorator);
    decorator = new BoxDecorator(decorator);

    decorator.print();
  }// main
}// MainEntry
