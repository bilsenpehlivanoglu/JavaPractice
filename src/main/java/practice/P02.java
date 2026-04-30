package practice;

public class P02 {

    /*
    Write a function which takes a number as input and returns t
    he sum of the absolute value of each of the number's decimal digits.

For example: (Input --> Output)

10 --> 1
99 --> 18
-32 --> 5
Let's assume that all numbers in the input will be integer values.

     */

    public static void main(String[] args) {

        //first
        int sum = 0;
        int a = 10;//1

        for (int i = a; i>0; i = i/10 ){
           sum = sum + i%10;
        }
        System.out.println(sum);//1

        //second
        int b = 99;//18
        int sum1 = 0;

        for (int i = b ; i>0 ; i = i/10){
            sum1 = sum1 + i%10;
        }
        System.out.println(sum1);//18


        //third
        int sum2 = 0;
        int c = -32;//5
        c = Math.abs(c);


        for (int i = c; i>0 ; i = i/10){
            sum2 = sum2 + i%10;
        }
        System.out.println(sum2);//5


    }
}
