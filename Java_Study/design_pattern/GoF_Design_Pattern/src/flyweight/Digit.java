package flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Digit {
  private ArrayList<String> data = new ArrayList<>();

  public Digit(String fileName) {
    FileReader fr = null;
    BufferedReader br = null;

    try {
      fr = new FileReader(fileName);
      br = new BufferedReader(fr);

      for (int i = 0; i < 8; i++) {
        data.add(br.readLine());
      } // for
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (fr != null) {
          fr.close();
        } // if

        if (br != null) {
          br.close();
        } // if
      } catch (IOException e) {
        e.printStackTrace();
      } // try-catch
    } // try-catch-finally
  }// Digit

  public void print(int x, int y) {
    for (int i = 0; i < 8; i++) {
      String line = data.get(i);
      System.out.print(String.format("%c[%d;%df", 0x1B, y + i, x));
      System.out.print(line);
    } // for
  }// print
}// Digit
