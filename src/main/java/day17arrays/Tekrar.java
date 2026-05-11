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

        //example 2:size verilen bir string array deki isimlerdne 5 karakterden az character icerenleri console yazdiriniz
        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[1] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[3] = "Ayhan";
        stdNames[4] = "Filiz";

        for ( String w: stdNames){
           if (w.length()<5){
               System.out.println(w);//Ajda  Tom
           }
        }

        //example 3: size verilen bir string array deki isimeri alfabetic siraya koyduktan sonra
        // "F" ile baslayan isimler haric diger isismleri konsolla yazdirin

        Arrays.sort(stdNames);
        for (String w: stdNames){
            if (w.startsWith("F")){
                continue;
            }
            System.out.println(w);
        }

        //example 1: specific bir elemani array de olup olmadigini anlamak icin gereken kodu yaziniz
        String ch [] = {"A","B","D","F","E","M"};
        String data = "B";

        Arrays.sort(ch);
        int s = Arrays.binarySearch(ch,data);

        if (s<0){
            System.out.println("Array has not B character");//Array has B character
        }else {
            System.out.println("Array has B character");
        }

        //size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz
        String sentence = "Java is easy. Learn Java earn money";
        String word[] = sentence.split(" ");
        System.out.println(Arrays.toString(word));//[Java, is, easy., Learn, Java, earn, money]



    }
}
