package day18multidimensionalarray;

import java.util.Arrays;

public class Tekrar {
    public static void main(String[] args) {

        int a [][] = new int[3][2];

        a[1][0] = 5;
        a[1][1] = 10;
        a[0][0] = 15;
        a[0][1] = 50;
        a[2][0] = 25;
        a[2][1] = 130;

        System.out.println(Arrays.deepToString(a));//[[15, 50], [5, 10], [25, 130]]

        
    }
}
