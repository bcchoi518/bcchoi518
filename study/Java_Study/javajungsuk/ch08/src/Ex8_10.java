import java.util.*;

public class Ex8_10 {
  public static void main(String[] args) {
    HashSet setA = new HashSet();
    HashSet setB = new HashSet();
    HashSet setHab = new HashSet();
    HashSet setKyo = new HashSet();
    HashSet setCha = new HashSet();

    setA.add("1");
    setA.add("2");
    setA.add("3");
    setA.add("4");
    setA.add("5");
    System.out.println("A = " + setA);

    setB.add("4");
    setB.add("5");
    setB.add("6");
    setB.add("7");
    setB.add("8");
    System.out.println("B = " + setB);

    // 교집합
    Iterator it = setB.iterator();
    while (it.hasNext()) {
      Object tmp = it.next();
      if (setA.contains(tmp))
        setKyo.add(tmp);
    }

    // 차집합
    it = setA.iterator();
    while (it.hasNext()) {
      Object tmp = it.next();
      if (!setB.contains(tmp))
        setCha.add(tmp);
    }

    // 합집합
    it = setA.iterator();
    while (it.hasNext())
      setHab.add(it.next());

    it = setB.iterator();
    while (it.hasNext())
      setHab.add(it.next());

    System.out.println("A ∩ B = " + setKyo); // 한글 ㄷ을 누르고 한자키
    System.out.println("A U B = " + setHab); // 한글 ㄷ을 누르고 한자키
    System.out.println("A - B = " + setCha);

    // // 교집합 방법2
    // setA.retainAll(setB); // 공통된 요소만 남기고 삭제
    // System.out.println("교2 = " + setA);

    // // 차집합 방법2
    // setA.removeAll(setB); // setB와 공통 요소를 제거
    // System.out.println("차2 = " + setA);

    // // 합집합 방법2
    // setA.addAll(setB); // setB의 모든 요소를 추가(중복제외)
    // System.out.println("합2 = " + setA);
  }
}
