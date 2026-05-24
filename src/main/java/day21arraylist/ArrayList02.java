package day21arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList02 {
    public static void main(String[] args) {

        //bir Listin baska bir list ile ayni olup olmadigini nasil kontrol ederiz?
        //iki listin esit olabilmesi icin ayni indexte ayni elemanlar olmalidir.
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");

        boolean s = names1.equals(names2);
        System.out.println(s);//false

        //example: verilen iki integer listte tamamiyla ayni elemanlarin olup olmadigini kontrol eden kodu yaziniz
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        Collections.sort(nums1);//datalari kucukten buyuge siralama yapar
        Collections.sort(nums2);//datalari kucukten buyuge siralama yapar

        boolean result = nums1.equals(nums2);
        System.out.println(result);//true

        //Arraylistte bir elemanin ilk gorunumu nasil silinir?
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Istanbul");
        cities.add("Yozgat");

        System.out.println(cities);//[Miami, Istanbul, Yozgat, Barcelona, Miami, Istanbul, Istanbul, Yozgat]

        //remove methodu bir elemanin ilk gorunumunu siler
        System.out.println(cities.remove("Miami"));//true, remove methodu boolean dir
        System.out.println(cities);//[Istanbul, Yozgat, Barcelona, Miami, Istanbul, Istanbul, Yozgat]

        //ArrayListte bir eleman index kullanilarak nasil silinir?
        cities.remove(2)



    }
}
