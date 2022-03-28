package Q9;

import java.util.*;
import java.util.regex.*;

public class Q9_6 {
  public static void main(String[] args) {
    String[] phoneNumArr = {
        "012-3456-7890",
        "099-2456-7980",
        "088-2346-9870",
        "013-3456-7890",
    };
    Vector<String> list = new Vector<>(); // 검색결과를 담을 vector
    Scanner s = new Scanner(System.in);

    while (true) {
      System.out.print(">>");
      String input = s.nextLine().trim(); // trim()으로 입력내용에서 공백을 제거

      if (input.equals("")) {
        continue;
      } else if (input.equalsIgnoreCase("Q")) {
        System.exit(0);
      } // end if

      String pattern = ".*" + input + ".*"; // input을 포함하는 모든 문자열을 의미하는 패턴을 정의
      Pattern p = Pattern.compile(pattern);

      for (int i = 0; i < phoneNumArr.length; i++) {
        String phoneNum = phoneNumArr[i];
        String tmp = phoneNum.replace("-", ""); // phoneNum에서 '-'를 제거

        Matcher m = p.matcher(tmp);

        if (m.find()) { // 패턴과 일치하면, list에 phoneNum을 추가한다.
          list.add(phoneNum);
        }
      }

      if (list.size() > 0) { // 검색결과가 있으면
        System.out.println(list); // 검색결과를 출력하고
        list.clear(); // 검색결과를 삭제
      } else {
        System.out.print("일치하는 번호가 없습니다.");
      } // end if
    } // end while
  }// end main
}// end Q9_6

// java.util.regex 패키지의 클래스를 활용하여 정규표현식을 활용할 수 있음

// Pattern class
// - 정규표현식에 사용되는 패턴문자열을 객체로 관리하는 클래스
// - compile() : 정규표현식 패턴 문자열을 갖는 객체 생성
// - matches() : 특정 문자열을 대상으로 정규표현식 패턴 검사

// Matcher class
// - 정규표현식에 해당하는 패턴 해석 및 문자열 일치 여부를 파악
// - Pattern 클래스와의 차이점?
// : Pattern 클래스는 문자열 전체에 대해 검증만 수행하지만 Matcher 클래스는 부분 검증도 가능
// - 사용 방법 : Pattern 객체 생성(Pattern 클래스의 compile() 메서드) ->
// matcher()메서드를 호출하여 Matcher 타입 객체 리턴받아 사용 가능
// - lookingAt()과 fine() 메서드 수행 후에는 검사에 사용되는 인덱스 번호가 검사에 사용된 부분 이후로 변경됨
// 인덱스가 변경되므로 다른 검사 수행전에 reset()메서드를 통해 반드시 인덱스를 초기화한 후 수행하는 것이 좋음
// - fine() 메서드의 경우 파라미터로 시작인덱스 지정이 가능함
// - matches() : 원본 문자열이 정규표현식과 일치하는지 판별(전체 일치 검사)
// - lookingAt() : 원본 문자열 시작이 정규표현식과 일치하는지 판별(시작 일치 검사)
// - find() : 원본 문자열 내에 정규표현식이 포함되는지 판별(부분 일치 검사)
// - reset() : Matcher 객체 정보를 리셋하여 인덱스 번호를 0으로 초기화
// - replaceFirst() : 문자열 중 정규표현식과 처음 일치하는 문자열을 치환
// - replaceAll() : 문자열 중 정규표현식과 일치하는 모든 문자열을 치환
// => String 클래스에도 동일한 메서드가 존재하며 동일한 원리로 동작하므로 패턴 문자열을 파라미터(regex)로 전달하여 변환 대상에
// 대한 복합 규칙 설정 가능