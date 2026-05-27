package day21arraylist;

import java.util.ArrayList;

public class Tekrar {
    public static void main(String[] args) {

        //arraylist nasil oluturulur?
        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(8);
        ages.add(10);
        ages.add(15);
        ages.add(17);
        System.out.println(ages);//[8, 10, 15, 17]

        //list e coklu eleman nasil eklenir?veya baska bir list nasil eklenir?
        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(29);
        newAges.add(30);
        newAges.add(12);
        System.out.println(newAges);//[29, 30, 12]

        ages.addAll(1,newAges);
        System.out.println(ages);//[8, 29, 30, 12, 10, 15, 17]


    }
}
