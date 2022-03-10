package pkg2;

import pkg1.MyParent;

class MyChild extends MyParent { // class MyChild extends pkg1.MyParent 도 가능
  public void printMembers() {
    // System.out.println(prv); // Error (private 변수는 같은 class 내에서만 접근 가능)
    // System.out.println(dft); // Error (default 변수는 같은 package 내에서만 접근 가능)
    System.out.println(prt); // OK (다른 package의 자손 class라서 접근 가능)
    System.out.println(pub); // OK
  }
}

public class MyParentTest2 {
  public static void main(String[] args) {
    MyParent p = new MyParent();
    // System.out.println(p.prv); // Error (private 변수는 같은 Class내에서만 접근 가능)
    // System.out.println(p.dft); // Error (default 변수는 같은 package 내에서만 접근 가능)
    // System.out.println(p.prt); // Error (protected 변수는 같은 package + 다른 package의
    // 자손 class 내에서만 접근 가능)
    System.out.println(p.pub); // OK
  }
}
