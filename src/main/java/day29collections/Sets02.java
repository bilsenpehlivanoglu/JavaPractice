package day29collections;

import java.util.TreeSet;

public class Sets02 {
    public static void main(String[] args) {

        //example : ogrenci email adresslerini naturel ordera gore siralanmis sekilde depolayiniz.
        //1 way
        TreeSet<String> emails = new TreeSet<>();
        emails.add("z@gmail.com");
        emails.add("b@gmail.com");
        emails.add("k@gmail.com");
        emails.add("v@gmail.com");
        emails.add("h@gmail.com");
        emails.add("e@gmail.com");
        emails.add("a@gmail.com");
        emails.add("m@gmail.com");
        System.out.println(emails);
        //[a@gmail.com, b@gmail.com, e@gmail.com, h@gmail.com, k@gmail.com, m@gmail.com, v@gmail.com, z@gmail.com]
    }
}
