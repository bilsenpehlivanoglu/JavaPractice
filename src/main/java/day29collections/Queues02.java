package day29collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues02 {
    public static void main(String[] args) {

        Queue<String> line = new PriorityQueue<>();
        line.add("Milk");
        line.add("Bread");
        line.add("Apple");
        line.add("Milk");
        line.add("Egg");
        line.add("Meat");
        line.add("Tomatoes");
        System.out.println(line);//[Apple, Egg, Bread, Milk, Milk, Meat, Tomatoes]

        /*
        Queue bir interface dir, bu yuzden constructor yoktur, dolayisiyla objectbolustururken keywordu Queue kullanilamaz
        data type i Queue olan bir object olusturmak icin new keywordunden sonra
        1)linkedlist yada 2)priorityQueue classlari kullanilabilir
        Queue olustururken constructor olarak PriorityQueue kullanirssaniz elemanlari kendi belirleyeceginiz.


         */
         //Deque:
        Deque<String> d = new LinkedList<>();
        d.add("Egg");
        d.add("Milk");
        d.add("Cheese");
        d.add("Meat");
        System.out.println(d);//[Egg, Milk, Cheese, Meat]


    }
}
