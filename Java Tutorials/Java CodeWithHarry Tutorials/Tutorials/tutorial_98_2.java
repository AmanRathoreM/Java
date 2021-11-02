/*
Date 02-11-2021

In this advance Java tutorial, you will learn about Calendar class
*/

import java.util.Calendar;
import java.util.TimeZone;

public class tutorial_98_2 {
    public static void main(String[] args) {

        Calendar cal_1 = Calendar.getInstance(TimeZone.getTimeZone("Canada/Yukon"));
        System.out.println(cal_1.getTimeZone());
        System.out.println(cal_1.getTimeZone().getID());
    }
}
