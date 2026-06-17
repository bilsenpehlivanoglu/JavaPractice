package day29collections;

import java.util.HashSet;

public class Sets01 {
    public static void main(String[] args) {

        /*
        3 tane set class vardir
        a)hashset class: benzersiz id olusturma teknigidir
          elemanlari rastgele siralama yapar, bu yuzden en hizli olan set tir.
          tekrarsiz eleman depolamak icin kullanilir
        b)linkedhashset : elemanlari verdigimiz siraya gore dizerler
          hashset e gore yavastir
          bu da tekrarsiz eleman depolamak icin kullanilir
        c)treeset:elemanlari natural order a gore siraya dizerler (kucukten buyuge yada alfabetik sira)
          treesetler elemanlari natural ordera gore dizdiklerinden en yavas set tir.
         */

        HashSet<String> hs = new HashSet<>();
        hs.add("Gulce");
        hs.add("Seda");
        hs.add("Omer");
        hs.add("Hasan");
        hs.add("Benna");
        System.out.println(hs);

    }

}
