import java.util.*;

public class Ex8_7 {
  public static void main(String[] args) {
    String[] strArr = { "cat", "Dog", "lion", "tiger" };
    // class String implements Comparable 안에 int compareTo() method를 가지고있음
    Arrays.sort(strArr); // String의 Comparable구현에 의한 정렬
    System.out.println("strArr=" + Arrays.toString(strArr));

    Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분안함, 정렬할때는 1.대상과 2.기준이 꼭 제공되어야 한다.
    System.out.println("strArr=" + Arrays.toString(strArr));

    Arrays.sort(strArr, new Descending()); // 역순 정렬(사전 순서 반대로)
    System.out.println("strArr=" + Arrays.toString(strArr));
  }// end main
}// end Ex8_7

class Descending implements Comparator {
  public int compare(Object o1, Object o2) {
    if (o1 instanceof Comparable && o2 instanceof Comparable) {
      Comparable c1 = (Comparable) o1;
      Comparable c2 = (Comparable) o2;
      return c1.compareTo(c2) * -1; // -1을 곱해서 기본 정렬방식의 역으로 변경한다.
      // 또는 c2.compareTo(c1)와 같이 순서를 바꿔도 된다.
    } // end if
    return -1;
  }// end compare
}// end Descending
