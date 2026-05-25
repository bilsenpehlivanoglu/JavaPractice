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
        System.out.println("Pls enter a letter");
        input.next().substring(0,1);

    }
}
