package Q8;

class NumberException extends Exception {
}

class InvalidNumberException extends NumberException {
}

class NotANumberException extends NumberException {
}

class Parent {
  int a;
  int b;

  Parent() {
    this(0, 0);
  }

  Parent(int a, int b) {
    this.a = a;
    this.b = b;
  }

  void add(int a, int b)
      throws InvalidNumberException, NotANumberException {
  }
}

class Child extends Parent {
  Child() {
  }

  Child(int a, int b) {
    super(a, b);
  }

  @Override
  void add(int a, int b)
      // 오버라이딩(overriding)을 할 때, 조상 클래스의 메서드보다 많은 수의 예외를 선언할 수 없다.
      // throws NumberException -> 에러, throws Exception -> 에러.
      throws InvalidNumberException, NotANumberException {
  }
}

// 메서드 오버라이딩 규칙
// 1. 조상 클래스의 메서드보다 접근 범위를 더 좁게 수정할 수 없다.
// 2. 조상 클래스의 메서드보다 많은 수의 예외를 선언할 수 없다.
// 3. private 메서드는 조상 클래스 전용 이므로 자식 클래스에 상속되지 않는다.
// 4. static 메서드는 클래스 소속이므로 자식 클래스에 상속되지 않는다.
// 5. final 메서드는 더 이상 수정할 수 없으므로 자식 클래스가 오버라이딩을 할 수 없다.

public class Q8_3 {
  public static void main(String[] args) {

  }
}
