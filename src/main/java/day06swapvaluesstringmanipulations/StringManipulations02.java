package day06swapvaluesstringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {

        String s = "Learn Java earn money";

        //example 1:stringin money kelimesi ile bitip bitmedigini kontrol ediniz
        //Check if the string ends with the word "money".

        boolean end = s.endsWith("money");
        System.out.println(end);//true

        //example 2:stringdeki money kelimesini dollar kelimesine ceviriniz.
        //Replace the word "money" with "dollar" in the string.
        String s1 = s.replace("money","dollar");
        System.out.println(s1);//Learn Java earn dollar

        //example 3:stringdeki earn kelimesini win kelimesine ceviriniz.
        //Replace the word "earn" with "win" in the string.
        String s2 = s.replace("earn","win");
        System.out.println(s2);//Lwin Java win money

        //example 4:stringdeki a harflerini * a ceviriniz.
        //Replace the 'a' letters in the string with *.
        String s3 = s.replace('a','*');
        System.out.println(s3);//Le*rn J*v* e*rn money

        //example 5:stringdeki n harflerini XXX a ceviriniz.
        //Replace the 'n' letters in the string with XXX.
        String s4 = s.replace("n","xxx");
        System.out.println(s4);//Learxxx Java earxxx moxxxey

        //example 5:stringdeki tum 'e' harflerini siliniz.
        //Remove all 'e' characters from the string.
        String s5 = s.replace("e","");
        System.out.println(s5);//Larn Java arn mony



    }
}
