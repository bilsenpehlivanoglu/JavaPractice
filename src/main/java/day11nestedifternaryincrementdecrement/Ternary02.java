package day11nestedifternaryincrementdecrement;

public class Ternary02 {
    public static void main(String[] args) {

        //example 1:
        int a = 10;
        int b = 20;

        int r1 = a<b ? a++ : ++b;
        System.out.println(r1);//10
        System.out.println(a);//11
        System.out.println(b);//20

        //example 2: verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        // -4 ==> -1*-4  4==>4  0==>0
        int c = 4;
       int r2 = c<0? -1*c : c;
        System.out.println(r2);//4

        //example 3: Iki sayinin isareti ayni ise bu sayilari carpan, isaretleri farkli ise
        // "farkli isaretli sayilari carpamiyorum" mesaji veren kodu yaziniz
        int m =5;
        int n = -6;

        Object r3 = (m>0 && n>0) || (m<0 && n<0) ? m*n : "farkli isaretli sayilari carpamiyorum";
        System.out.println(r3);

    }
}
