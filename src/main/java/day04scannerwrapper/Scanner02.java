package day04scannerwrapper;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        //Kullanicidan adresini alniz ve ekrana yazdiriniz
        //Get user's address and print it on the screen
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your address");
        String address = input.nextLine();//nextLine uzun kelimeleri alir

        System.out.println(address);

    }
}
