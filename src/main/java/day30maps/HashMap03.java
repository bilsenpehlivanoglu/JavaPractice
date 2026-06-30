package day30maps;

public class HashMap03 {
    public static void main(String[] args) {

        //example 1: verilen cumledeki kelimelerin gorunum sayisini veren kodu yaziniz
        //I like you, like like => I=1, like=3, you=1

        //\\p{Punct}" ==>tum noktalama isaretleri demek
        //tum noktalama isretlerinden temizledik
        String s = "I like you, like like!";
        s = s.replaceAll("\\p{Punct}","");
        System.out.println(s);//I like you like like

        //kelimelerin gorunum sayisini bulmak icin string i kelimelere bolduk
        String[] words = s.split(" ");



    }
}
