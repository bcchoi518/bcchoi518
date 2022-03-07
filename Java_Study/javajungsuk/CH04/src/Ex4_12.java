public class Ex4_12 {
    public static void main(String[] args) {

        String str = "ABCDE";

        char ch = str.charAt(3);
        System.out.println(ch);

        String str2 = str.substring(1, 4);
        System.out.println(str2);

        String str3 = str.substring(1); // (1, str.length())와 같음
        System.out.println(str3);

    }// end main
}// end class
