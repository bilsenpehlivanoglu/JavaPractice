package day15loops;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {

     /*
     asagidaki sekli cizen kodu yaziniz
     1
     1 2
     1 2 3
     1 2 3 4
     1 2 3 4 5
      */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int row = input.nextInt();

        for (int i = 1; i<=row ; i++){

            for (int k = 1; k<=i ; k++){
                System.out.print(k+" ");
            }
            System.out.println();//alt satira gecmesi icin bunu yaziyoruz
        }


    }
}
