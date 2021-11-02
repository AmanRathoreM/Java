/*
Date 02-11-2021

In this advance Java tutorial, you will learn about Date and Time classes
*/

//! import java.time;

public class tutorial_96 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            System.out.println(System.currentTimeMillis());
        }
        System.out.println(System.currentTimeMillis() / 1000 / 3600 / 24 / 365);
    }
}
