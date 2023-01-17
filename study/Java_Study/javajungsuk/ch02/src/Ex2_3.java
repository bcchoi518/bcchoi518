public class Ex2_3 {
    public static void main(String[] args) {

        double pi = 3.141592;

        System.out.println(pi);
        System.out.println(pi * 1000);
        System.out.println(Math.round(pi * 1000)); // 소수 넷째자리에서 반올림
        System.out.println(Math.round(pi * 1000) / 1000); // 3
        System.out.println(Math.round(pi * 1000) / 1000.0); // 3.142

        System.out.println(pi * 1000);
        System.out.println((int) (pi * 1000)); // 소수점 아래로 값을 버림
        System.out.println((int) (pi * 1000) / 1000.0);
    }
}
