package day26polymorhphism;

public class Student {

      /*
       Encapsulation: kapsulleme
       Encapsulation ne demek? : data hiding, veri saklama
       Data nasil saklanir?: access modifierlari private yaparak data diger classlardan gorunmez hala getiririm
       Encapsulation yaptigimiz datayi,
        istersek diger classlardan get methodu olusturarak okuyabiliriz.

      */

    private String stdId = "AC20230614";

    public String stdName = "Ali Can";
    public int age = 23;
    private double notOrt = 3.53;
    private boolean successful = false;

    public String getStdId() {
        //bu classdaki private lari baska class dan okumak icin bu sekilde getter yapariz
        return stdId;
    }

    public double getNotOrt() {
        return notOrt;
    }

    public boolean isSuccessful() {
        return successful;
    }
}
