package day09ifstatements;

public class IfStatements01 {
    public static void main(String[] args) {

        //example 1:Sayi uc basamakli ise ekrana "sayi uc basamaklidir" yazdirin.
        //If the number is three digits , print "The number is three digits" to the screen.
        int number = -123;
        number = Math.abs(number);//bu kod eksi sayilari artiya cevirir
        if (number>99 && number<1000){
            System.out.println("The number is three digits");
        }

        //example 2:Bir stringdeki tekrarsiz karakterleri ekrana yazdiriniz.
        //Print only the non-repeating characters in a string.
        // abbccdc ==>ad
        String str = "aac";

        char ch1 = str.charAt(0);

        if (str.indexOf(ch1) == str.lastIndexOf(ch1)){
            System.out.println(ch1);
        }

        char ch2 = str.charAt(1);

        if (str.indexOf(ch2) == str.lastIndexOf(ch2)){
            System.out.println(ch2);
        }

        char ch3 = str.charAt(2);

        if (str.indexOf(ch3) == str.lastIndexOf(ch3)){
            System.out.println(ch3);
        }
    }
}
