package day24stringbuilder;

public class Sb03 {
    public static void main(String[] args) {

/*
1)StringBuffer java da string ureten bir diger class dir.
    StringBuffer java nin string uretmek icin olusturdugu ilk class dir
2)StringBuffer, StringBuilder a cok benzer yani ikiside "mutable" string uretir
3)StringBuffer "multi-thread dir" ama   StringBuilder degildir
4)StringBuilder multi-thread olmadigi icin  StringBuffer dan daha hizli calisir.

3 tane string olustruran class vardir
   a)immutable String class
   b)mutable StringBuilder class
   c)mutable StringBuffer class

 */

        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf);//Java

    }
}
