package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //example 1:int  bir array olusturup icine 6 adet elaman yerlestirin.
        // Bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdirin
        int ages[] = new int[6];
        ages[0] = 20;
        ages[1] = 23;
        ages[2] = 19;
        ages[3] = 44;
        ages[4] = 15;
        ages[5] = 33;

        System.out.println(Arrays.toString(ages));//[20, 23, 19, 44, 15, 33]
        //first way
        //sort() methodu kucukten buyuge dogri dizer
        Arrays.sort(ages);//kucukten buyuge dogri dizildi
        System.out.println(Arrays.toString(ages));//[15, 19, 20, 23, 33, 44]
        System.out.println(ages[0] + ages[ages.length - 1]);//59 en kucuk en buyuk toplami

    }
}
