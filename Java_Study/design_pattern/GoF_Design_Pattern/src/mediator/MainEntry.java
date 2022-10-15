package mediator;

import java.util.Scanner;

public class MainEntry {
  public static void main(String[] args) {
    SmartHome smartHome = new SmartHome();

    try (Scanner sc = new Scanner(System.in)) {
      do {
        smartHome.report();

        System.out.println("[1] 문 열기");
        System.out.println("[2] 문 닫기");
        System.out.println("[3] 창문 열기");
        System.out.println("[4] 창문 닫기");
        System.out.println("[5] 에어컨 켜기");
        System.out.println("[6] 에어컨 끄기");
        System.out.println("[7] 보일러 켜기");
        System.out.println("[8] 보일러 끄기");

        System.out.print("명령: ");
        int i = sc.nextInt();

        if (i == 1) {
          smartHome.door.open();
        } else if (i == 2) {
          smartHome.door.close();
        } else if (i == 3) {
          smartHome.window.open();
        } else if (i == 4) {
          smartHome.window.close();
        } else if (i == 5) {
          smartHome.coolAircon.on();
        } else if (i == 6) {
          smartHome.coolAircon.off();
        } else if (i == 7) {
          smartHome.heatBoiler.on();
        } else if (i == 8) {
          smartHome.heatBoiler.off();
        } // if
      } while (true);
    }
  }// main
}// MainEntry
