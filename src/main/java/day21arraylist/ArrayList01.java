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

        //arraylistte eleman sayisi nasil bulunur?
        //size method ubir list teki eleman sayisini bulur
        int numOfElement = ages.size();
        System.out.println(numOfElement);//12

        //arraylist te specific bir eleman nasil alinir?
        //get methodu index kullanarak istedigimiz elemani almaya yarar
        int el1 = ages.get(1);
        System.out.println(el1);//656

        //Arraylistte specific bir elemani nasil degistirebilriz?
        ages.set(6,111);//[9, 656, 8, 9, 10, 12, 111, 10, 888, 8, 9, 10]
        ages.set(4,313);//[9, 656, 8, 9, 313, 12, 111, 10, 888, 8, 9, 10]
        System.out.println(ages);

        //bir listte tum elemanlari nasil silebiliriz?
       // ages.clear();
        System.out.println(ages);//[]

        //arraylistte specific bir elemanin olup olmadigini bul?
       boolean r = ages.contains(313);
        System.out.println(r);//true

        //listtin bos olup olmsdigini nasil kontrol ederiz?
        //bos ise true degilse false dondurur
        boolean r2 = ages.isEmpty();
        System.out.println(r2);//false

        //example 1: verilen bir listin bos olup olmadigini kontrol eden kodu yaziniz?
        ArrayList<String> names = new ArrayList<>();
        names.add("Gulce");
        names.add("Seda");
        names.add("Benna");
        names.add("Rojda");
        names.add("Enes");

        //first way
        if (names.size()==0){
            System.out.println("List is empty");
        }else {
            System.out.println("List has at least one element");//List has at least one element
        }

        names.clear();//bos gostermesi icin sildik,

        //second way
        if (names.isEmpty()){
            System.out.println("List is empty");//List is empty
        }else {
            System.out.println("List has at least one element");
        }






    }
}
