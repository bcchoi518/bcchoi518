import java.util.*;

public class Ex8_12 {
  public static void main(String[] args) {
    HashMap map = new HashMap();
    map.put("myId", "1234");
    map.put("asdf", "1111");
    map.put("asdf", "1234");

    Scanner s = new Scanner(System.in); // 화면으로부터 라인단위로 입력받는다.

    while (true) {
      System.out.println("id와 password를 입력해주세요.");
      System.out.print("id : ");
      String id = s.nextLine().trim(); // " 1234" -> "1234"

      System.out.print("password : ");
      String password = s.nextLine().trim();
      System.out.println();

      if (!map.containsKey(id)) {
        System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요");
      } // end if

      if (!(map.get(id)).equals(password)) {
        System.out.println("password가 일치하지 않습니다. 다시 입력해주세요");
      } else {
        System.out.println("id와 password가 일치합니다.");
        break;
      } // end if
    } // end while
  }// end main
}// end Ex8_12
