package day18multidimensionalarray;

import java.util.Arrays;

public class Md03 {
    public static void main(String[] args) {

        //example 1: iki boyutlu bir array i tek boyutlu bir array e ceviriniz.
        int numbers [][] = {{5,4},{2,3,2}};//bu iki boyutlu //==> {5,4,2,3,2} buna cevirecegiz

        int toplamElemanSayisi =0;//kac eleman oldugunu bulmaliyiz
        for (int [] w: numbers){
           toplamElemanSayisi = toplamElemanSayisi+ w.length;
        }

        int newArr[] = new int[toplamElemanSayisi];//tek boyutlu array

        int idsx = 0;
        for (int [] w: numbers){//elemanlari tek boyutluya aktariyoruz
            for (int k : w){
                newArr[idsx]=k;
                idsx++;
            }
        }
        System.out.println(Arrays.toString(newArr));//[5, 4, 2, 3, 2]





    }
}
