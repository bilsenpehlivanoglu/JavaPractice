package day15loops;

import java.util.Scanner;

public class WhileLoop02 {
    public static void main(String[] args) {

        //example 1: Kullanicinin verdigi sayi icin carpim tablosu olusturup concole yazdirin
        /*
        3==> 3x1=3
             3x2=6
             3x3=9
             3x4=12
             3x5=15...
             3x10=30
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for the multiplication table.");
        int num = input.nextInt();

        int i = 1;
        while (i<11){
            System.out.println(num+ " x "+i+" = "+(num*i));
            i++;
        }

        //example 2:verilen bir string de her harfin sonrasina "*" sembolu ekleyiniz.
        //Java ==>J*a*v*a* output

        System.out.println("Enter a word");
        String word = input.next();
        String newWord = ""; //yeni data icin

        int a = 0;
        while (a<word.length()){
           newWord = newWord + word.charAt(a)+"*";
            a++;
            // System.out.println(newWord);burada asama asama kodun ilerleyisi gorunur
        }
        System.out.println(newWord);//burada son hali gorunur

        //example 3: bir stringdeki tekrarsiz characterleri console yazdiriniz.
        //kertenkelle ==>rtn
        //indexof(k)==>0
        //lastindexof(k)==>6 farkli tekrarli

        //indexof(r)==>2
        //lastindexof(r)==>2 ayni

        String s ="kertenkelle";
        String sonuc = "";

        int b = 0;
        while (b<s.length()){
        char ch = s.charAt(b);

            if (s.indexOf(ch)==s.lastIndexOf(ch)){
                sonuc = sonuc + ch;
            }
            b++;
        }
        System.out.println(sonuc);


    }
}
