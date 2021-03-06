public class Ex5_3 {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width); // static 변수는 클래스명.변수명 으로 접근
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");

        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
        c1.width = 50; // cv는 Card.width 로 표기하여 가독성을 올린다.
        c1.height = 80; // cv는 Card.height 로 표기하여 가독성을 올린다.

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
    }// end main
}// end Ex5_3

class Card {
    String kind; // iv
    int number; // iv
    static int width = 100; // cv
    static int height = 250; // cv
}// end Card
