package day33exceptionsenumiterator;

public class EnumRunner {
    public static void main(String[] args) {

        //enumdaki dataya nasil ulasabiliriz?

        Cities hatay = Cities.HATAY;
        System.out.println(hatay);//HATAY

        //adana nin ismine nasil ulasiriz( getter lar sayesinde)
        String adanaCityName = Cities.ADANA.getCityName();
    }
}
