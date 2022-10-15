package mediator;

public class CoolAircon extends Participant {
  private boolean bOff = true;

  public CoolAircon(Mediator mediator) {
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
      return "# 에어컨: 꺼짐";
    } else {
      return "# 에어컨: 켜짐";
    } // if
  }// toString
}// CoolAircon
