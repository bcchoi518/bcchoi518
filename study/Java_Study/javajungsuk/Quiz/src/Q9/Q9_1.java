package Q9;

public class Q9_1 {
  public static void main(String[] args) {
    SutdaCard c1 = new SutdaCard(3, true);
    SutdaCard c2 = new SutdaCard(3, true);

    System.out.println("c1=" + c1);
    System.out.println("c2=" + c2);
    System.out.println("c1.equals(c2):" + c1.equals(c2));
  }// end main
}// end Q9_1

class SutdaCard {
  int num;
  boolean isKwang;

  SutdaCard() {
    this(1, true);
  }

  SutdaCard(int num, boolean isKwang) {
    this.num = num;
    this.isKwang = isKwang;
  }

  public boolean equals(Object obj) { // 매개변수가 Object 타입이므로 어떤 타입의 인스턴스도 매개변수로 가능
    if (obj != null && obj instanceof SutdaCard) { // 반드시 instanceof로 확인 후에 형변환해서 멤버변수 값을 비교해야 함
      SutdaCard sc = (SutdaCard) obj;
      return (num == sc.num) && (isKwang == sc.isKwang);
    }
    return false; // instanceof로 확인결과가 false이면 당연히 false를 반환
  }

  public String toString() {
    return num + (isKwang ? "K" : "");
  }
}// end SutdaCard
