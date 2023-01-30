package proxy;

import java.util.ArrayList;

public class BufferDisplay implements Display {
  private ArrayList<String> buffer = new ArrayList<>();
  private ScreenDisplay screen;
  private int bufferSize;

  public BufferDisplay(int bufferSize) {
    this.bufferSize = bufferSize;
  }

  @Override
  public void print(String content) {
    buffer.add(content);
    if (buffer.size() == bufferSize) {
      flush();
    } // if
  }// print

  public void flush() {
    if (screen == null) {
      screen = new ScreenDisplay();
    }
    String lines = String.join("\n", buffer);
    screen.print(lines);
    buffer.clear();
  }// flush
}// BufferDisplay