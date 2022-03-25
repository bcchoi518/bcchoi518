package Q4;

public class Q4_6 {
  public static void main(String[] args) {
    int[] dice = new int[] { 1, 2, 3, 4, 5, 6 };

    for (int i = 0; i < dice.length; i++) {
      for (int j = 0; j < dice.length; j++) {
        if (dice[i] + dice[j] == 6) {
          System.out.println("첫번재 주사위 : " + dice[i] + ", 두번째 주사위 : " + dice[j] + ", 두 눈의 합 : " + (dice[i] + dice[j]));
        } // end if
      } // end for
    } // end for
  }// end main
}// end Q4_6