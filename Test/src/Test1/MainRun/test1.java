package Test1.MainRun;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class test1 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("a.txt");
        int read;
        while((read = fis.read()) != -1){
            System.out.print((char)read);
        }
        fis.close();
    }
}
