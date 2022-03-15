import java.util.*;

public class Ex8_2 {
  public static void main(String[] args) {
    Stack st = new Stack();
    Queue q = new LinkedList(); // Queue인터페이스의 구현체인 LinkedList 사용
    st.push("0");
    st.push("1");
    st.push("2");

    q.offer("0");
    q.offer("1");
    q.offer("2");

    System.out.println("= Stack =");
    while (!st.empty()) {
      System.out.println(st.pop()); // 스택에서 요소 하나를 꺼내서 출력
    } // end while

    System.out.println("= Queue =");
    while (!q.isEmpty()) {
      System.out.println(q.poll()); // 큐에서 요소 하나를 꺼내서 출력
    } // end while
  }// end main
}// end Ex8_2
