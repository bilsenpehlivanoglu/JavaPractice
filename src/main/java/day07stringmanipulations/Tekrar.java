package day07stringmanipulations;

public class Tekrar {
    public static void main(String[] args) {

        //example 1:bir stringin bas ve sonunda space karakteri varsa siliniz.
        //If a string contains a space at the beginning or end, delete them.
        //" Ali Can " ==>Ali Can
        String s = "  Ali Can  ";
        System.out.println(s);
        String s1 = s.trim();
        System.out.println(s1);
    }
}
