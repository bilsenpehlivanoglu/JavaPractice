package day18multidimensionalarray;

public class Md02 {
    public static void main(String[] args) {

        String students[][] = {{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}};
       //yukaridaki std arrayyindeki icinde m harfi olan isimleri console yazdiriniz.

        for (String [] w: students){

            for (String k : w){

                if (k.contains("m")){
                    System.out.println(k);//Kemal  Cemal
                }
            }
        }

        //example 2: bir integer multidimansional array olusturun, tum elemanlarin carpimin hesaplayiniz
        int nums [][] = {{5,4},{2,3,2},{7}};
        int result = 1;

        for (int [] w: nums){

            for (int k : w){
                result = result*k;
            }
        }
        System.out.println(result);//1680
    }
}
