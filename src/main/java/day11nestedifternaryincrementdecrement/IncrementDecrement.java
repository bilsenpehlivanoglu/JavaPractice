package day11nestedifternaryincrementdecrement;

public class IncrementDecrement {
    public static void main(String[] args) {

        //Increment
        int a =5;
        System.out.println(a);//5

        a = a+2;
        System.out.println(a);//7

        a= a+2;
        System.out.println(a);//9

        //example:Integer variable olusturup iki sekilde 5 artirin.
        int b = 5;
        System.out.println(b);//5

        b = b+5;
        System.out.println(b);//10

        //Decrement
        int c = 8;

        c = c-3;//5

        c -=3;
        System.out.println(c);//2

        //Increment 2
        int d = 6;

        d = d*2;//12

        d*=2;//24

        //Decrement 2
        int e = 24;

        e = e/2;//12

        e/=2;//6

       // "1" ile increment
        int f = 12;
//        f = f+1;
//        f+=1;
        f++;//bunu kullan

       // 1 ile decrement
        int h = 10;
        h--;

        // "post increment"(sonra) ve "pre-increment"(once)
        int i = 10;
        int k = i++;//post inc

        int m =15;
        int n = ++m;//pre inc

        //example
        int p = 17;
        int r = p--;
        System.out.println(p);//16
        System.out.println(r);//17

        int s = 20;
        int t = --s;
        System.out.println(s);//19
        System.out.println(t);//19




    }
}
