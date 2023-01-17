package Q6;

class Student1 {
  String name; // 학생이름
  int ban; // 반
  int no; // 번호
  int kor; // 국어점수
  int eng; // 영어점수
  int math; // 수학점수
  int total; // 총점
  float average; // 평균

  public Student1() {
  }

  public Student1(String name, int ban, int no, int kor, int eng, int math) {
    this.name = name;
    this.ban = ban;
    this.no = no;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
  }

  public String info() {

    total = kor + eng + math;
    average = (int) ((total / 3f) * 100 + 0.5) / 100f;
    return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + total + ", " + average;
  }

  @Override
  public String toString() {
    return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math;
  }
}// end Student

public class Q6_2 {
  public static void main(String[] args) {
    Student1 s = new Student1("홍길동", 1, 1, 100, 60, 76);
    String str = s.info();
    System.out.println(str);
  }// end main
}// end Q6_2
