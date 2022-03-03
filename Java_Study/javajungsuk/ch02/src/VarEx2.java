public class VarEx2 {
    public static void main(String[] args) {
        // final로 상수 선언
        final int score = 100;
        // score = 200; // 상수는 값을 바꿀수 없음

        boolean power = true;

        byte b = 127;

        int oct = 010; // 8진수, 10진수로 8
        int hex = 0x10; // 16진수, 10진수로 16

        long l = 10_000_000_000L; // int 범위를 벗어나면 L을 무조건 적어야함

        float f = 3.14f; // float 타입은 f를 무조건 적어야함
        double d = 3.14;

        char ch = 'A';
        int i = 'A';

        String str1 = ""; // 빈 문자열(empty string)
        String str2 = "ABCD";
        String str3 = "123";
        String str4 = str2 + str3;

        System.out.println(score);
        System.out.println(power);
        System.out.println(b);
        System.out.println(oct); // println은 10진수로만 출력 가능
        System.out.println(hex);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);

        // 실수형을 표시하는 형태
        System.out.println(10.);
        System.out.println(.10);
        System.out.println(10f);
        System.out.println(1e3);

        System.out.println(ch);
        System.out.println(i);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println("" + 7 + 7);
        System.out.println(7 + 7 + "");
    }
}
