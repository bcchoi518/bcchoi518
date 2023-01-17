package Q7;

class Product {
  int price; // 제품의 가격
  int bonusPoint; // 제품구매 시 제공하는 보너스점수

  // 매개변수를 입력받는 생성자가 클래스안에 존재하면 컴파일러가 기본 생성자를 자동으로 생성해주지 않는다.
  // 자손 클래스의 생성자가 조상 클래스의 기본 생성자를 호출하는데 정의되어 있지 않으면 에러가 발생된다.
  Product() {
  }

  Product(int price) {
    this.price = price;
    bonusPoint = (int) (price / 10.0);
  }
}// end Product

class Tv extends Product {

  Tv() {
    // Tv클래스의 인스턴스를 생성할때 Tv()가 호출되고 Tv()는 조성 생성자 Super()를 호출한다.
    // 기본적으로 무조건 작성해야 하지만 작성하지 않아도 컴파일러가 자동으로 작성하여 컴파일한다.
    super(); // Product()를 호출
  }

  public String toString() {
    return "Tv";
  }
}// end Tv

public class Q7_3 {
  public static void main(String[] args) {
    Tv t = new Tv();
  }// end main
}// end Q7_3
