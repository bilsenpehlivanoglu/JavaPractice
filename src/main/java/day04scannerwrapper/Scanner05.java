package day04scannerwrapper;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {

        //kullanicidan alamcagimiz 5 basamakli sayinin ilk 2 ve son 2 basamagindaki rakamlarin toplamini yazdiran kodu yaziniz
        //Write code that prints the sum of the first two and last two digits of a five-digit number entered by the user.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 5-digit number.");
        int number = input.nextInt();

        //% ==>modulus operator, solunda bulunan sayinin saginda bulunan sayiya bolumunden kalani verir.
        //It gives the remainder when the number on the left is divided by the number on the right.

        //38671
        //son rakami al
        int birlerBasamagi = number%10;
        //sayiyi kucult
        number = number/10;

        //sondan ikinci rakami al
        int sondanIkinci = number%10;
        number = number/10;

        //sondan ucuncu rakami al
        int sondanUcuncu = number%10;
        number = number/10;

        //sondan dorduncu rakami al
        int sondanDorduncu = number%10;
        number= number/10;

        //sondan besinci rakami al
        int sondanBesinci = number%10;
        number = number/10;

        System.out.println(sondanBesinci+sondanDorduncu+birlerBasamagi+sondanIkinci);
    }
}
