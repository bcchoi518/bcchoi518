package ex2;

public class Program {
    public static void main(String[] args) {
        String str1 = new String("hello"); // 문자열의 일부분을 추출, 문자열의 크기, 문자열에서 특정 문자열을 찾기
        // 1. 문자열 비교
        // String str2 = new String("hello");
        // String str3 = new String("hello");
        String str2 = "hello";
        String str3 = "hello";

        System.out.println(str1 == str2); // 같은 객체냐~
        System.out.println(str1.equals(str3)); // 같은 객체냐~
        System.out.println(str2 == str3); // 같은 객체냐~

        // 2. 문자열 합치기
        String str4 = str1 + str2;
        String str5 = str1 + 1; // -> str1 + "1" -> str1 + new String("1"), + : operator method
        String str6 = str1.concat(str2);

        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);

        // 3. 문자열 자르기
        String sub = str1.substring(0, 3); // 0 ~ 2 까지 문자열을 추출

        System.out.println(sub);

        // 4. 문자열에 포함된 문자 또는 문자열 찾기
        String str7 = "hello hey hi";
        int idx = str7.indexOf("h", 7);
        System.out.println(idx);
        System.out.println(idx > 0 ? "있다" : "없다");
    }
}
