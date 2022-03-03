package ex1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Program {
    public static void main(String[] args) throws IOException {

        // 변수선언
        int kor1, kor2, kor3;
        int total;
        float avg;

        // 국어성적 3개를 초기화
        kor1 = 40;
        kor2 = 60;
        kor3 = 30;

        // 총점을 구하는 코드
        total = kor1 + kor2 + kor3;

        // 평균을 구하는 코드
        avg = total / 3.0f; // 묵시적 형변환

        // File file = new File("D:\\workspace\\Java_Study\\exam1\\data.txt");// 파일생성

        // FileOutputStream fos = new FileOutputStream(file);// 버퍼준비

        // // PrintStream 객체 하나를 생성하시오. 이름은 fout으로 하시오.
        // PrintStream fout = new PrintStream(fos);
        // // PrintStream은 필터 스트림이기 때문에, FileOutputStream과 ByteArrayOutputStream등을 연결해서 사용할 수 있다.

        // fout.println("┌──────────────────────────────────┐");
        // fout.println("│              성적 출력            │");
        // fout.println("└──────────────────────────────────┘");
        // fout.printf("kor1 : %d\n", kor1);
        // fout.printf("kor2 : %d\n", kor2);
        // fout.printf("kor3 : %d\n", kor3);
        // // //달러표시로 변수의 값을 원하는 곳에 넣을 수 있음
        // // fout.printf("kor1 : %2$d\nkor2 : %3$d\nkor3 : %1$d\n", kor1, kor2, kor3);
        // fout.printf("total : %d\n", total);
        // fout.printf("avg : %.2f\n", avg);
        // fout.println("────────────────────────────────────");

        // // fos.write('A'); // 문자 쓰기
        // // fos.flush(); // 사용자가 원할때 버퍼를 비워주는 것(IO에서는 출력하기, 네트워크에서는 서버나 클라이언트로 보내기)

        // fout.close();
        // fos.close(); // 파일닫기 (close함수가 내부적으로 flush함수를 호출하는 기능도있음)
        
        System.out.println("┌──────────────────────────────────┐");
        System.out.println("│             성적 출력            │");
        System.out.println("└──────────────────────────────────┘");
        System.out.printf("kor1 : %d\n", kor1);
        System.out.printf("kor2 : %d\n", kor2);
        System.out.printf("kor3 : %d\n", kor3);
        System.out.printf("total : %d\n", total);
        System.out.printf("avg : %.2f\n", avg);
        System.out.println("────────────────────────────────────");

        System.out.println("작업완료");
    }
}
