package day09ifstatements;

import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args) {

        //If the number is positive, print "positive" to the screen.
       /* int number = 0;

        if (number>-1){
            System.out.println("The number is positive");
        }*/

        //If the number is between -1 and 10, print "number" to the screen.
        /*int number1 = -1;

        if (number1>-1 && number1<10){
            System.out.println("Number");
        }*/

        //If the number is three digits , print "The number is three digits" to the screen.
       /* int number2 = -123;
        number2 = Math.abs(number2);

        if (number2>99 && number2<1000){
            System.out.println("The number is three digits");
        }*/

        //Print only the non-repeating characters in a string.
        // abbccdc ==>ad
       /* String str = "abc"; // ==>ac
        char ch1 = str.charAt(0);

        if (str.indexOf(ch1) == str.lastIndexOf(ch1)){
            System.out.println(ch1);
        }

        char ch2 = str.charAt(1);
        if (str.indexOf(ch2) == str.lastIndexOf(ch2)){
            System.out.println(ch2);
        }

       char ch3 = str.charAt(2);
        if (str.indexOf(ch3) == str.lastIndexOf(ch3)){
            System.out.println(ch3);
        }*/

        //Print whether the number received from the user is odd or even.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        if (num%2 ==0){
            System.out.println("This number is even");
        } else if (num%2 !=0) {
            System.out.println("This number is odd");
        }else {
            System.out.println("Invalid character");
        }

    }
}
