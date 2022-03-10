package pkg1;

public class MyParent { // 접근제어자가 default 면 같은 패키지 내에서 접근가능하므로 public으로 변경하여야 다른 패키지에서 접근가능
  private int prv; // 같은 클래스
  int dft; // 같은 패키지
  protected int prt; // 같은 패키지 + 자손(다른 패키지)
  public int pub; // 접근제한 없음.

  public void printMembers() {
    System.out.println(prv); // OK
    System.out.println(dft); // OK
    System.out.println(prt); // OK
    System.out.println(pub); // OK
  }
}

class MyParentTest {
  public static void main(String[] args) {
    MyParent p = new MyParent();
    // System.out.println(p.prv); // Error (private 변수는 같은 Class내에서만 접근 가능)
    System.out.println(p.dft); // OK
    System.out.println(p.prt); // OK
    System.out.println(p.pub); // OK
  }
}
