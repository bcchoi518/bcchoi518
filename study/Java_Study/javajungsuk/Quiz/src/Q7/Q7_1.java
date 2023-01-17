package Q7;

class SutdaDeck {
  final int CARD_NUM = 20;
  SutdaCard[] cards = new SutdaCard[CARD_NUM];

  SutdaDeck() {
    for (int i = 0; i < cards.length; i++) {
      int num = i % 10 + 1;
      boolean isKwang = (i == 0 || i == 2 || i == 7);
      cards[i] = new SutdaCard(num, isKwang);
    } // end for
  }// end SutdaDeck()
}// end SutdaDeck

class SutdaCard {
  int num;
  boolean isKwang;

  SutdaCard() {
    this(1, true);
  }// end SutdaCard()

  SutdaCard(int num, boolean isKwang) {
    this.num = num;
    this.isKwang = isKwang;
  }// end SutdaCard()

  // info() 대신 Object클래스의 toString()을 오버라이딩 했다.
  @Override
  public String toString() {
    return num + (isKwang ? "K" : "");
  }// end toString()
}// end SutdaCard

public class Q7_1 {
  public static void main(String[] args) {
    SutdaDeck deck = new SutdaDeck();

    for (int i = 0; i < deck.cards.length; i++) {
      System.out.print(deck.cards[i].toString() + ",");
    } // end for
  }// end main
}// end Q7_1
