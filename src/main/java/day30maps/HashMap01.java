package day30maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    public static void main(String[] args) {

        /*
        Key kismi tekrarsiz, value kismi tekrarli olabilir
        Map ler key value kullanir
        Map lerdeki her bir elemana Entry denir, tamamina ise Entry set denir
        Key ve Value lir ayri ayri data type larinda olabilirler

         */

        //Map nasil olusturulur?
        HashMap<String,Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("Germany",83000);
        countryPopulation.put("Albania",30000);
        countryPopulation.put("USA",400000);
        countryPopulation.put("Turkey",83000);
        countryPopulation.put("Netherland",18000);
        System.out.println(countryPopulation);//{Netherland=18000, USA=400000, Turkey=83000, Germany=83000, Albania=30000}

        //get methdou key ile calisir ve value kismini verir
        Integer usaPop = countryPopulation.get("USA");
        System.out.println(usaPop);//400000

        //butun key leri nasil aliriz?
        Set<String> keys = countryPopulation.keySet();
        System.out.println(keys);//[Netherland, USA, Turkey, Germany, Albania]

        //butun value lari nasil alabiliriz?
        Collection<Integer> values = countryPopulation.values();
        System.out.println(values);//[18000, 400000, 83000, 83000, 30000]

        //example 1:countryPopulation daki icindeki ulkelerin nufuslarinin ortalamasi kactir?
        Collection<Integer> value = countryPopulation.values();

        int sum = 0;
        for (Integer w:value){
            sum = sum + w;
        }
        System.out.println(sum/ value.size());//122800 ortalama bu sekilde bulunuyor

        //entrySet() mapteki entryleri kalip haline alip bize set in icine koyarak verir.
        //loop lar mapler ile kullanilamaz o yuzden entryset methodunu kullaniriz
        Set<Map.Entry<String,Integer>> entries = countryPopulation.entrySet();

        //example 2: countryPopulation map indeki ulkelerin isimlerinin karakter sayisi ile nufuslarinin toplamini bulunuz

        int toplam = 0;
        for (w:entries){

        }



    }
}
