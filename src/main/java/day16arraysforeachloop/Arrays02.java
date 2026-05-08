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

        System.out.println(arr[0].length() + arr[arr.length - 1].length());//7

        //example 2: string bir array olusturup icine 5 eleman ekleyin
        //tum elemanlarin icerdigi karakter sayilari toplamini ekrana yazdirin.
        String brr[] = new String[5];
        brr[0] = "Miami";
        brr[1] = "New hampshire";
        brr[2] = "Bedford";
        brr[3] = "New york";
        brr[4] = "Boston";

        //first way for loop
        int totalChar = 0;
        for (int i = 0; i < brr.length; i++) {
           totalChar = totalChar + brr[i].length();
        }
        System.out.println(totalChar);//39

        //second way for each loop
        //baslangic degeri, loop calisma sarti, increment-decrement kismini kendisi halleder.
        //for each loop sadece "Array lerde collectionlarda" kullanilir

       /* for (DataType w: arr/collection){

        }*/

        int sum = 0;
        for (String w : brr){
           sum = sum + w.length();
        }
        System.out.println(sum);//39

        //example 3: notlar adinda integer bir array olusturun icine 6 tane not yerlestirin
        // ve not ortalamasini ekrana yazdirin.
        int notlar [] = new int[6];
        notlar[0] = 50;
        notlar[1] = 70;
        notlar[2] = 60;
        notlar[3] = 40;
        notlar[4] = 90;
        notlar[5] = 80;
        System.out.println(Arrays.toString(notlar));//[50, 70, 60, 40, 90, 80]

        int toplam = 0;
        for (int w:notlar){
            toplam = toplam + w;
        }
        System.out.println(toplam/notlar.length);//65

    }
}
