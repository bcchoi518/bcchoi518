public class Ex6_6 {
  public static void main(String[] args) {
    Car car = null;
    FireEngine fe = new FireEngine(); // 인스턴스 생성은 자손의 인스턴스를 사용해야 문제가 안생김 (조상의 인스턴스를 자손으로 형변환하면 실행 에러가 발생)
    FireEngine fe2 = null;

    fe.water();
    car = fe; // car = (Car)fe; 에서 형변환이 생략됨
    // car.water(); // 조상타입에 없는 멤버는 사용할 수 없음
    fe2 = (FireEngine) car; // 조상타입 -> 자손타입. 형변환 생략 불가
    fe2.water();
  }// end main
}// end Ex6_6

class Car {
  String color;
  int door;

  void drive() { // 운전하는 기능
    System.out.println("drive, Brrrr~");
  }// end drive

  void stop() { // 멈추는 기능
    System.out.println("Stop!!!");
  }// end stop
}// end Car

class FireEngine extends Car {

  void water() { // 물을 뿌리는 기능
    System.out.println("water!!!");
  }// end water
}// end FireEngine