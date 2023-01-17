package strategy;

public class SimpleSumStrategy implements SumStrategy {

  @Override
  public int get(int n) {
    int sum = n;

    for (long i = 1; i < n; i++) {
      sum += i;
    } // for

    return sum;
  }// get

}// SimpleSumStrategy
