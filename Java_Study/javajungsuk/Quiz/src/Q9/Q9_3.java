package Q9;

public class Q9_3 {
  // 나의 풀이
  // public static int count(String src, String target) {
  // int count = 0;

  // for (int i = 0; i < src.length(); i++) {
  // if (src.charAt(i) == target.charAt(0)) {
  // for (int j = 0; j < target.length(); j++) {
  // if (src.charAt(i + j) != target.charAt(j)) {
  // break;
  // } else if (j == target.length() - 1) {
  // count += 1;
  // } // end if
  // } // end for
  // } // end if
  // } // end for
  // return count;
  // }// end count

  // 해답
  public static int count(String src, String target) {
    int count = 0; // 찾은 횟수
    int pos = 0; // 찾기 시작할 위치

    // (1) 반복문을 사용해서 아래의 과정을 반복한다.
    while (true) {
      // 1. src에서 target을 pos의 위치부터 찾는다.
      pos = src.indexOf(target, pos);
      // 2. 찾으면 count의 값을 1 증가 시키고, pos의 값을 target.length만큼 증가시킨다.
      if (pos != -1) {
        count++;
        pos += target.length(); // pos를 찾은 단어 이후로 옮긴다.
      } else {
        // 3. indexOf의 결과가 -1이면 반복문을 빠져나가서 count를 반환한다.
        break;
      } // end if
    } // end while
    return count;
  }// end count

  public static void main(String[] args) {
    System.out.println(count("12345AB12AB345AB", "AB"));
    System.out.println(count("12345", "AB"));
  }// end main
}// end Q9_3
 // ※ indexOf()는 지정된 문자열을 찾아서 그 위치를 알려주는 메서드
 // 만약 찾지 못한다면 -1을 반환