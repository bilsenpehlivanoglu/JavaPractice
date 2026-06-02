package day24stringbuilder;

public class Sb01 {
    public static void main(String[] args) {

        /*
        1) String builder class i da string ureten bir class dir.
        2) String class kullanarak zaten string uretiriz,
        string class immutable (degistirilemez) string uretir
        string builder (degistirilebilir) class mutable string uretir.
        3) immutable demek orjinal degerin korunmasi, degistirlemez olmasi demektir.
        4) mutable demek orjinal degerin degistirilebilir olmasi demektir.

         */

        //immutable
        String s = "Java";
        String t = s + "!";
        String w = t + "?";

        String a ="Money";
        a = a + "More";
        System.out.println(a);

        //mutable
        //StringBuilder kullanarak string olusturmanin 1.yolu
        StringBuilder sb1 = new StringBuilder("Python");
        sb1.append("!");//concatination yapar append
        System.out.println(sb1);//Python


    }
}
