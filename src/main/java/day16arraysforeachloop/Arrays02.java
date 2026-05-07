package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //Example 1: String array olusturup icine 5 tane eleman ekleyin.
        // Ilk eleman ile son elmanin icerdigi karakter sayilari toplamini ekrana yazidir.
        String arr[] = new String[5];
        arr[0] = "Math";
        arr[1] = "Science";
        arr[2] = "Music";
        arr[3] = "English";
        arr[4] = "Art";
        System.out.println(Arrays.toString(arr));

        System.out.println(arr[0].length() + arr[arr.length - 1].length());

        //example 2: string bir array olusturup icine 5 eleman ekleyin
        //tum elemanlarin icerdigi karakter sayilari toplamini ekrana yazdirin.
        String brr[] = new String[5];
        brr[0] = "Miami";
        brr[1] = "New hampshire";
        brr[2] = "Bedford";
        brr[3] = "New york";
        brr[4] = "Boston";

        int totalChar = 0;
        for (int i = 0; i < brr.length; i++) {
           totalChar = totalChar + brr[i].length();
        }
        System.out.println(totalChar);//39

    }
}
