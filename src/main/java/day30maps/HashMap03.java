package day30maps;

import java.util.Arrays;
import java.util.HashMap;

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
        System.out.println(Arrays.toString(words));//[I, like, you, like, like]

        //words array indeki kelimeler birer birer map te var mi yok mu diye kontrol edecegiz.
        //words array indeki kelimeler map te yoksa map e value su 1 olarak yerlestirilecek
        //words array indeki kelimeler map te varsa map e value su 1 olarak yerlestirilecek

        HashMap<String,Integer> occ = new HashMap<>();

        for (String w:words){
            Integer numOfOccurance = occ.get(w);

            if (numOfOccurance==null){
                occ.put(w,1);
            }else {
                occ.replace(w,numOfOccurance+1);
            }
        }
        System.out.println(occ);//{like=3, I=1, you=1}



    }
}
