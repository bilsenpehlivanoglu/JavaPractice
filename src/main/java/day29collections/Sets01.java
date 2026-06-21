package day29collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

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
        System.out.println(hs);//[Hasan, Seda, Omer, Gulce, Benna]

        hs.add("Seda");
        hs.add("Null");
        hs.add("Null");
        System.out.println(hs);//[Null, Hasan, Seda, Omer, Gulce, Benna]

        System.out.println(hs.hashCode());//210203846

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(19);
        lhs.add(13);
        lhs.add(-33);
        lhs.add(312);
        System.out.println(lhs);//[19, 13, -33, 312] verdigimiz sirayla
        lhs.add(null);
        lhs.add(null);
        System.out.println(lhs);//[19, 13, -33, 312, null]

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(19);
        ls.add(13);
        ls.add(313);
        ls.add(45);
        lhs.retainAll(ls);
        System.out.println(lhs);//[19, 13]
        System.out.println(ls);//[19, 13, 313, 45]

        TreeSet<Character> ts = new TreeSet<>();
        ts.add('E');
        ts.add('G');
        ts.add('B');
        ts.add('A');
        ts.add('L');
        ts.add('Y');
        ts.add('E');
      // ts.add(null); null eklenemez
        System.out.println(ts);//[A, B, E, G, L, y]

        System.out.println(ts.first());//A
        System.out.println(ts.last());//Y
        System.out.println(ts.lower('E'));//verilen harften bir oncekini yazdirir B dondu.
        System.out.println(ts.lower('F'));//verilen harften bir oncekini yazdirir E dondu.

        System.out.println(ts.higher('B'));//E verilen eleman olan B den bir sonrakini verir
        System.out.println(ts.higher('F'));//G verilen eleman olan B den bir sonrakini verir

        System.out.println(ts.headSet('E'));//[A, B]
        System.out.println(ts.headSet('E',true));//[A, B, E] e yi dahil et dedik


    }

}
