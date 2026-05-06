package day15loops;

import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args) {

         /*
     asagidaki sekli cizen kodu yaziniz
     1
     1 2
     1 2 3
     1 2 3 4
     1 2 3 4 5
      */

      /*  Scanner input = new Scanner(System.in);
        System.out.println("enter the number of row");
        int row = input.nextInt();

        for (int i = 1; i<=row; i++){

            for (int k = 1; k<=i; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
*/
        //example: 3 den 6 ya kadar tam sayilari yazdirin
       /* int i = 3;
        while (i<6){
            System.out.print(i+ " ");
            i++;
        }
        System.out.println("------------------------------------------");

        //example 2: 23 den 12 ye kadar cift sayilari console yazdirin
        int m = 23;
        while (m>11){
            if (m%2==0){
                System.out.print(m+" ");
            }
            m--;
        }
        System.out.println();
        //example 3: 6 dan 19 a kadar tum tek sayilari concole yazdiriniz.
        int k = 6;
        while (k<=19){
            if (k%2 != 0){
                System.out.print(k+" ");
            }
            k++;
        }*/

        //example 1: Kullanicinin verdigi sayi icin carpim tablosu olusturup concole yazdirin
        /*
        3==> 3x1=3
             3x2=6
             3x3=9
             3x4=12
             3x5=15...
             3x10=30
         */
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int num = input.nextInt();

        int i = 1;
        while (i<=10){
            System.out.println(num+" x "+i+" = "+(num*i) );
            i++;
        }

    }
}
