package day04scannerwrapper;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz.
        //Write a code that takes two numbers from the user, performs four basic operations, and prints the results to the screen.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");

        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();

        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber / secondNumber);
        System.out.println(firstNumber * secondNumber);


    }
}
