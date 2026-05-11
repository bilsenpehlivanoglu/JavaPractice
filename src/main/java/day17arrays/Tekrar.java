package day17arrays;

import java.util.Arrays;

public class Tekrar {
    public static void main(String[] args) {

        //array leri kisa yoldan nasil olsuturabiliriz?
        //[63, 19, 313, 353, 7, 100, 4]
        int num [] = {63, 19, 313, 353, 7, 100, 4};
        System.out.println(Arrays.toString(num));//[63, 19, 313, 353, 7, 100, 4]

        //example:verilen array de kac tane cift kac tane tek sayi oldugunu bulan kodu yaziniz.
        int counter = 0;
        for (int w : num){
            if (w%2 == 0){
                counter++;
            }
        }
        System.out.println("Array de "+counter+ "adet cift sayi" + (num.length-counter)+ "adet tek sayi vardir");
    }
}
