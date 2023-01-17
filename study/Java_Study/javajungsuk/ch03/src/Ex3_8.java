public class Ex3_8 {
    public static void main(String[] args) {

        Loop1: for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 5) {
                    break Loop1;
                    // break;
                    // continue Loop1;
                    // continue;
                } // end if
                System.out.printf("%d : 안쪽 반복문%n", j);
            } // end for
            System.out.printf("%d : 바깥쪽 반복문%n", i);
        } // end for
    }// end main
}// end class
