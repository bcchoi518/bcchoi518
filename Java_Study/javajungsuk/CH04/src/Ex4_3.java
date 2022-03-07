import java.util.*;

public class Ex4_3 {
    public static void main(String[] args) {
        int[] iArr = { 100, 95, 80, 70, 60 }; // 길이가 5인 int 배열
        char[] chArr = { 'a', 'b', 'c', 'd' };

        // 배열을 가리키는 참조변수 iArr의 값을 출력한다.
        System.out.println(iArr); // [I@14318bb와같은 형식의 문자열이 출력된다.([ : 배열이란뜻, I : 인티저란뜻, @ : 위치라는뜻)
        System.out.println(chArr); // char 배열은 println의 method로 인해 abcd가 출력된다.

        for (int i = 0; i < iArr.length; i++) { // 배열의 요소를 하나씩 출력한다.
            System.out.println(iArr[i]);
        } // end for

        // 배열 iArr의 모든 요소를 출력한다. [100, 95, 80, 70, 60]이 출력된다.
        System.out.println(Arrays.toString(iArr));
        System.out.println(Arrays.toString(chArr));
    }// end main
}// end class
