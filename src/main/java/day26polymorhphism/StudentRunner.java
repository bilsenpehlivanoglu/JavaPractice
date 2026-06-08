package day26polymorhphism;

public class StudentRunner {
    public static void main(String[] args) {

        Student s1 = new Student();
        System.out.println(s1.getStdId());//AC20230614
        System.out.println(s1.getNotOrt());
        System.out.println(s1.isSuccessful());


        System.out.println("=============================");

        s1.setNotOrt(4.99);//burada degri degistirdik
        System.out.println(s1.getNotOrt());//4.99 burada okuduk

        s1.setStdId("MU1234567");//MU1234567
        System.out.println(s1.getStdId());

        s1.setSuccessful(true);
        System.out.println(s1.isSuccessful());//true
    }
}
