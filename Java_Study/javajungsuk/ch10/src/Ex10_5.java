class Ex10_5 implements Runnable {
  static boolean autoSave = false;

  public static void main(String[] args) {
    Thread t = new Thread(new Ex10_5()); // Thread(Runnable r) : Runnable인터페이스를 구현한 클래스의 객체를 전달하라
    t.setDaemon(true); // 이 부분이 없으면 종료되지 않는다. (반드시 start() 전에 설정한다)
    t.start();

    for (int i = 1; i <= 10; i++) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
      } // end try-catch
      System.out.println(i);

      if (i == 5) {
        autoSave = true; // 5초 후 autoSave 기능 작동
      } // end if
    } // end for

    System.out.println("프로그램을 종료합니다.");
  }// end main

  public void run() { // 데몬 쓰레드(보조역할)
    while (true) { // 무한루프(but 일반 쓰레드가 하나도 없으면 자동종료)
      try {
        Thread.sleep(3 * 1000); // 3초마다
      } catch (InterruptedException e) {
      } // end try-catch

      // autoSave의 값이 true이면 autoSave()를 호출한다.
      if (autoSave) {
        autoSave();
      } // end if
    } // end while
  }// end run

  public void autoSave() {
    System.out.println("작업파일이 자동저장되었습니다.");
  }// end autoSave
}// end Ex10_5