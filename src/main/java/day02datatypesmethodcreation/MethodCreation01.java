package day02datatypesmethodcreation;

public class MethodCreation01 {

    public static void main(String[] args) {

    int solution = addition(3,5);
        System.out.println(solution);

    int cozum = cikarmaIslemi(10,3);
        System.out.println(cozum);

    int sonuc = bolmeIslemi(8,2);
        System.out.println(sonuc);

    long sonuc1 = multiply(2,5);
        System.out.println(sonuc1);

    }
    //method olusturmak icin: access modifier + return type + method ismi + () + {}
    //Create a method to perform the addition operation.
    public static int addition(int a, int b){
        return a+b; //return demek:methodun cagrildigi yere return eder.
    }
   //main method static oldugu icin, main method icinde kullanacagimiz hersey static olmalidir.

   public static int cikarmaIslemi(int c, int d){
        return c-d;
   }
   public static int bolmeIslemi(int a, int b){
        return a/b;
   }
   protected static long multiply(int e,int f){
        return e*f;
   }


}
