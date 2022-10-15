package factoryMethod;

import java.util.HashMap;

public class ItemFactory extends Factory {
  private class ItemData {
    int maxCount;
    int currentCount;

    ItemData(int maxCount) {
      this.maxCount = maxCount;
    }
  }// ItemData

  private HashMap<String, ItemData> repository;

  public ItemFactory() {
    repository = new HashMap<String, ItemData>();

    repository.put("sword", new ItemData(3));
    repository.put("shield", new ItemData(2));
    repository.put("bow", new ItemData(1));
  }// ItemFactory

  @Override
  public boolean isCreatable(String name) {
    ItemData itemData = repository.get(name);

    if (itemData == null) {
      System.out.println(name + "은 알 수 없는 아이템입니다.");
      return false;
    } // if

    if (itemData.currentCount >= itemData.maxCount) {
      System.out.println(name + "은 품절 아이템입니다.");
      return false;
    } // if

    return true;
  }// isCreatable

  @Override
  public Item createItem(String name) {
    Item item = null;

    if (name.equals("sword")) {
      item = new Sword();
    } else if (name.equals("shield")) {
      item = new Shield();
    } else if (name.equals("bow")) {
      item = new Bow();
    } // if

    return item;
  }// createItem

  @Override
  public void postProcessItem(String name) {
    ItemData itemData = repository.get(name);
    if (itemData != null) {
      itemData.currentCount++;
    } // if
  }// postProcessItem

}// ItemFactory
