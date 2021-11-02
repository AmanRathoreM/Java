/*
Date 02-11-2021

In this advance Java tutorial, you will learn about java time API
*/

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class tutorial_100 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ld);
        System.out.println(lt);
        System.out.println(ldt);
    }
}
