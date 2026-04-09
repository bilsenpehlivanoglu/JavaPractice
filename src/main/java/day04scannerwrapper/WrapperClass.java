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

    }
}
