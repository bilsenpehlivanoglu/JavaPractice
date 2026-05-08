package day16arraysforeachloop;

import java.util.Arrays;

public class Tekrar {
    public static void main(String[] args) {

        //6 elemanli bir array olustur ve her elemanin sonuna ! isareti koyup ekrana yazdir

        String names [] = new String[6];

        names[0] = "Mac";
        names[1] = "Ben";
        names[2] = "Ned";
        names[3] = "Ced";
        names[4] = "Did";
        names[5] = "Sey";

        System.out.println(Arrays.toString(names));//[Mac, Ben, Ned, Ced, Did, Sey]

        System.out.println(names[1]);//ben
        System.out.println(names[0]);//mac

        for (int i = 0; i<names.length; i++) {
            System.out.print(names[i] + "!");//Mac!Ben!Ned!Ced!Did!Sey!

        }
        System.out.println();
            //Example 1: String array olusturup icine 5 tane eleman ekleyin.
            // Ilk eleman ile son elmanin icerdigi karakter sayilari toplamini ekrana yazidir.
            String arr[] = new String[5];
            arr[0] = "Math";
            arr[1] = "Science";
            arr[2] = "Music";
            arr[3] = "English";
            arr[4] = "Art";

            System.out.println(arr[0].length() + arr[arr.length - 1].length());


    }
}
