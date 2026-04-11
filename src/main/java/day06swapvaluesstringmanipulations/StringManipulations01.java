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

        //example 4:stringdeki ikinci ve sondan ikinci ch.aliniz
        //Take the second and second to last character in the string.
        char second = s.charAt(1);
        char secondLast = s.charAt(10);
        System.out.println(second);//a
        System.out.println(secondLast);//s

        System.out.println(second + secondLast);//212

        System.out.println(""+second + secondLast);//as

        //example 5:stringdeki toplam character sayisini bulunuz.
        //Find the total number of characters in the string
        int sLength = s.length();
        System.out.println(sLength);//12

        //example 6:stringdeki ilk dort characteri aliniz
        //Take the first four characters in the string
        String sub1 = s.substring(0,4);//0 ilk dahil, 4 ikinci haric demektir
        System.out.println(sub1);//Java

        //example 7:stringdeki is kelimesini aliniz
        //Get the word "is" from the string.
        String twoWord = s.substring(5,7);//is
        System.out.println(twoWord);

        //Get the word "easy" from the string.
        String last = s.substring(8);//easy
        System.out.println(last);

    }
}
