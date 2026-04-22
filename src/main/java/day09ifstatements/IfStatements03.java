package day09ifstatements;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {

        //example 1:Kullanicinin verdigi karakter buyuk harf ise ekrana "buyuk harf" kucuk harf ise ekrana "kucuk harf"yazdirin.
        //Print "uppercase" if the character entered by the user is uppercase, and "lowercase" if it is lowercase.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = input.next().charAt(0);

        if (ch>= 'A' && ch<= 'Z'){
            System.out.println("Uppercase");
        }

        if (ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }
    }
}
