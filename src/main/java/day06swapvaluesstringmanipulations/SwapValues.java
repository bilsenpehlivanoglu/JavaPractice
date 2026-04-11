package day06swapvaluesstringmanipulations;

public class SwapValues {
    public static void main(String[] args) {

        //swap:yer degistirmek demektir
        //Swap: to exchange places.

        //1.kap:patates 2.kap:domates==> 1.kap:domates, 2.kap:patates
        int a = 12;
        int b = 5;//swapten sonra a=5, b=12 olacak
        int temp = 0;
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        //first step
        temp = a;


        //second step
        a = b;

        //third step
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);




    }
}
