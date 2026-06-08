package day26polymorhphism;

public class Student {

      /*
       Encapsulation: kapsulleme
       Encapsulation ne demek? : data hiding, veri saklama
       Data nasil saklanir?: access modifierlari private yaparak data diger classlardan gorunmez hala getiririm
       Encapsulation yaptigimiz datayi,
        istersek diger classlardan get methodu olusturarak okuyabiliriz.

        get methodlar public olur
        get methodun return type i variable nin kiyle ayni olur
        get methodun boolean bir variable icin olsuturulmus ise get method ismi ile baslar.



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

    /*
    Encapsulation da ser methodu ile datanin degerini degistirrbiliriz
    1)set methodlar public olur
    2)set methodlarin return type void olur
    3)set methodlar parametre kullanir,parametrenin data typei variable ile ayni olur
     */

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }
}
