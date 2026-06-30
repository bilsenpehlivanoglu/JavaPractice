package day31mapsexceptions;

import java.util.Hashtable;

public class Hashtable01 {
    public static void main(String[] args) {

        /*
        hashmap ile hashtable arasindaki fark nedir?
        1)hashmap thread safe ve senkronized degilder
        2)hashtable thread safe ve senkronized dir
         */

        Hashtable<String,Integer> stdAges = new Hashtable<>();
        stdAges.put("Mustafa",41);
        stdAges.put("Seda",30);
        stdAges.put("Ekim",22);
        stdAges.put("Ali Can",18);
     //   stdAges.put(null,15);
     //   stdAges.put("Mehmet",null); hem key hemde value ya null yazamiyoruz
        System.out.println(stdAges);//{Ekim=22, Ali Can=18, Mustafa=41, Seda=30}



    }
}
