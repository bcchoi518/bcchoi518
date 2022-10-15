package memento;

import java.util.Random;

public class MainEntry {
  public static void main(String[] args) {
    Walker walker = new Walker(0, 0, -15, -20);
    String[] actions = { "UP", "RIGHT", "DOWN", "LEFT" };
    Random random = new Random();
    double minDistance = Double.MAX_VALUE;
    Walker.Memento memento = null;

    while (true) {
      String action = actions[random.nextInt(4)];
      double distance = walker.walk(action);
      System.out.println(action + " " + distance + " (min: " + minDistance + ")");

      if (distance == 0.0) {
        break;
      } // if

      if (minDistance > distance) {
        minDistance = distance;
        memento = walker.createMemento();
      } else {
        if (memento != null) {
          walker.restoreMemento(memento);
        } // if
      } // if
    } // while
    System.out.println("Walker's path: " + walker);
  }// main
}// MainEntry
