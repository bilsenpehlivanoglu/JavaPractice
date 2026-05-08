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


    }
}
