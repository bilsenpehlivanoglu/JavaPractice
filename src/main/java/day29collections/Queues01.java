package day29collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {

        Queue<String> depo = new LinkedList<>();
        depo.add("Milk");
        depo.add("Meat");
        depo.add("Egg");
        depo.add("Cheese");
        System.out.println(depo);//[Milk, Meat, Egg, Cheese]

        depo.remove();//ilk elemani siliyor
        System.out.println(depo);//[Meat, Egg, Cheese]

        System.out.println(depo.peek());//Meat

        depo.clear();//depo bosaldi
        System.out.println(depo.poll());//null
     // System.out.println(depo.remove());//depo bos oldugu icin hata verir
    //  System.out.println(depo.element());//exception
        System.out.println(depo.peek());//null


    }
}
