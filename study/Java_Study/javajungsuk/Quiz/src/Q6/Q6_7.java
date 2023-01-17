package Q6;

class Marine {
  int x = 0, y = 0; // Marine의 위치좌표(x,y) , 모든 Marine인스턴스마다 개별 적으로 가져야 하는 값이므로 인스턴스 변수로 선언
  int hp = 60; // 현재 체력, 모든 Marine인스턴스마다 개별 적으로 가져야 하는 값이므로 인스턴스 변수로 선언
  static int weapon = 6; // 공격력, 모든 Marine인스턴스에 대해 동일한 값이어야 하므로 static 변수로 선언
  static int armor = 0; // 방어력, 모든 Marine인스턴스에 대해 동일한 값이어야 하므로 static 변수로 선언

  static void weaponUp() { // static 변수에 대한 작업을 하는 메서드 이므로 static 메서드를 사용
    weapon++;
  }

  static void armorUp() { // static 변수에 대한 작업을 하는 메서드 이므로 static 메서드를 사용
    armor++;
  }

  void move(int x, int y) { // 인스턴스 변수에 대한 작업을 하는 메서드 이므로 static 사용 불가
    this.x = x; // this.x는 인스턴스 변수, x는 지역 변수
    this.y = y; // this.y는 인스턴스 변수, y는 지역 변수

    System.out.println("message : [" + x + ", " + y + "] 좌표로 이동합니다");
  }
}

public class Q6_7 {
  public static void main(String[] args) {
    Marine marine = new Marine();
    marine.move(3, 5);
  }
}
