package Q6;

class Student2 {
  String name; // 학생이름
  int ban; // 반
  int no; // 번호
  int kor; // 국어점수
  int eng; // 영어점수
  int math; // 수학점수

  Student2() { // 생성자
  }

  Student2(String name, int ban, int no, int kor, int eng, int math) { // 생성자 오버로딩
    this.name = name;
    this.ban = ban;
    this.no = no;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
  }

  public int getTotal() { // 성적의 합계를 구하는 메서드
    return kor + eng + math;
  }

  public float getAverage() { // 성적의 평균을 구하는 메서드
    return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
  }

  @Override
  public String toString() {
    return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math;
  }

}// end Student

public class Q6_3 {
  public static void main(String[] args) {
    Student2 s = new Student2();
    s.name = "폴라포";
    s.ban = 1;
    s.no = 1;
    s.kor = 100;
    s.eng = 60;
    s.math = 76;
    System.out.println("이름:" + s.name);
    System.out.println("총점:" + s.getTotal());
    System.out.println("평균:" + s.getAverage());
  }// end main
}// end Q6_3
