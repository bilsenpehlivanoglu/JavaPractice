package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        //Kullanicidan bir dikdortgenjn iki kenar uzunlugunu aliniz
        //Get the lengths of two sides of a rectangle from the user.
        //a) alanini hesaplayiniz ==>kisa kenar *uzun kenar
        //b) cevresini hesaplayiniz==>2*kisa kenar + 2*uzun kenar

        Scanner input = new Scanner(System.in);
        System.out.println("dikdortgenin kisa kenar uzunlugunu giriniz");
        double shortSide = input.nextDouble();

        System.out.println("dikdortgenin uzun kenar uzunlugunu giriniz");
        double longSide = input.nextDouble();

        System.out.println(shortSide*longSide);
        System.out.println(2*shortSide+2*longSide);



    }
}
