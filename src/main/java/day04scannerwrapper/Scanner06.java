package day04scannerwrapper;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {

        //Kullanicidan aldiginiz 3 tane sayinin ortalamasini bulan kodu yaziniz
        //Get three numbers from the user and find their average.
        Scanner input= new Scanner(System.in);
        System.out.println("enter three numbers");

        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();

        System.out.println((first+second+third)/3);

    }
}
