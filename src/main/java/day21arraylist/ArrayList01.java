package day21arraylist;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {

        /*
        1)ayni data type indaki coklu datalari depolamak icin kullanilri
        2)arraylarin icine koyacaginiz eleman sayisini belirtmek zorundayiz
        3)array ler eleman sayisinda esnek degildir, bu yuzden arraylist vardir, bu yapi eleman sayisinda esnekdir.
        Hic eleman koymazsaniz eleman sayisini 0 olarak ayarlar.
        4)arraylist yerine List de diyebiliriz.
        5)java arraylist leri olusturdaktan sonra array leri iptal etmedi cunku
        a)array ler super hizlidir
        b)array ler memory de cok az yer kaplar,
         c) bu nedenle eleman sayisi belli olan datalar icinarrayler kullanilir
         d)arrayler primitive data type lari ve reference leri depolayabilir
          array listler non-primitive data type lari depolar
         */

        //arraylist nasil oluturulur?
        ArrayList<Integer> ages = new ArrayList<Integer>();

        //arraylist nasil yazdirilir?
        System.out.println(ages);//[]

        //arraylist eleman nasil eklenir?
        //arraylist lere eleman eklemek icin add method kullaniriz
        // ve bizim verdigimiz sirada list e ekleme yapar bunun ismi(insertion order dir)
        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(1,656);
        ages.add(3,777);
        ages.add(888);//en sona ekler


        System.out.println(ages);//[9]

        //list e coklu eleman nasil eklenir?veya baska bir list nasil eklenir?
        //bir liste coklu eleman eklemek icin oncelikle onlari bir listin icine koymalisiniz

        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);
        System.out.println(newAges);//[8, 9, 10]

        ages.addAll(newAges);//iki array i birlestirdik
        System.out.println(ages);//[9, 656, 12, 777, 10, 888, 8, 9, 10]

        ages.addAll(2,newAges);//ikinci indexten sonra yeni datalari koyar
        System.out.println(ages);//[9, 656, 8, 9, 10, 12, 777, 10, 888, 8, 9, 10]
    }
}
