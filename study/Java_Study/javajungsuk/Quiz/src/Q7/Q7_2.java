package Q7;

class SutdaDeck1 {
  final int CARD_NUM = 20;
  SutdaCard1[] cards = new SutdaCard1[CARD_NUM];

  SutdaDeck1() {
    for (int i = 0; i < cards.length; i++) {
      int num = i % 10 + 1;
      boolean isKwang = (i == 0 || i == 2 || i == 7);
      cards[i] = new SutdaCard1(num, isKwang);
    } // end for
  }// end SutdaDeck1()

  void shuffle() {
    for (int i = 0; i < cards.length; i++) {
      int j = (int) (Math.random() * cards.length);
      SutdaCard1 tmp = cards[i]; // SutdaCard1 타입의 변수를 선언한 후 cards[i]의 값으로 초기화
      cards[i] = cards[j];
      cards[j] = tmp;
    } // end for
  }// end shuffle

  SutdaCard1 pick(int index) { // 매개변수가 있는 메서드는 반드시 작업 전에 유효성검사를 해야 한다는 것을 기억하자!!
    if (index < 0 || index >= CARD_NUM) {
      return null;
    } // end if
    return cards[index];
  }// end pick()

  SutdaCard1 pick() { // 오버로딩
    int index = (int) (Math.random() * cards.length);
    return pick(index); // 다소 비효율적이지만 코드의 중복을 제거하고 재사용성을 높이기 위해 pick(int index)메서드를 호출
    // 그러나 너무 객체지향적인 측면에 얽매여서 코드를 짤 필요는 없다고 생각하며 상황에 맞는 적절한 코드를 작성하면 좋지 않을까?
    // return cards[index];
  }// end pick()
}// end SutdaDeck1

class SutdaCard1 {
  int num;
  boolean isKwang;

  SutdaCard1() {
    this(1, true);
  }// end SutdaCard1()

  SutdaCard1(int num, boolean isKwang) {
    this.num = num;
    this.isKwang = isKwang;
  }// end SutdaCard1()

  // info() 대신 Object클래스의 toString()을 오버라이딩 했다.
  @Override
  public String toString() {
    return num + (isKwang ? "K" : "");
  }// end toString()
}// end SutdaCard1

public class Q7_2 {
  public static void main(String[] args) {
    SutdaDeck1 deck = new SutdaDeck1();

    for (int i = 0; i < deck.cards.length; i++) {
      System.out.print(deck.cards[i].toString() + ",");
    } // end for
    System.out.println();
    deck.shuffle();
    for (int i = 0; i < deck.cards.length; i++) {
      System.out.print(deck.cards[i].toString() + ",");
    } // end for
    System.out.println();
    System.out.println(deck.pick().toString());
    System.out.println(deck.pick(4).toString());
  }// end main
}// end Q7_1
