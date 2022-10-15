package mediator;

public class Door extends Participant {
  private boolean bClosed = true;

  public Door(Mediator mediator) {
    super(mediator);
  }

  public void open() {
    if (!bClosed) {
      return;
    } // if

    bClosed = false;
    mediator.participantChanged(this);
  }// open

  public void close() {
    if (bClosed) {
      return;
    } // if

    bClosed = true;
    mediator.participantChanged(this);
  }// close

  public boolean isClosed() {
    return bClosed;
  }// isClosed

  @Override
  public String toString() {
    if (bClosed) {
      return "# 문: 닫힘";
    } else {
      return "# 문: 열림";
    } // if
  }// toString

}// Door
