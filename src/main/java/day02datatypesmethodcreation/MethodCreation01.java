package day02datatypesmethodcreation;

public class MethodCreation01 {

    public static void main(String[] args) {

    int solution = addition(3,5);
        System.out.println(solution);

    }
    //method olusturmak icin: access modifier + return type + method ismi + () + {}
    //Create a method to perform the addition operation.
    public static int addition(int a, int b){
        return a+b; //return demek:methodun cagrildigi yere return eder.
    }
   //main method static oldugu icin, main method icinde kullanacagimiz hersey static olmalidir.



}
