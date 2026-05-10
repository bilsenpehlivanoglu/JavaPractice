package day17arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {

        //example 1: kullanicinin coklu datayi bir array e yerlestirebilmesi ,
        // istedigi zaman durdurabilmesi icin gereken kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("eklemek istediginiz ogrenci sayisini giriniz");
        int numOfElements = input.nextInt();

        String stdNames[] = new String[numOfElements];
        System.out.println("islemi durdurmak icin 'q' ya basiniz");

        for (int i = 0; i< stdNames.length; i++){

            System.out.println((i+1)+ " . ogrencinin ismini giriniz");
            String name = input.next();
            if (name.equalsIgnoreCase("q")){
                break;
            }else {
                stdNames[i] = name;
            }
        }
        System.out.println(Arrays.toString(stdNames));


    }
}
