package day23datetimevarargs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

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

        //gelecek ve gecmise nasil gidilir?
        LocalTime next = myCurrentTime.plusMinutes(13).plusHours(3).minusMinutes(13).minusHours(3);
        System.out.println(next);//13:57:35.304572
        //plus artirir
        //minus azaltir

        //Zaman formati nasil degistirilir?
        /*
        DataTime class ta kullanilan tarih saat formatlari
        HH : mm ==> 24 lu saat sistemi
        hh : mm ==> 12 li saat sistemi
        hh : mm a ==> 12 li saat sistemi AM, PM gosterilir
        HH : mm : ss ==> 24 li saat sistemi
        "mm" minute demektir. "MM" month demektir

        dd-MM-yyyy ==>gun ay yil
        MMM ==>Aug
        MMMM ==>August
         */

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm");
        String formattedMyCurrentTime = dtf1.format(myCurrentTime);
        System.out.println(formattedMyCurrentTime);//11:38

        //date formati nasil degistirilir?
        LocalDate myDate = LocalDate.of(2023,8,13);

        //tarihi ay, yil, gun sekline ceviriniz
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedMydate = dtf2.format(myDate);
        System.out.println(formattedMydate);//08/13/2023

        //25/Aug/22 tarihini yapiniz
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formattedMydate2 = dtf3.format(myDate);
        System.out.println(formattedMydate2);//13/Aug/23


    }
}
