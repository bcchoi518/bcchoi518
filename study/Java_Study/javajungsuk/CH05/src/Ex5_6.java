class Data_1 {
  int value;
}// end Data_1

class Data_2 {
  int value;

  Data_2() {
  } // 기본 생성자 (Class 내에 생성자가 1개 이상이 있으면 compiler가 기본 생성자를 안넣음)

  Data_2(int x) { // 매개변수가 있는 생성자.
    value = x;
  }
}// end Data_2

public class Ex5_6 {
  public static void main(String[] args) {
    Data_1 d1 = new Data_1();
    Data_2 d2 = new Data_2(); // 기본 생성자가 없으면 compile error 발생 (The constructor Data_2() is undefined)
  }// end main
}// end Ex5_6
