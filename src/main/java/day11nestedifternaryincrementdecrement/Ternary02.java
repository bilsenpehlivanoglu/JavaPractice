package day11nestedifternaryincrementdecrement;

public class Ternary02 {
    public static void main(String[] args) {

        //example 1:
        int a = 10;
        int b = 20;

        int r1 = a<b ? a++ : ++b;
        System.out.println(r1);
        System.out.println(a);//11
        System.out.println(b);//20
    }
}
