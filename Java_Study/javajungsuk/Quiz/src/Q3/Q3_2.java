package Q3;

public class Q3_2 {
  public static void main(String[] args) {
    int x = 2;
    int y = 5;
    char c = 'A'; // 'A' 의 문자코드는 65
    // 연산자 우선 순위
    /*
     * 최우선 연산자
     * 단항 연산자
     * 산술 연산자
     * 쉬프트 연산자
     * 비교 연산자
     * 논리 연산자
     * 삼항 연산자
     * 대입 연산자
     */
    System.out.println(1 + x << 33); // int는 32bit 이므로 33 쉬프트 하면 1 쉬프트만 함
    System.out.println(y >= 5 || x < 0 && x > 2); // true
    System.out.println(y += 10 - x++); // 13
    System.out.println(x += 2); // 5 (바로 윗 줄의 x++ 증가 연산자의 영향을 받음)
    System.out.println(!('A' <= c && c <= 'Z')); // false
    System.out.println('C' - c); // 2
    System.out.println('5' - '0'); // 5
    System.out.println(c + 1); // 66 // 이항연산자의 성질(int보다 작은 타입은 int로 변환 후 연산)때문에 'A'는 문자코드 값인 65로 변환되어 덧셈
    // 이항연산자는 연산을 위해 '피연산자 스택(operand stack)'을 사용하는데 이 과정에서 형변환이 발생됨
    System.out.println(++c); // 'B' // 단항 연산자인 증가 연산자는 '피연산자 스택'을 사용하지 않으므로 형변환 발생하지 않음, 출력 타입에 따라 출력됨
    System.out.println(c++); // 'B'
    System.out.println(c); // 'C'
  }
}
