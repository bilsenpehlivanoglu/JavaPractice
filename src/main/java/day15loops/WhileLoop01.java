package day15loops;

public class WhileLoop01 {
    public static void main(String[] args) {

        //example: 3 den 6 ya kadar tam sayilay yazdirin
        //with for loop
        for (int i = 3; i<7 ; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        //with while loop
        int i = 3;
        while (i<7){
            System.out.print(i+ " ");
            i++;
        }
        //example 2: 23 den 12 ye kadar cift sayilari console yazdirin
        int k = 23;
        while (k>11){
            if (k%2==0){
                System.out.println(k+ " ");
            }
            k--;
        }

    }
}
