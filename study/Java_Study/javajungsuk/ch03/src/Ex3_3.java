public class Ex3_3 {
    public static void main(String[] args) {

        int num = 0;

        for (int i = 0; i < 20; i++) {
            // Math.random : 0.0 ~ 0.9 까지의 임의의 실수 발생
            num = (int) (Math.random() * 10) + 1;
            System.out.println(num);
        } // end for
    }// end main
}// end class
