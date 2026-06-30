package day31mapsexceptions;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {
    public static void main(String[] args) {

        /*
        1)tree map: thread safe ve syncrinized degildir
        tree=> natural order a gore siralar bu yuzden cok yavastir

         */

        TreeMap<String,Integer> countryPopulations = new TreeMap<>();
        countryPopulations.put("USA",400000);
        countryPopulations.put("Netherland",18000);
        countryPopulations.put("Belgium",12000);
        countryPopulations.put("Mexico",125000);
        countryPopulations.put("Brasil",215000);
        countryPopulations.put("France",75000);
        countryPopulations.put("Finland",5000);
        countryPopulations.put("Germany",85000);
        System.out.println(countryPopulations);
        //{Belgium=12000, Brasil=215000, Finland=5000, France=75000, Germany=85000, Mexico=125000, Netherland=18000, USA=400000}

        //bu sekilde yapalim, burda daha az zaman harcar
        HashMap<String,Integer> countryPop = new HashMap<>();
        countryPop.put("USA",400000);
        countryPop.put("Netherland",18000);
        countryPop.put("Belgium",12000);
        countryPop.put("Mexico",125000);
        countryPop.put("Brasil",215000);
        countryPop.put("France",75000);
        countryPop.put("Finland",5000);
        countryPop.put("Germany",85000);

        TreeMap<String,Integer> countryPopTree = new TreeMap<>(countryPop);
        System.out.println(countryPopTree);
        //{Belgium=12000, Brasil=215000, Finland=5000, France=75000, Germany=85000, Mexico=125000, Netherland=18000, USA=400000}
    }
}
