package day08stringmanipulationmemoryusageifstatement;

public class IfStatements {
    public static void main(String[] args) {

//if you study hard, you will learn Java

        /*
        if(you study harf){
        you will learn Java ==? Java
        }
         */

        //example 1:sayi pozitif ise ekrana pozitif yazdirin.
        //If the number is positive, print "positive" to the screen.

        int num = 13;
        if (num>0){
            System.out.println(num+" ==> It is positive" );
        }

        //example 2:sayi -1 ile 10 arasindaysa ekrana rakam yazdirin.
        //If the number is between -1 and 10, print "number" to the screen.
        int number = 5;
        if (number>-1 && number<=10){
            System.out.println("number");
        }

    }
}
