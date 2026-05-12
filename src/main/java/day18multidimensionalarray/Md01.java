package day18multidimensionalarray;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {

        //bir array in elemanlari array ise bunlar multidimensional array dir.
        //multidimensional array nasil olusturulur?
        int a [][] = new int[3][2];

       // multidimensional array e nasil eleman eklenir?
        a[0][0] = 5;
        a[1][1] = 45;
        a[2][0] = 123;
        a[0][1] = 12;
        a[1][0] = 81;
        a[2][1] = 0;

        //multidimensional array nasil yazdirilir?
        System.out.println(Arrays.toString(a));
    }
}
