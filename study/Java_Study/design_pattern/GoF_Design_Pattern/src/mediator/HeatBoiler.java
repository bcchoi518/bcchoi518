package mediator;

public class HeatBoiler extends Participant {
  private boolean bOff = true;

  public HeatBoiler(Mediator mediator) {
    super(mediator);
  }

  public void on() {
    if (!bOff) {
      return;
    } // if

    bOff = false;
    mediator.participantChanged(this);
  }// on

  public void off() {
    if (bOff) {
      return;
    } // if

    bOff = true;
    mediator.participantChanged(this);
  }// off

  public boolean isRunning() {
    return !bOff;
  }// isRunning

  @Override
  public String toString() {
    if (bOff) {
      return "# 보일러: 꺼짐";
    } else {
      return "# 보일러: 켜짐";
    } // if
  }// toString
}// HeatBoiler
