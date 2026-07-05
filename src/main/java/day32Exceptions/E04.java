package day32Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E04 {
    public static void main(String[] args) throws IOException {

        /*
        throw ile throws arasindaki fark nedir? :
         */


        FileInputStream fis = new FileInputStream("src/main/java/day32Exceptions/file.txt");

        int k = 0;

        while ((k=fis.read())!=-1){
            System.out.print((char) k);//Java is easy - Nothing is easy if you not study
            //file.txt dosyasini bu kodla okuduk
        }

    }
}
