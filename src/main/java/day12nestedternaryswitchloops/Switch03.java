package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {

        //example 1:kullanicidan iki sayi ve yapilacak islemi olan ve + - * / % islemlerini yapan kodu yaziniz
        Scanner input = new Scanner(System.in);
        System.out.println("enter two number");
        double a = input.nextDouble();
        double b = input.nextDouble();

        System.out.println("Enter the action to be performed.  +,-,*,/,% ");
        char opr = input.next().charAt(0);

        switch (opr){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;

        }

    }
}
