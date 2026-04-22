package day09ifstatements;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {

        //Kullanicidan alinan sayinin tek mi cift mi oldugunu yaziniz.
        //Print whether the number received from the user is odd or even.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        if (num%2 == 0){
            System.out.println("The number is even");
        }

        if (num%2 != 0){
            System.out.println("The number is odd");
        }
    }
}
