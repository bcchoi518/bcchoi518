import java.util.*;

public class Ex9_4 {
  public static void main(String[] args) {
    HashMap<String, Student1> map = new HashMap<>(); // jdk 1.7부터 생성자에 타입지정 생략가능
    map.put("자바왕", new Student1("자바왕", 1, 1, 100, 100, 100));

    Student1 s = map.get("자바왕");

    System.out.println(s);

  }// end main
}// end Ex9_3

class Student1 {
  String name;
  int ban;
  int no;
  int kor;
  int eng;
  int math;

  Student1(String name, int ban, int no, int kor, int eng, int math) {
    this.name = name;
    this.ban = ban;
    this.no = no;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
  }

  public String toString() {
    return (this.name + ", " + this.ban + ", " + this.no + ", " + this.kor + ", " + this.eng + ", " + this.math);
  }
}// end Student1