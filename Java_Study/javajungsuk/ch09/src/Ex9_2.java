import java.util.*;

class Product {
}// end Product

class Tv1 extends Product {
}// end Tv1

class Audio1 extends Product {
}// end Audio1

public class Ex9_2 {
  public static void main(String[] args) {
    ArrayList<Product> productList = new ArrayList<Product>();
    ArrayList<Tv1> tvList = new ArrayList<Tv1>();
    // ArrayList<Product> tvList = new ArrayList<Tv1>(); // 에러
    // List<Tv1> tvList = new ArrayList<Tv1>(); // OK. 다형성

    productList.add(new Tv1());
    productList.add(new Audio1());

    tvList.add(new Tv1());
    tvList.add(new Tv1());

    printAll(productList);
    // PrintAll(tvList); // 컴파일 에러가 발생한다.
  }

  public static void printAll(ArrayList<Product> list) {
    for (Product p : list) {
      System.out.println(p);
    } // end for
  }// end printAll
}// end Ex9_2
