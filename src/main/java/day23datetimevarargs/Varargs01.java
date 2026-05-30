package day23datetimevarargs;

public class Varargs01 {
    public static void main(String[] args) {

        System.out.println(add(2, 3, 4));//9
    }
    //Kullanici farkli sayida toplama yapmak isteyebilir,
    //bu yuzden farkli sayidaki parametreleri kabul eden varargs yapisini olsuturmustur.
    //Varargs lar array yapisini kullanir.

    public static int add(int... a){
     int sum = 0;
     for (int w:a){
         sum = sum+w;
     }
     return sum;
    }

    //Toplama islemi yapan bir method olusturun.
//    public static int add(int a, int b){
//        return a+b;
//    }
//
//    public static int add(int a, int b,int c){
//        return a+b+c;
//    }
//
//    public static int add(int a, int b,int c,int d){
//        return a+b+c+d;
//    }
}
