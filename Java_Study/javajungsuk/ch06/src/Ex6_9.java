public class Ex6_9 {
  public static void main(String[] args) {
    Unit[] group = { new Marine(), new Tank(), new Dropship() };

    for (int i = 0; i < group.length; i++) {
      group[i].move(100, 200);
      group[i].stop();

      if (group[i] instanceof Marine) {
        Marine marine = (Marine) group[0]; // 참조변수의 형변환 (조상 -> 자손)
        marine.stimPack();
      } else if (group[i] instanceof Tank) {
        Tank tank = (Tank) group[1];
        tank.changeMode();
      } else if (group[i] instanceof Dropship) {
        Dropship dropship = (Dropship) group[2];
        dropship.load();
        dropship.unload();
      }
      System.out.println();
    } // end for
  }// end main
}// end Ex6_9

abstract class Unit {
  int x, y;

  abstract void move(int x, int y);

  void stop() {
    /* 현재 위치에 정지 */
    System.out.println("Stop!!");
  }
}// end Unit

class Marine extends Unit {
  void move(int x, int y) {
    System.out.println("Marine[ x = " + x + ", y = " + y + " ]");
  }

  void stimPack() {
    /* 스팀팩을 사용한다 */
    System.out.println("Marine : 오~우 예~~에~~~");
  }
}// end Marine

class Tank extends Unit {
  void move(int x, int y) {
    System.out.println("Tank[ x = " + x + ", y = " + y + " ]");
  }

  void changeMode() {
    /* 모드를 변경한다 */
    System.out.println("Tank : 위이이잉 푸슈~ 위이이잉~");
  }
}// end Tank

class Dropship extends Unit {
  void move(int x, int y) {
    System.out.println("Dropship[ x = " + x + ", y = " + y + " ]");
  }

  void load() {
    /* 선택된 대상을 태운다. */
    System.out.println("Dropship : 야! 타!");
  }

  void unload() {
    /* 선택된 대상을 내린다. */
    System.out.println("Dropship : Bye Bye ~");
  }
}// end Dropship