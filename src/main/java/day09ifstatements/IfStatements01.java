package day09ifstatements;

public class IfStatements01 {
    public static void main(String[] args) {

        //example 1:Sayi uc basamakli ise ekrana "sayi uc basamaklidir" yazdirin.
        //If the number is three digits , print "The number is three digits" to the screen.
        int number = 123;
        if (number>99 || number<1000){
            System.out.println("The number is three digits");
        }
    }
}
