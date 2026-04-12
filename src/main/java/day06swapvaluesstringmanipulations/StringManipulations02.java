package day06swapvaluesstringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {

        String s = "Learn Java earn money";

        //example 1:stringin money kelimesi ile bitip bitmedigini kontrol ediniz
        //Check if the string ends with the word "money".

        boolean end = s.endsWith("money");
        System.out.println(end);//true

        //example 2:stringdeki money kelimesini dollar kelimesine ceviriniz.
        //Replace the word "money" with "dollar" in the string.
        String s1 = s.replace("money","dollar");
        System.out.println(s1);//Learn Java earn dollar

        //example 3:stringdeki earn kelimesini win kelimesine ceviriniz.
        //Replace the word "earn" with "win" in the string.
        String s2 = s.replace("earn","win");
        System.out.println(s2);//Lwin Java win money

        //example 4:stringdeki a harflerini * a ceviriniz.
        //Replace the 'a' letters in the string with *.
        String s3 = s.replace('a','*');
        System.out.println(s3);//Le*rn J*v* e*rn money

        //example 5:stringdeki n harflerini XXX a ceviriniz.
        //Replace the 'n' letters in the string with XXX.
        String s4 = s.replace("n","xxx");
        System.out.println(s4);//Learxxx Java earxxx moxxxey

        //example 6:stringdeki tum 'e' harflerini siliniz.
        //Remove all 'e' characters from the string.
        String s5 = s.replace("e","");
        System.out.println(s5);//Larn Java arn mony

        //example 7:"t"stringindeki tum rakamlari (0,1,2,3,4,5,6,7,8,9) * a ceviriniz
        //Replace all t letters to * in the string.
        String t = "Ali 13 yasindadir!...";

        /*
        Regex ler
        1) tum rakamlar==> [0-9]
        2) tum kucuk harfler==> [a-z]
        3) tum buyuk harfler==> [A-Z]
        4) tum kucuk ve buyuk harfler==> [a-zA-Z]
        5) tum harfler ve rakamlar==> [a-zA-Z0-9]
        6) tum noktalama isaretleri==> \\p{Punct}
        7) tum sesli harfler==> [aeiouAEIOU]
        8) tum x,q,w harfler==> [x,q,w]

        olumsuzlari
        9) kucuk harflerden farkli tum characterler =>[^a-z]
        10)tum harflerden farkli tum characterler =>[^a-zA-Z]

         */
        String t1 = t.replaceAll("[0-9]","*");
        System.out.println(t1);//Ali ** yasindadir!...





    }
}
