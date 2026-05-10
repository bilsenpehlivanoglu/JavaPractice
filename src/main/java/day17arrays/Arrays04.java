package day17arrays;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {

        //size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz
        String s = "Java is easy. Learn Java earn money";
        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words));//[Java, is, easy., Learn, Java, earn, money]
    }
}
