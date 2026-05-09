package day17arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //array leri kisa yoldan nasil olsuturabiliriz?
        int arr[] = {63,19,313,353,7,100,4};
        System.out.println(Arrays.toString(arr));//[63, 19, 313, 353, 7, 100, 4]

        //example:verilen array de kac tane cift kac tane tek sayi oldugunu bulan kodu yaziniz.
        int sayac = 0;

        for (int w: arr){

            if (w%2 == 0){
                sayac++;
            }
        }
        System.out.println("Array de "+sayac+ " adet cift sayi "+ (arr.length-sayac)+ "adet tek sayi vardir");
        //Array de 2 adet cift sayi 5adet tek sayi vardir

        //example 2:size verilen bir string array deki isimlerdne 5 karakterden az character icerenleri console yazdiriniz
        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[1] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[3] = "Ayhan";
        stdNames[4] = "Filiz";

        for (:){

        }


    }
}
