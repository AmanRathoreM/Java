/*
Date 02-11-2021

In this advance Java tutorial, you will learn about Date class
*/

import java.util.Date;

public class tutorial_97 {
    public static void main(String[] args) {

        // * System.out.println(Long.MAX_VALUE);
        // * System.out.println(Long.MIN_VALUE);
        // * System.out.println(System.currentTimeMillis());

        Date date_1 = new Date();
        System.out.println(date_1);
        Date date_2 = new Date(Long.MAX_VALUE);
        System.out.println(date_2);

        System.out.println(date_1.getTime());
        // ! System.out.println(date_1.getDate()); // * Decrypted
        // ! System.out.println(date_1.getSeconds()); // * Decrypted
        // ! System.out.println(date_1.getYear()); // * Decrypted

    }
}
