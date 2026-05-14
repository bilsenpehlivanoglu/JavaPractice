package day18multidimensionalarray;

import java.util.Arrays;

public class Tekrar {
    public static void main(String[] args) {

        int a [][] = new int[3][2];

        a[1][0] = 5;
        a[1][1] = 10;
        a[0][0] = 15;
        a[0][1] = 50;
        a[2][0] = 25;
        a[2][1] = 130;

        System.out.println(Arrays.deepToString(a));//[[15, 50], [5, 10], [25, 130]]


        //multidimensional arrayleri icinden specific eleman yazdirmak
        System.out.println(a[1][0]);//5

        //array icinde bir array nasil yazdirilir?
        System.out.println(Arrays.toString(a[1]));//[5, 10]
        System.out.println(Arrays.toString(a[2]));//[25, 130]

        //kisa yoldan multi array nasil olusturulur?
       String students [][] = {{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}};

        //example 1: Yukaridaki students arrayin de toplam kac isim oldugunu bulunuz?

        int sum = 0;
        for (String [] w: students){
            sum = sum + w.length;
        }
        System.out.println(sum);//8

        //yukaridaki std arrayyindeki icinde m harfi olan isimleri console yazdiriniz.

        for (String [] w: students){
            for (String k : w){
              if (k.contains("m")){
                  System.out.println(k);//Kemal Cemal
              }
            }
        }

        //example 2: bir integer multidimansional array olusturun, tum elemanlarin carpimin hesaplayiniz
        int multy [][] = {{3,2},{4},{5,7},{5,2,9}};

        int result = 1;
        for (int [] w: multy){
            for (int k : w){
              result= result * k;
            }
        }
        System.out.println(result);

        //example 1: bir int multi arraydeki en kucuk ve en bjuyuk elemanlarin toplamlarini bulun
        int sum2 [][] = {{1,7},{3,2,4},{19,9}};
        int min = sum2[0][0];
        int max = sum2[0][0];

        for (int [] w: sum2){
            for (int ca: w){
               min = Math.min(min,ca);
               max = Math.max(max,ca);
            }
        }
        System.out.println(min + max);//20

    }
}
