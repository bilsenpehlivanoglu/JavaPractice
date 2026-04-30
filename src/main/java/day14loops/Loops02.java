package day14loops;

public class Loops02 {
    public static void main(String[] args) {

        //example 1:5 den 8 e kadar tam sayilarinin toplamini veren kodu yaziniz
        //5+6+7+8==>26
        int sum = 0;
        for (int i = 5; i<9 ; i++){
            sum = sum+i;
        }
        System.out.println(sum);//26
    }
}
