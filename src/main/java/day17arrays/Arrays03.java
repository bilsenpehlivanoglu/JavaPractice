package day17arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //example 1: specific bir elemani array de olup olmadigini anlamak icin gereken kodu yaziniz
        String names[] = {"K","C","R","A","S"};
        String el = "R";

        //first way
        int counter = 0;
        for (String w: names){
            if (w.equals(el)){
                counter++;
                break;
            }
        }
        if (counter>0){
            System.out.println("Array has "+el);
        }else {
            System.out.println("Array doesn't have "+el);
        }

        //second way: binarysearch() methodu :
        Arrays.sort(names);
        int result = Arrays.binarySearch(names,el);

        if (result<0){
            System.out.println("Array doesn't have "+el);
        }else {
            System.out.println("Array has "+el);
        }



        int num1 = Arrays.binarySearch(names,"A");
        System.out.println(num1);//0 ==>var ve indexi 0 demek oluyor

        int num2 = Arrays.binarySearch(names,"K");
        System.out.println(num2);//2 ==>var ve indexi 0 demek oluyor



    }
}
