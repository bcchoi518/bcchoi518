import java.util.*;

public class Ex8_9 {
  public static void main(String[] args) {
    HashSet set = new HashSet();

    set.add("abc");
    set.add("abc"); // 중복이라 저장안됨
    set.add(new Person("David", 10));
    set.add(new Person("David", 10));

    System.out.println(set);
  }
}

// equals()와 hashCode()를 오버라이딩해야 HashSet이 바르게 동작.
class Person {
  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public int hashCode() {
    // int hash(Object... values); // 가변인자
    return Objects.hash(name, age);
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Person)) {
      return false;
    }
    // Object 객체에는 Person의 iv인 name과 age가 없기 때문에 형변환
    Person p = (Person) obj;
    // 나 자신(this)의 이름과 나이를 p와 비교
    return this.name.equals(p.name) && this.age == p.age;
  }
}