package day29collections;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {

        LinkedList<String> s = new LinkedList<>();
        s.add("Nuriye");
        s.add("Orhan");
        s.add("Bunyamin");
        s.add("Saadet");
        s.add("Niyazi");
        s.add("Bilal");
        s.add("Abdullah");
        s.add("Nuriye");

//        s.remove(2);//Bunyamin
//        System.out.println(s);//[Nuriye, Orhan, Saadet, Niyazi, Bilal, Abdullah, Nuriye]
//
//        s.remove("Bilal");
//        System.out.println(s);//[Nuriye, Orhan, Saadet, Niyazi, Abdullah, Nuriye]

//        s.removeFirstOccurrence("Nuriye");//ilk gorunumu siler
//        System.out.println(s);//[Orhan, Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]

//        s.removeLastOccurrence("Nuriye");//son gorunumu siler
//        System.out.println(s);//[Nuriye, Orhan, Bunyamin, Saadet, Niyazi, Bilal, Abdullah]

          String r1 = s.peek();//ilk elemani silmeden verir
        System.out.println(r1);//Nuriye
        System.out.println(s);//[Nuriye, Orhan, Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]

        String r2 = s.poll();//ilk elemani siler
        System.out.println(r2);//Nuriye,

        String r3 = s.element();//ilk elemani verir ve silmez
        System.out.println(r3);//Orhan
        System.out.println(s);//[Orhan, Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]

        String r4 = s.pop();//ilk elemani siler
        System.out.println(r4);//Orhan
        System.out.println(s);//[Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]



    }
}
