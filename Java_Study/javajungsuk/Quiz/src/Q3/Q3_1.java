package Q3;

public class Q3_1 {
  public static void main(String[] args) {
    byte b = 10;
    char ch = 'A';
    int i = 100;
    long l = 1000L;

    b = (byte) i; // int(4byte) → byte(1byte)이므로 반드시 형변환 필요
    ch = (char) b; // byte(1byte) → char(2byte)이지만 범위가 달라서 형변환 필요
    short s = (short) ch; // char,short은 2byte이지만 범위가 달라서 형변환 필요
    float f = l; // float(4byte)의 범위가 long(8byte)보다 커서 생략가능
    i = ch; // char(2 byte) → int(4byte)이므로 생략가능
  }
}
