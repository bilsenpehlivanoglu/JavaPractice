package day34lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lambda01 {
    public static void main(String[] args) {

    /*
    Lambda: Functional Programing dir, Digeri ise Structurel Programming.
    1) Functional Programing de ne (ne yapilacak) (what to do) yapilacagi uzerine yogunlasilir
    2) Structurel Programming de ise (nasil yapilacak) (how to do) yapilacagi uzerine yogunlasilir
     */

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        printElements1(nums);
        System.out.println();
        printElements2(nums);
        System.out.println();
        printEven1(nums);
        System.out.println();
        printEven2(nums);
        System.out.println();
        printsSquareOfOddElements(nums);
        System.out.println();
        printCubeOfDistinctOddElements(nums);
        System.out.println();
        printSumOfSquaresOfDistinctEvenEl(nums);
        System.out.println();
        printProductOfSquaresOfDistinctEvenEl(nums);


    }

        // 1) bir listteki elemanlari ayni satirda aralarinda bosluk koyarak yaziniz Structurel
         public static void printElements1( List<Integer> nums) {
             for (Integer w : nums) {
                 System.out.print(w + " ");//12 9 131 14 9 10 4 12 15

             }

         }

            // 2) bir listteki elemanlari ayni satirda aralarinda bosluk koyarak yaziniz Functional
             public static void printElements2( List<Integer> nums) {
               nums.stream().forEach(t-> System.out.print(t+" "));

                 }



            //3) bir listteki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran methodu olusturunuz.
               public static void printEven1(List<Integer> nums){

                  for (Integer w: nums) {
                      if (w%2==0){
                          System.out.print(w+" ");//12 14 10 4 12
                      }
                  }
               }

            //4) bir listteki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran methodu olusturunuz.
            public static void printEven2(List<Integer> nums){

                 nums.stream().
                         filter(t->t%2==0).
                         forEach(t-> System.out.print(t+" "));
               }


           //5) bir listteki tek sayi olan elemanlarin karelerini ayni satirda aralarina
           // bosluk koyarak yazdiran methodu olusturunuz.
           public static void printsSquareOfOddElements(List<Integer> nums){
                nums.stream().
                        filter(t->t%2!=0).
                        map(t->t*t).
                        forEach(t-> System.out.print(t+" "));//81 17161 81 225
          }

    //6) bir listteki tek sayi olan elemanlarin kuplerini tekrarsiz ayni satirda aralarina
    // bosluk koyarak yazdiran methodu olusturunuz.

    public static void printCubeOfDistinctOddElements(List<Integer> nums){

        nums.stream().distinct().
                filter(t->t%2!=0).
                map(t->t*t*t).
                forEach(t-> System.out.println(t+" "));
    }

        //7) Bir listteki tekrarsiz cift elemanlarin karelerinin toplamini hesaplayan method olusturun

    public static void printSumOfSquaresOfDistinctEvenEl(List<Integer> nums){

        Integer sum = nums.stream().distinct().
                filter(t->t%2==0).
                map(t->t*t).reduce(0,(t,u)->t+u);
        System.out.println(sum);//456
    }

    //8) Bir listteki tekrarsiz elemanlardan cift olanlarin karesinin carpimini hesaplayan method olusturun
          public static void printProductOfSquaresOfDistinctEvenEl(List<Integer> nums){
            Integer product = nums.stream().
                    distinct().filter(t->t%2==0).
                    map(t->t*t).reduce(1,(t,u)->t*u);
              System.out.println(product);//45158400
          }

          //9) Verilen listteki maximum degeri bulmak icin method olusturun
           //first way,recommended
            public static void getMaxValue1(List<Integer> nums){
               Integer max = nums.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)->t>u?t:u);
                System.out.println(max);
            }

            //second way
            public static void getMaxValue2(List<Integer> nums){
                Integer max2 = nums.stream().distinct().reduce(nums.get(0),(t,u)->t>u?t:u);
                System.out.println(max2);
            }

            //third way
            public static void getMaxValue3(List<Integer> nums){
                nums.stream().distinct().sorted().reduce((t,u)->u);
            }








}

