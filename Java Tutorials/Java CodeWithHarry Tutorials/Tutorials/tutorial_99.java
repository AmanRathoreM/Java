/*
Date 02-11-2021

In this advance Java tutorial, you will learn about Gregorian Calendar class
*/

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class tutorial_99 {
    public static void main(String[] args) {

        // Date date = new Date();
        // Calendar cal = Calendar.getInstance();

        // * System.out.println(cal.getTime());
        // * System.out.println(cal.get(Calendar.YEAR));
        // * System.out.println(cal.get(Calendar.SECOND));
        // * System.out.println(cal.get(Calendar.HOUR));
        // * System.out.println(cal.get(Calendar.MINUTE));
        // * System.out.println(cal.get(Calendar.HOUR_OF_DAY));

        GregorianCalendar gre_cal = new GregorianCalendar();
        for (String time_zone : TimeZone.getAvailableIDs()) {
            System.out.println(time_zone);
        }
        System.out.println(gre_cal.isLeapYear(1254));
    }
}
