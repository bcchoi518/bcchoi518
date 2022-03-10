class Product {
  int price; // 제품의 가격
  int bonusPoint; // 제품구매 시 제공하는 보너스점수

  Product() { // 기본생성자
  }

  Product(int price) { // 생성자 오버로딩
    this.price = price;
    bonusPoint = (int) (price / 10.0); // 보너스점수는 제품가격의 10%
  }
}// end Product

class Tv1 extends Product {
  Tv1() {
    // 조상클래스의 생성자 Product(int price)를 호출한다.
    super(100); // Tv의 가격을 100만원으로 한다.
  }

  // Object클래스의 toString()을 오버라이딩한다.
  public String toString() {
    return "Tv";
  }
}// end Tv1

class Computer extends Product {
  Computer() {
    super(200);
  }

  public String toString() {
    return "Computer";
  }
}// end Computer

class Audio extends Product {
  Audio() {
    super(50);
  }

  public String toString() {
    return "Audio";
  }
}// end Audio

class Buyer { // 고객 물건을 사는 사람
  int money = 1000; // 소유금액
  int bonusPoint = 0; // 보너스점수
  Product[] cart = new Product[10]; // 구입한 제품을 저장하기 위한 배열
  int i = 0;

  void buy(Product p) {
    if (money < p.price) {
      System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
      return;
    } // end if

    money -= p.price; // 가진 돈에서 구입한 제품의 가격을 뺀다.
    bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가한다.
    cart[i++] = p; // 제품을 Product[] cart에 저장한다.
    System.out.println(p + "을/를 구입하셨습니다.");
  }// end buy

  void summary() { // 구매한 물품에 대한 정보를 요약해서 보여준다.
    int sum = 0; // 구입한 물품의 가격합계
    String itemList = ""; // 구입한 물품목록

    // 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
    for (int i = 0; i < cart.length; i++) {
      if (cart[i] == null) {
        break;
      } // end if
      sum += cart[i].price;
      itemList += cart[i] + ", ";
    } // end for
    System.out.println("구입하신 제품은 " + itemList + "입니다.");
    System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
  }// end summary
}// end Buyer

public class Ex6_7 {
  public static void main(String[] args) {
    Buyer b = new Buyer();

    b.buy(new Tv1()); // Buy(Product p)
    b.buy(new Computer()); // Buy(Product p)
    b.buy(new Audio()); // Buy(Product p)
    b.summary();

    System.out.println("현재 남은 돈은 " + b.money + "만원 입니다.");
    System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
  }// end main
}// end Ex6_7
