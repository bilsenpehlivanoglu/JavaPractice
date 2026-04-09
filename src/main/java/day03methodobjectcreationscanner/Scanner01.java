package day03methodobjectcreationscanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        //Scanner class tan object olustur
        //Create object from Scanner class
        Scanner input = new Scanner(System.in);

        //Kullaniciya ne istediginize dair mesaj veriniz
        //Give the user a message about what you want.
        System.out.println("Pls enter your age");

        //Uygun methodu kullanarak kullanicinin verdigi datayi memory e yerlestrin
        byte age = input.nextByte();

        System.out.println(age);

    }
}
