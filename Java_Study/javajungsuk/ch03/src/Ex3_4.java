public class Ex3_4 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println("## " + i + "단 ##");
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %2d%n", i, j, i * j);
            } // end for
            System.out.println();
        } // end for
    }// end main
}// end class
