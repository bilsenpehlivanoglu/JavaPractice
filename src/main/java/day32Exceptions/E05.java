package day32Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E05 {
    public static void main(String[] args) {


        try {
            FileInputStream fis = new FileInputStream("src/main/java/day32Exceptions/file.txt");
            int k = 0;
            while ((k=fis.read())!=-1){
                System.out.print((char) k);//Java is easy - Nothing is easy if you not study
                //file.txt dosyasini bu kodla okuduk
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }


    }
}
