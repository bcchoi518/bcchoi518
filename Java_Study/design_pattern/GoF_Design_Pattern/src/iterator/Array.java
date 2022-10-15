package iterator;

public class Array implements Aggregator {

  private Item[] items;

  public Array(Item[] items) {
    this.items = items;
  }

  public Item getItem(int index) {
    return items[index];
  }

  public int getCount() {
    return items.length;
  }

  @Override
  public Iterator iterator() { // Iterator 인터페이스를 구현한 ArrayIterator를 생성하여 반환
    return new ArrayIterator(this);
  }

}// Array
