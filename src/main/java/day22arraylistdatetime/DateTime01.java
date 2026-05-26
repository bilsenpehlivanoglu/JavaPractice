package day22arraylistdatetime;

import java.time.LocalDate;

public class DateTime01 {
    public static void main(String[] args) {

        //icinde bulundugumuz zaman dilimindeki tarihi nasil aliriz?
        LocalDate myCurrentDate = LocalDate.now();
        System.out.println("myCurrentDate = " + myCurrentDate);//2026-05-25

        //tarih ten istedigimiz bileseni nasil aliriz?
        int monthValue = myCurrentDate.getMonthValue();
        System.out.println(monthValue);//5 (5.ay)

        int yearValue = myCurrentDate.getYear();
        System.out.println(yearValue);//2026

        int dayValue = myCurrentDate.getDayOfMonth();
        System.out.println(dayValue);//25




    }
}
