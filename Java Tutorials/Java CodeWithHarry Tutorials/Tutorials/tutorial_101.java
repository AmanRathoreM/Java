/*
Date 02-11-2021

In this advance Java tutorial, you will learn about Date Time Formatters in Java
*/

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class tutorial_101 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter date_format = DateTimeFormatter.ofPattern("HH:mm:ss||MM-dd-yyyy");

        System.out.println(ldt);
        System.out.println(ldt.format(date_format));
    }
}
