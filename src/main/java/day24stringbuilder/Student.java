package day24stringbuilder;

public class Student {

    /*
    Access modifier:
    1)Public
    2)Prorected
    3)Default(Access modifier i default yapmak icin access modifier yazmayiz)
    4)Private

    Note:Access modifierlari genisden dara dogri siralayiniz
    public > protected > default > private

    public:her class dan kullanilabilir
    protected:baska package dan kullanilamaz ama baska package de child class icinden kullanilir
    default:baska package den kullanilamazlar
    private:sadece olurturulduklari class icinden kullanilabilirler

    Note : protected ile default arasindaki fark nedir?
           protected olanlar baska package den kullanilamaz ancak basla package de child class icinden kullanilabilir
           default olanlar baska package den kullanilamaz

     */

    //public her class dan kullanilabilir.
    public String stdName = "Ali Can";

    //protected baska packageden sadece child class dan icinde bulundugu class tan gorulur.
    protected String address = "Istanbul";

    //default lari ayni packageden gorebiliriz ancak diger packagelerden child bile olsa ulasilamaz
    String email = "alican@gmail.com";

    private String SsnId = "123456789";

}
