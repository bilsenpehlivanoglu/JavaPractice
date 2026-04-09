package day04scannerwrapper;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        //example:Kullanicidan isim ve soyismini alip ikisini ayni satirda ekrana yazdiriniz
        //Get the user's first and last name and print them both on the same line.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.print("Enter your last name");
        String lastName = input.next();

        System.out.println(firstName+lastName);

    }
}
