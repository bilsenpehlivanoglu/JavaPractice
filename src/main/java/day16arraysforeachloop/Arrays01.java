package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        int a= 13;
        //bu yapinin icinde sadece bir tane data depolanabilir
        //bir yapinin icinde coklu data depolayabilmek icin Array yapisi olusturulmustur

        //Array nasil olusturulur
        String stdNames [] = new String[5];
        System.out.println(Arrays.toString(stdNames));//yazdirmak icin bunu kullaniyoruz

        //Arrayler diger collectionlardan daha hizlidir
        //Arrayler diger collectionlardan daha az memory kullanilirlar

        //array e eleman eklmek
        stdNames[2]="Benna";
        stdNames[3]="Abd";
        stdNames[4]="Rec";
        stdNames[0]="Eki";
        stdNames[1]="Me";

        System.out.println(Arrays.toString(stdNames));

       //array den specific bir datayi yazdirmak icin
        System.out.println(stdNames[3]);
        System.out.println(stdNames[4]);

        //example: array deki her elemanin sonuna ! isareti koyup ekrana yazdir
        for (int i = 0; i < stdNames.length; i++) {
            System.out.print(stdNames[i] + "!");
        }

    }
}
