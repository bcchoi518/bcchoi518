import java.util.*;

public class Ex8_11 {
  public static void main(String[] agrs) {
    Set set = new TreeSet(); // 범위검색, 정렬. (Set set = new TreeSet(TestComp ()); -> TreeSet은 비교기준이 꼭 필요함)
    // Set set = new HashSet(); // 정렬 필요.

    for (int i = 0; set.size() < 6; i++) {
      int num = (int) (Math.random() * 45) + 1;
      set.add(num); // set.add(new Integer(num));, Integer Class가 가지고 있는 정렬기준에 의해 잘 실행됨
    }
    System.out.println(set);
  }
}

// TreeSet은 꼭 정렬기준이 필요하기 때문에 비교기준을 가진 객체를 생성해야함
class Test implements Comparable {
  @Override
  public int compareTo(Object o) {
    return 0;
  }
}

// TreeSet은 꼭 정렬기준이 필요하기 때문에 비교기준 객체를 생성해서 제공해야함
class TestComp implements Comparator {
  @Override
  public int compare(Object o1, Object o2) {
    return 0;
  }
}