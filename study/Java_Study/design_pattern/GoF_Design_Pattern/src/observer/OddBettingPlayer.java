package observer;

public class OddBettingPlayer extends Player {

  public OddBettingPlayer(String name) {
    super(name);
  }

  @Override
  public void update(int diceNumber) {
    if (diceNumber % 2 == 1) {
      System.out.println(getName() + " Win!");
    } // if
  }// update

}// OddBettingPlayer
