package day19passbyvaluemethodoverloading;

public class MethodOverloading01 {
    public static void main(String[] args) {

     add(3,5);//int - int
     add(3,5.5);// int - double



    }

    public static void add(int a,int b){
        System.out.println(a+b);//8
    }

    public static void add(double a,double b){
        System.out.println(a+b);//
    }

    public static void add(double a,int b){
        System.out.println(a+b);//8
    }

    public static void add(int a,double b){
        System.out.println(a+b);//8
    }

    public static void add(int a,int b,int c){
        System.out.println(a+b+c);//
    }

    //method Overloading de isim degistirilemez
    //parametreler degistirilebilir
    //bunlari degistirirken, oarametrelerin data type lari degistirilebilir.
    //oarametrelerin degistirirken sayisi degistirilebilir
    //oarametrelerin degistirirken yerleri degistirilebilir
    //static methodlar overload edilebilir

}


