package day06swapvaluesstringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {

        String s = "Learn Java earn money";

        //example 1:stringin money kelimesi ile bitip bitmedigini kontrol ediniz
        //Check if the string ends with the word "money".

        boolean end = s.endsWith("money");
        System.out.println(end);//true
    }
}
