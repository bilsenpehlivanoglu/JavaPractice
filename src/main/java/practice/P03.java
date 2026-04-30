package practice;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {



    /*
    If/else syntax debug

While making a game, your partner,
Greg, decided to create a function to check if the user is still alive called checkAlive/CheckAlive/check_alive.
Unfortunately, Greg made some errors while creating the function.

checkAlive/CheckAlive/check_alive should return true
if the player's health is greater than 0 or false if it is 0 or below.

The function receives one parameter health which will always be a whole number between -10 and 10.

     */
        int checkAlive = 9;

        if (checkAlive>=-10 && checkAlive<=10){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }
}
