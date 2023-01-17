import java.util.*;

class Tv {
}// end Tv

class Audio {
}// end Audio

public class Ex9_1 {
    public static void main(String[] args) {
        ArrayList<Tv> list = new ArrayList<Tv>(); // Tv타입의 객체만 저장가능
        list.add(new Tv());
        // list.add(new Audio()); // Tv타입의 객체만 저장가능
        Tv t = list.get(0);
        System.out.println(t);
    }// end main
}// end Ex9_1
