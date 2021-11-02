/*
Date 02-11-2021

In this advance Java tutorial, you will learn about Calendar class
*/

import java.util.Calendar;

public class tutorial_98_1 {
    public static void main(String[] args) {
        Calendar cal_1 = Calendar.getInstance();
        System.out.println(cal_1.getCalendarType());
        System.out.println(cal_1.getTimeZone());
    }
}
