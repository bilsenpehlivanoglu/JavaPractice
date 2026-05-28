package day22arraylistdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

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

        System.out.println(myCurrentDate.plusDays(5).
                plusMonths(2).
                plusYears(3));//2026-06-01


        //specific bir tarih olusturmak icin
        LocalDate date1 = LocalDate.of(1999,8,10);
        LocalDate date2 = LocalDate.of(1980,8,10);

        //bir tarihin bir tarihten once mi sonra mi olup olmadigi nasil kontrol edilir?
        boolean r1 = date1.isAfter(date2);
        System.out.println(r1);//true

        boolean r2 = date1.isBefore(date2);
        System.out.println(r2);//false

        boolean r3 = date1.isEqual(date2);
        System.out.println(r3);//false

        //Month bir enum dir
        //Java da sabit degerler9ay isimleri, haftanin gunlerinin isimleri, ulkedeki sehir isimleri)depolamak icin kullanilir
        Month monthName = myCurrentDate.getMonth();
        System.out.println(monthName);//MAY

        //DayOfWeek de bir enumdir
        DayOfWeek dayName = myCurrentDate.getDayOfWeek();
        System.out.println(dayName);//THURSDAY

        //ileriki bir tarihe nasil gidilir?
        System.out.println(myCurrentDate.plusDays(5).plusMonths(2).plusYears(3));//2029-08-02

        //gecmis tarihe nasil gidilir?
        System.out.println(myCurrentDate.minusYears(21).
                minusMonths(2).minusDays(5));//2005-03-22

    }
}
