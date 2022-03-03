package ex3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {

        File srcFile = new File("res/numbers.txt");
        // 1. srcFile의 입력스트림 객체 하나를 만든다. 이름은 srcFis로 한다.
        FileInputStream srcFis = new FileInputStream(srcFile);
        // 3. "res/data-copy.txt" 파일을 조작하기 위한 File 객체를 만든다. 이름은 copyFile로 한다.
        File copyFile = new File("res/numbers-copy.txt");
        // 4. copyFile의 출력스트림 객체를 만든다. 이름은 copyFos로 한다.
        FileOutputStream copyFos = new FileOutputStream(copyFile);

        int x;

        x = srcFis.read(); // 1byte씩 읽어옴

        copyFos.write(x);

        // 2. srcFis 객체를 닫는다.
        srcFis.close();
        // 5. copyFos를 닫는다.
        copyFos.close();

        System.out.println("작업완료");
    }
}
