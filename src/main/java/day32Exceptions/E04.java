package day32Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E04 {
    public static void main(String[] args) throws FileNotFoundException {

        /*
        throw ile throws arasindaki fark nedir? :
         */


        FileInputStream fis = new FileInputStream("src/main/java/day32Exceptions/file.txt");
    }
}
