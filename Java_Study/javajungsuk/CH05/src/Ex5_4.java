public class Ex5_4 {
  public static void main(String[] args) {
    MyMath mm = new MyMath(); // 객체 생성
    long result1 = mm.add(5L, 3L); // add 메서드 호출
    long result2 = mm.subtract(5L, 3L); // subtract 메서드 호출
    long result3 = mm.multiply(5L, 3L); // multiply 메서드 호출
    double result4 = mm.divide(5L, 3L); // divide 메서드 호출
    mm.printGugudan(12);

    System.out.println("add(5L, 3L) = " + result1);
    System.out.println("subtract(5L, 3L) = " + result2);
    System.out.println("multiply(5L, 3L) = " + result3);
    System.out.println("divide(5L, 3L) = " + result4);
  }// end main
}// end Ex5_4

class MyMath { // Class 작성
  void printGugudan(int dan) {
    if (!(2 <= dan && dan <= 9)) {
      return; // 입력받은 단(dan)이 2~9가 아니면, 메서드 종료하고 돌아가기
    } // end if

    System.out.println("## " + dan + "단 ##");
    for (int i = 1; i <= 9; i++) {
      System.out.printf("%d * %d = %2d%n", dan, i, dan * i);
    } // end for
    // return : void type이면 return 생략 가능
  }// end printGugudan

  long add(long a, long b) {
    long result = a + b;
    return result;
    // return a + b; // 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
  }// end add

  long subtract(long a, long b) {
    long result = a - b;
    return result;
  }// end subtract

  long multiply(long a, long b) {
    long result = a * b;
    return result;
  }// end multiply

  double divide(double a, double b) {
    double result = a / b;
    return result;
  }// end divide
}// end MyMath
