public class PrintfEx1 {
    public static void main(String[] args) {

        System.out.println(10.0 / 3);
        System.out.println(0x1A);
        System.out.println();

        System.out.printf("%d%n", 15); // 10진수
        System.out.printf("%#o%n", 15); // 8진수
        System.out.printf("%#x%n", 15); // 16진수
        System.out.printf("%s%n", Integer.toBinaryString(15)); // 2진수
        System.out.println();

        float f = 123.456789f;
        double d = 123.4567891011;

        System.out.printf("%f%n", f);
        System.out.printf("%e%n", f);
        System.out.printf("%g%n", 123.456789);
        System.out.printf("%g%n", 0.00000001);
        System.out.printf("%.15f%n", d);
        System.out.printf("%e%n", d);
        System.out.println();

        System.out.printf("[%5d]%n", 10);
        System.out.printf("[%-5d]%n", 10);
        System.out.printf("[%05d]%n", 10);
        System.out.printf("[%5d]%n", 1234567);
        System.out.printf("[%f]%n", d);
        System.out.printf("[%14.8f]%n", d);
        System.out.println();

        System.out.printf("[%s]%n", "www.codechobo.com");
        System.out.printf("[%20s]%n", "www.codechobo.com");
        System.out.printf("[%-20s]%n", "www.codechobo.com");
        System.out.printf("[%.10s]%n", "www.codechobo.com");
    }
}
