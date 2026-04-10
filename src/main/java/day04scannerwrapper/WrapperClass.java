package day04scannerwrapper;

public class WrapperClass {
    public static void main(String[] args) {

        //primitive:char, boolean, byte, short, int, long, float, double
        //wrapper class(bunda method da vardir): Character, Boolean, Short, Byte, Integer, Long, Float, Double

        int n = 12;
       //n yazip nokta koyarsak n. method goremeyiz

        Integer m = 12;
        //m yazip nokta koyarsak m. method gorebilriz
        //wrapper class lar non-primitive dir

        //short data type inin min ve max degerlerini bulunuz
        //Find the minimum and maximum values of the short data type.
        short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort);

        short minShort = Short.MIN_VALUE;
        System.out.println(minShort);

        //int data type in min degeri ile byte data type in max degerleri toplamini bulunuz
        //Find the sum of the minimum value of the `int` data type and the maximum value of the `byte` data type.
        int minInt = Integer.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;

        System.out.println(minInt+maxByte);

    }
}
