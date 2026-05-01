package day14loops;

import java.util.Scanner;

public class Loops03 {
    public static void main(String[] args) {

        //example: kullanicidan baslangic ve bitis degerlerini alin.
        //Baslangic degerinden bitis degerine kadar aradaki tum cift tamsayilari ekrana yazdiriniz.
        //9 - 14 ==> 10 - 12 - 14
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the starting number.");
        int start = input.nextInt();

        System.out.println("Enter the ending number.");
        int end = input.nextInt();

        if (start>end){
            System.out.println("The starting digit cannot be greater than the ending digit.");
        }else {
            for (int i = start ; i<=end ; i++){
                if (i%2==0){
                    System.out.println(i+" ");
                }
            }
        }

    }
}
