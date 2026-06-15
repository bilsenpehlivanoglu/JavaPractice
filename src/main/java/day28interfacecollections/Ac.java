package day28interfacecollections;

public interface Ac {

    public void cool();

    void run();

    public static final int price = 2000;

    /*
    1) bir interface i bir classin parenti yapmak icin implement keywordunu kullaniriz
    2)
     */

    /*
    INTERVIEW SORUSU
    Abstract class ile interface arasindaki farklar?
    1)Abstract class lar hem Abstract hemde concrete methodlar icerebilir fakat interface ler sadece Abstract icerir
    2)Abstract classlar multiple inheritance i desteklemez, ama interface ler destekler
    3)Abstract classlar icinde her turlu variable olusturulabilir,
    interface ler icindeki variable ler public,static ve final olmak zorundadir
    4)interface class in childi olamaz, ama Abstract class in child i olabilir.
    5)Abstract classlarda constructor vardir ama object uretemez,
    interface lerde constructor yoktur bu yuzden object uretilemez
     */
}
