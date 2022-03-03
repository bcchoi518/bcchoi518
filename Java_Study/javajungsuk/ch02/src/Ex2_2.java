public class Ex2_2 {
    public static void main(String[] args) {
        String str = "3";

        System.out.println(str.charAt(0)); // 문자3
        System.out.println('3' - '0'); // 숫자3
        System.out.println('3' - '0' + 1); // 숫자4
        System.out.println(Integer.parseInt("3") + 1); // 숫자4
        System.out.println("3" + 1); // 문자열31
        System.out.println((char) (3 + '0')); // 숫자51 -> '0' 은 아스키코드 48
    }
}
