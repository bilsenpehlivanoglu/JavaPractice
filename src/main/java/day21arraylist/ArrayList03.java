package day21arraylist;

import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {

        //Kisa yoldan bir list nasil olusturulur?
        List<Character> initials = List.of('a','c','a','k');//listler non-primitive data tutar.
        System.out.println(initials);//[a, c, d, k]

        //listof methodu degistirilemez bir list olusturmak icin kullanilir.
        //Bu nedenle list uzerinde degisiklik yapmaya yonelik methodlari desteklemez ama diger list methodlarini kullanabilriz.

        //indexof methodu aranan karakterin ilk gorunumun indexini verir.
       int r1 =  initials.indexOf('a');
        System.out.println(r1);//0

        //lastindexof methodu aranan karakterin son gorunumun indexini verir.
        int r2 =  initials.lastIndexOf('a');
        System.out.println(r2);//2


    }
}
