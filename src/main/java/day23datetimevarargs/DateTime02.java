package day23datetimevarargs;

import java.time.LocalTime;

public class DateTime02 {
    public static void main(String[] args) {

        //Anlik zamani nasil aliriz?
        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime);

        //anlik zamanda bilesenler nasil alinir?
        int hour = myCurrentTime.getHour();
        System.out.println(hour);//13

        int minute = myCurrentTime.getMinute();
        System.out.println(minute);//43

        int second = myCurrentTime.getSecond();
        System.out.println(second);//36

        int nano = myCurrentTime.getNano();
        System.out.println(nano);//378526000


    }
}
