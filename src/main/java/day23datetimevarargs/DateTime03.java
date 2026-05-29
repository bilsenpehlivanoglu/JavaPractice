package day23datetimevarargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime03 {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);//2026-05-29T14:15:35.874008

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm");
        String formattedLtd = dtf.format(ldt);
        System.out.println(formattedLtd);//05/29/2026 02:21

    }
}
