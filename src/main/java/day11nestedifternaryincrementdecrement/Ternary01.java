package day11nestedifternaryincrementdecrement;

public class Ternary01 {
    public static void main(String[] args) {

        //Ternary Statement
        //example 1:sayi 10 dan kucuk ise kucuk yazdirin, degilse kucuk degil yazdirin.

        //if else cozumu
        int num = 3;

        if (num<10){
            System.out.println("small");
        }else {
            System.out.println("not small");
        }

        //ternary cozumu
        //condition ?  condition true ise calisir : condition false ise calisir ;
        String result = num<10 ?   "Small"    :      "Big"     ;
        System.out.println(result);

        //sayi cift ise "cift" tek ise "tek" yazdirin.
        int number = 5;
        if (number%2 ==0){
            System.out.println("The number is even");
        }else {
            System.out.println("The number is odd");
        }

        String result1 = number%2==0 ? "The number is even" : "The number is odd";
        System.out.println(result1);

        //sayi 0 dan buyukse "positive" degilse "pozitive degil" yazdirin
        int num1 = 3;

        String solve = num1>0 ? "Positive" : "Not positive";
        System.out.println(solve);
    }
}
