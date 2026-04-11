package day06swapvaluesstringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

      //String bir non-primitive data type dir ve ayni zamanda bir class dir.
     //String is a non-primitive data type and also a class.

        String s ="Java is easy";

        //example 1: tum characterleri buyuk harf yapiniz.
        //Make all characters uppercase.
        String sUpper = s.toUpperCase();
        System.out.println(sUpper);//JAVA IS EASY

        //example 2:S stringdeki tum characterleri kucuk harf yapiniz.
        //Convert all the characters to lowercase in the sitring.
        String sLower = s.toLowerCase();
        System.out.println(sLower);//java is easy

        //example 3:strindeki ilk karakteri aliniz.index her zaman sifirdan baslar
        //Take the first character in the string.
        char firstChar = s.charAt(0);
        System.out.println(firstChar);//J

    }
}
