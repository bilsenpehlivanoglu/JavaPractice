package day05concatinationoperatortypecasting;

public class TypeCasting {
    public static void main(String[] args) {

        //byte data type int data type a ceviriniz
        //Convert byte data type to int data type
        byte age = 13;
        int ageInt = age;//autowidening

        //int data type ini short data type ina cevirin
        //convert int data type to short data type
        int weight = 313;
        short weightShort = (short) weight;//explicitnarrowing

        //int data type i float data type a cevirin
        //convert int data type to float data type.
        int popupation = 123;
        System.out.println(popupation);
        float populationFloat = popupation;//Auto widening
        System.out.println(popupation);


    }

}
