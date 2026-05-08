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


        //example 2: string bir array olusturup icine 5 eleman ekleyin
        //tum elemanlarin icerdigi karakter sayilari toplamini ekrana yazdirin.
        String brr[] = new String[5];
        brr[0] = "Miami";
        brr[1] = "New hampshire";
        brr[2] = "Bedford";
        brr[3] = "New york";
        brr[4] = "Boston";

        int total = 0;
        for (int i = 0; i<brr.length; i++){
            total = total + brr[i].length();
        }
        System.out.println(total);//39

        //second
        int sum = 0;
        for (String w: brr){
            sum = sum + w.length();
        }
        System.out.println(sum);//39

        //example 3: notlar adinda integer bir array olusturun icine 6 tane not yerlestirin
        // ve not ortalamasini ekrana yazdirin.
        int notlar[] = new int[6];

        notlar[0] = 60;
        notlar[1] = 50;
        notlar[2] = 40;
        notlar[3] = 30;
        notlar[4] = 20;
        notlar[5] = 80;

        int average = 0;
        for (int w: notlar){
            average = average + w;
        }
        System.out.println(average/notlar.length);//46

        //example 1:int  bir array olusturup icine 6 adet elaman yerlestirin.
        // Bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdirin
        int number[] = new int[6];

        number[0] = 30;
        number[1] = 20;
        number[2] = 10;
        number[3] = 40;
        number[4] = 50;
        number[5] = 60;

        int min = number[0];
        int max = number[0];

        for (int w : number){
           min = Math.min(min,w);
           max = Math.max(max,w);
        }
        System.out.println(min + max);//70

        //example 2: String bir array olsuturun 6 eleman ekleyin. Yellow dan onceki elemanlari yazdirin
       String colors[] = new String[6];

       colors[0] = "Red";
       colors[1] = "Green";
       colors[2] = "Gray";
       colors[3] = "Black";
       colors[4] = "Yellow";
       colors[5] = "Orange";

       for (String w: colors){

           if (w.equals("Yellow")){
               break;
           }
           System.out.print(w+ " ");//Red Green Gray Black

       }



    }
}
