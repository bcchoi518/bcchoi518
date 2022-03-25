package Q3;

public class Q3_6 {
  public static void main(String[] args) {
    // 화씨를 섭씨로 변환하는 공식 'C = 5/9 * (F - 32)'
    int fahrenheit = 100;
    float celcius = (int) ((5 / 9.0f * (fahrenheit - 32)) * 100 + 0.5) / 100f;
    System.out.println("Fahrenheit : " + fahrenheit);
    System.out.println("Celcius : " + celcius);
  }
}
