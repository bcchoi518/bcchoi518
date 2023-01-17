import java.util.*;

public class Ex8_1 {
    public static void main(String[] args) throws Exception {
        // 기본 길이 (용량, capacity)가 10인 ArrayList를 생성
        ArrayList list1 = new ArrayList(10);
        // list1.add(new Integer(5)); 원래는 이렇게 사용하는게 정석이지만 컴파일러가 오토박싱을 해줘서 아래처럼 사용가능
        list1.add(5);
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(3);
        // ArrayList(Collection c)
        ArrayList list2 = new ArrayList(list1.subList(1, 4));
        print(list1, list2);

        // Collection은 인터페이스, Collections는 유클 클래스
        Collections.sort(list1); // list1과 list2를 정렬한다.
        Collections.sort(list2); // Collections.sort(List 1)
        print(list1, list2);

        System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");
        print(list1, list2);

        list2.set(3, "AA");
        print(list1, list2);

        list1.add(0, "1"); // 문자열 1을 0번 인덱스에 추가
        // indexOf()는 지정된 객체의 위치(인덱스)를 알려준다.
        print(list1, list2);
        System.out.println("\"1\" index = " + list1.indexOf("1"));
        System.out.println("1 index = " + list1.indexOf(1));
        list1.remove(list1.indexOf(1));
        System.out.println(list1 + " <- 0과 2사이의 1이 삭제됨(integer type)");
        list1.remove(list1.indexOf("1"));
        System.out.println(list1 + " <- 0앞에 있는 1이 삭제됨(string type)");
        System.out.println();

        // list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
        System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
        print(list1, list2);

        // list2에서 list1에 포함된 객처들을 삭제한다.
        for (int i = list2.size() - 1; i >= 0; i--) {
            if (list1.contains(list2.get(i))) {
                list2.remove(i);
            } // end if
        } // end for
        print(list1, list2);

    }// end main

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
        System.out.println();
    }// end print
}// end Ex8_1
