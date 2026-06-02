package day24stringbuilder;

public class Sb02 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1);//Java is easy

        sb1.reverse();//string i ters cevirir
        System.out.println(sb1);//ysae si avaJ

        sb1.deleteCharAt(6);
        System.out.println(sb1);//ysae s avaJ

        sb1.delete(4,7);//baslangic index dahil bitis index haric dir
        System.out.println(sb1);//ysaeavaJ

        sb1.replace(2,5,"X");//2 dahil 5 haric olur
        System.out.println(sb1);//ysXvaJ

        sb1.insert(3,"O");//insert ekleme yapar
        System.out.println(sb1);//ysXOvaJ

        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Kava");

        int r1 = sb2.compareTo(sb3);//karsilastirma yapar
        System.out.println(r1);//0

        //StringBuilder nasil stringe cevrilir
        String str = sb2.toString().toUpperCase();
        System.out.println(str);//JAVA

        //String nasil strringbuilder a cevrilir
        StringBuilder newSb1 = new StringBuilder(str);
        System.out.println(newSb1);//JAVA


    }

}
