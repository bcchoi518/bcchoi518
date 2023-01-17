package Q6;

class Student {
  String name; // 학생이름
  int ban; // 반
  int no; // 번호
  int kor; // 국어점수
  int eng; // 영어점수
  int math; // 수학점수

  public Student() {
  }

  public Student(String name, int ban, int no, int kor, int eng, int math) {
    this.name = name;
    this.ban = ban;
    this.no = no;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
  }

  @Override
  public String toString() {
    return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math;
  }

}// end Student

public class Q6_1 {
  public static void main(String[] args) {
    Student st = new Student();
    st.name = "폴라포";
    st.ban = 1;
    st.no = 1;
    st.kor = 90;
    st.eng = 80;
    st.math = 50;

    Student st2 = new Student("해태", 1, 2, 100, 100, 100);

    System.out.println(st.name + ", " + st.ban + ", " + st.no + ", " + st.kor + ", " + st.eng + ", " + st.math);
    System.out.println(st.toString());
    System.out.println(st2.name + ", " + st2.ban + ", " + st2.no + ", " + st2.kor + ", " + st2.eng + ", " + st2.math);
    System.out.println(st2.toString());
  }// end main
}// end Q6_1
