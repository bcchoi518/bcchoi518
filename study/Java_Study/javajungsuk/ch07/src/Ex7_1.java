public class Ex7_1 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0 / 0); // 0으로 나눌 수 없음 예외 발생
            System.out.println(4); // 실행되지 않는다.
        } catch (ArithmeticException ae) {
            if (ae instanceof ArithmeticException) {
                System.out.println("true");
            }
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("Exception");
        } // end try-catch
        System.out.println(5);
    }// end main
}// end Ex7_1
