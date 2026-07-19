package day33exceptionsenumiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Admin");
        myList.add("Bugra");
        myList.add("Hasan");
        myList.add("Benna");
        myList.add("Ali");
        System.out.println(myList);//[Admin, Bugra, Hasan, Benna, Ali]

        //iterator kullanip eleman silalim
        Iterator<String> myIterator = myList.iterator();//[Admin, Bugra, Hasan, Benna, Ali]

        while (myIterator.hasNext()){
            myIterator.next();
            myIterator.remove();
        }
        System.out.println(myList);

        List<String> yourList = new ArrayList<>();
        yourList.add("Admin");
        yourList.add("Bugra");
        yourList.add("Hasan");
        System.out.println(yourList);//[Admin, Bugra, Hasan]

        ListIterator<String> yourListItr = yourList.listIterator();

        while (yourListItr.hasNext()){
            String el = yourListItr.next();
            yourListItr.set(el+"*");//set update eder
        }
        System.out.println(yourList);//[Admin*, Bugra*, Hasan*]

        //previous method kullanimi
        List<String> List3 = new ArrayList<>();
        List3.add("Admin");
        List3.add("Bugra");
        List3.add("Hasan");
        System.out.println(List3);

        ListIterator<String> listItr = List3.listIterator();

        //pointer i en saga almak icin
        while (listItr.hasNext()){
            listItr.next();
        }

        //elemanlari en sondan basa dogru yazdiriniz
        while (listItr.hasPrevious()){
            String el = listItr.previous();
            System.out.println(el+ "<===");//Hasan<===   Bugra<===   Admin<===
        }




    }
}
