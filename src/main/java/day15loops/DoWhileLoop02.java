package day15loops;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {

/*
Kullanicidan bir tamsayi aliniz
Tamsayi 100 den kucuk ise kullaniciya "Kaybettiniz" mesaji verip oyunu sonlandirin
Tamsayi 100 den buyuk ise kullaniciya "Kazandiniz" mesaji verip oyunu devam ettirin

 */
        Scanner input = new Scanner(System.in);

        do {

            System.out.println("Enter a number");
            int num = input.nextInt();

            if (num>=100){
                System.out.println("You won");
            }else {
                System.out.println("You lost.");
                break;
            }
        }while (true);
    }
}
