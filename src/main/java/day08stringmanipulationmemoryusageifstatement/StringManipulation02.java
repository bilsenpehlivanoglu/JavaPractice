package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation02 {
    public static void main(String[] args) {

        //example 1:String in belirli bir karakterinden baslayip belirli bir karaktere kadar dinamic bir sekilde aliniz.
        //Write a string dynamically, starting from a specific character and ending up with another specific character.
        String a = "abc@gmail.com";
        int starting = a.indexOf('@');
        int ending = a.indexOf('.');
        String company = a.substring(starting,ending);
        System.out.println(company);
    }
}
