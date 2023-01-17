public class Ex10_9 {
  public static void main(String args[]) {
    Runnable r = new RunnableEx13();
    new Thread(r).start();
    new Thread(r).start();
  }// end main
}// end Ex10_9

class Account2 {
  private int balance = 1000; // private으로 해야 동기화가 의미가 있다.

  public synchronized int getBalance() {
    return balance;
  }// end getBalance

  public synchronized void withdraw(int money) { // synchronized로 메서드를 동기화
    if (balance >= money) {
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
      } // end try-catch
      balance -= money;
      System.out.println("in_balance:" + balance);
    } // end if
  } // end withdraw
}// end Account2

class RunnableEx13 implements Runnable {
  Account2 acc = new Account2();

  public void run() {
    while (acc.getBalance() > 0) {
      // 100, 200, 300중의 한 값을 임으로 선택해서 출금(withdraw)
      int money = (int) (Math.random() * 3 + 1) * 100;
      System.out.println("money:" + money);
      acc.withdraw(money);
      System.out.println("balance:" + acc.getBalance());
    } // end while
  } // end run
}// end RunnableEx13