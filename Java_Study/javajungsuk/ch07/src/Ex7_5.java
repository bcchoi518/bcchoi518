class Person {
  long id; // this.id

  public boolean equals(Object obj) {
    if (!(obj instanceof Person)) {
      return false;
    }
    Person p = (Person) obj;

    return this.id == p.id;
  }

  Person(long id) {
    this.id = id;
  }
}// end Person

public class Ex7_5 {
  public static void main(String[] args) {
    Person p1 = new Person(1111111111111L);
    Person p2 = new Person(1111111111111L);

    if (p1.equals(p2)) {
      System.out.println("p1과 p2는 같은 사람입니다.");
    } else {
      System.out.println("p1과 p2는 다른 사람입니다.");
    } // end if
  }// end main
}// end Ex7_5
