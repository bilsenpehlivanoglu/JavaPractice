package day22arraylistdatetime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {
    public static void main(String[] args) {

        //example 1: kullanicinin girdigi harf list te varsa o harfi "buldum" a cevirin yoksa liste ekleyin.
        //string class kullanmak tercih edilir, cunku string class method acisindan cok zengindir.

        List<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("H");
        myList.add("J");

        Scanner input = new Scanner(System.in);

        int counter=0;
        int can = 3;

        do {

            if (counter==3){
                System.out.println("Game Over");
                break;
            }
            System.out.println("Pls enter a letter");
            String letter = input.next().toUpperCase().substring(0,1);

            if (myList.contains(letter)){
                myList.set(myList.indexOf(letter),"Buldum");
            }else {
                myList.add(letter);
            }
            System.out.println(myList);

            counter++;

        }while (true);

    }
}
