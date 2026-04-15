package day08stringmanipulationmemoryusageifstatement;

public class Tekrar {
    public static void main(String[] args) {

        //Check if this string contains any characters.
        String s = "";
        boolean result = s.isEmpty();
        System.out.println(result);//true

        //Check if this string contains any characters except space.
        String s1 = "";
        boolean result1 = s1.isBlank();
        System.out.println(result1);//true

        //Print the sum of the indexes of the characters a, i, and e in a string.
        //Java is esay to learn ==>
        String s2 = "Java is esay to learn";
        int ida = s2.indexOf('a');
        int idi = s2.indexOf('i');
        int ide = s2.indexOf('e');
        System.out.println(ide + ida + idi);//14

        //At what index does the word "java" first appear in the string?
        //Ah Java vah Java
        String s3 = "Ah Java vah Java";
        int result2 = s3.indexOf("Java");
        System.out.println(result2);

        //Print the sum of the indexes of the last appears of the characters a, e, and i in the string.
        String v = "Java is easy to learn";
        int lastA = v.lastIndexOf('a');
        int lastE = v.lastIndexOf('e');
        int lastI = v.lastIndexOf('i');
        System.out.println(lastI + lastA + lastE);//40
    }
}
