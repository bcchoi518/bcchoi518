package mediator;

public class Window extends Participant {
  private boolean bClosed = true;

  public Window(Mediator mediator) {
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
      return "# 창: 닫힘";
    } else {
      return "# 창: 열림";
    } // if
  }// toString
}// Window
