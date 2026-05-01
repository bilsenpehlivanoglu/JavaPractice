package day14loops;

import java.util.Scanner;

public class NestedLoops02 {
    public static void main(String[] args) {

        /*
        asagidaki sekli console yazdirin
        x x x x x
        x x x x x
        x x x x x
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows.");
        int row = input.nextInt();

        System.out.println("Enter the number of column.");
        int column = input.nextInt();

       for (int i = 1; i<= row ; i++){//satirlar icin distaki

           for (int k = 1; k <= column; k++){//yanyana yazdiginda sutunlar icin calisir
               System.out.print("x ");
           }
           System.out.println();//bu da satir yanyana yazdirildiktan sonra
           // pointer a bir sonraki satira almak icin kullanilir.
       }
    }
}
