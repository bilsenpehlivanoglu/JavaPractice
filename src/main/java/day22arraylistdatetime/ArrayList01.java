package day22arraylistdatetime;

import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {

        //example: bir listteki tekrarsiz elemanlari console yazdiran kodu yazdiriniz.
        List<Double> prices = List.of(2.5,1.25,2.5,3.75,1.25,4.0);//bu sekildeki liste ekleme yapamayiz
        for (double w : prices){
            if (prices.indexOf(w) == prices.lastIndexOf(w)){
                System.out.println(w);//3.75 ,  4.0
            }
        }

        //example 2: bir listte tekrarli eleman olup olmadigini bulan kodu yaziniz
        List<Integer> heights = List.of(3,13,3);
        int counter=0;
        for (int w : heights){
            if (heights.indexOf(w) != heights.lastIndexOf(w)){
                counter++;
            }
        }
        if (counter==0){
            System.out.println("All elements are unique in the list");
        }else {
            System.out.println("At least one element is not unique in this list");
        }

    }
}
