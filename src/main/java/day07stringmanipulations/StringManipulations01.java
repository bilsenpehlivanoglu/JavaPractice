package day07stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

        //example 1:"t"stringindeki tum rakamlari (0,1,2,3,4,5,6,7,8,9) * a ceviriniz
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
