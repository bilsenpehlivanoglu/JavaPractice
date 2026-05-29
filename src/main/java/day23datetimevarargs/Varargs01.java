package day23datetimevarargs;

public class Varargs01 {
    public static void main(String[] args) {

      add(2,3,4,5);
    }

    //Toplama islemi yapan bir method olusturun.
    public static int add(int a, int b){
        return a+b;
    }

    public static int add(int a, int b,int c){
        return a+b+c;
    }

    public static int add(int a, int b,int c,int d){
        return a+b+c+d;
    }
}
