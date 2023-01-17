import java.util.ArrayList;

class Fruit implements Eatable {
  public String toString() {
    return "Fruit";
  }
}// end Fruit

class Apple extends Fruit {
  public String toString() {
    return "Apple";
  }
}// end Apple

class Grape extends Fruit {
  public String toString() {
    return "Grape";
  }
}// end Grape

class Toy {
  public String toString() {
    return "Toy";
  }
}// end Toy

interface Eatable {
}// end Eatable

class Ex9_5 {
  public static void main(String[] args) {
    FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
    FruitBox<Apple> appleBox = new FruitBox<Apple>();
    FruitBox<Grape> grapeBox = new FruitBox<Grape>();
    // FruitBox<Grape> grapeBox = new FruitBox<Apple>(); // 에러. 타입 불일치
    // FruitBox<Toy> toyBox = new FruitBox<Toy>(); // 에러.

    fruitBox.add(new Fruit());
    fruitBox.add(new Apple());
    fruitBox.add(new Grape());
    appleBox.add(new Apple());
    // appleBox.add(new Grape()); // 에러. Grape는 Apple의 자손이 아님
    grapeBox.add(new Grape());

    System.out.println("fruitBox-" + fruitBox);
    System.out.println("appleBox-" + appleBox);
    System.out.println("grapeBox-" + grapeBox);
  } // end main
}// end Ex9_5

class FruitBox<T extends Fruit & Eatable> extends Box<T> {
}// end FruitBox

class Box<T> {
  ArrayList<T> list = new ArrayList<T>(); // item을 저장할 list

  void add(T item) { // 박스에 item을 추가
    list.add(item);
  }

  T get(int i) { // 박스에서 item을 꺼낼때
    return list.get(i);
  }

  int size() {
    return list.size();
  }

  public String toString() {
    return list.toString();
  }
}// end Box