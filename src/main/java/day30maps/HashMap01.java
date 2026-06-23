package day30maps;

import java.util.HashMap;

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
    }
}
