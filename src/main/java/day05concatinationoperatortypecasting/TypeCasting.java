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

       //double data type i short data type cevirin
        //convert double data type to short data type
        double number= 12.99;
        System.out.println(number);//12.99
        short numberShort = (short) number;
        System.out.println(numberShort);//12 //Explicit narrowing

       //example
        short num = 260;
        System.out.println(num);//260

        byte numByte = (byte) num;
        System.out.println(numByte);//4


    }

}
