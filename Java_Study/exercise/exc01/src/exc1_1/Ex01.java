public class Ex01 {
  public static void main(String[] args) {
    Parent p = getObject(1);
    System.out.println(p.a);
    System.out.println(p.getValue());
    Parent c = getObject(0);
    System.out.println(c.a);
    System.out.println(c.getValue());
  }// end main

  public static Parent getObject(int i) {
    if (i > 0) {
      return new Parent();
    } else {
      return new Child();
    }
  }
}// end Ex01
