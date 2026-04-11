package day06swapvaluesstringmanipulations;

public class SwapValues {
    public static void main(String[] args) {

        //swap:yer degistirmek demektir
        //Swap: to exchange places.

        //first way

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


     //Second way
     int elma = 12;
     int armut = 5;
        System.out.println("elma = " + elma);//elma = 12
        System.out.println("armut = " + armut);//armut = 5

        elma = elma + armut;

     armut = elma - armut;
     elma = elma - armut;

        System.out.println("elma = " + elma);//elma = 5
        System.out.println("armut = " + armut);//armut = 12

        //other
        int c = 10;
        int d = 5;
        int temporary = 0;
        System.out.println("c = " + c);//c = 10
        System.out.println("d = " + d);//d = 5

        temporary = c;
        c = d;
        d = temporary;
        System.out.println("c = " + c);//c = 5
        System.out.println("d = " + d);//d = 10

    }
}
