import java.util.*;

public class Ex8_5 {
  public static void main(String[] args) {
    // ArrayList list = new ArrayList();
    HashSet list = new HashSet(); // Set은 Collection의 자손
    // Collection c = new TreeSet();
    // c.add("");
    // 조상으로 참조변수를 선언하면 Collection의 method만 사용할 수 있기 때문에 실제 구현 클래스를 바꿔도 됨
    list.add("1");
    list.add("2");
    list.add("3");
    list.add("4");
    list.add("5");

    Iterator it = list.iterator(); // ArrayList -> HashSet으로 변경해도 사용 할 수 있음

    while (it.hasNext()) {
      Object obj = it.next();
      System.out.println(obj);
    } // end while
    System.out.println();

    // iterator는 1회용이라 다 쓰고나면 다시 얻어와야 한다.
    it = list.iterator();

    while (it.hasNext()) {
      Object obj = it.next();
      System.out.println(obj);
    } // end while
    System.out.println();

    // ArrayList -> HashSet으로 변경하면 HashSet에는 .get()이 없기때문에 사용할 수 없는 코드가 된다.
    // for (int i = 0; i < list.size(); i++) {
    // Object obj = list.get(i);
    // System.out.println(obj);
    // }// end for

  }// end main
}// end Ex8_5