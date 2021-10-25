/*
Date 25-10-2021

In this Java tutorial, you will learn about Error handling in Java
*/

import java.util.Scanner;

public class tutorial_79 {
    public static void main(String[] args) {

        // * Below given are some Syntax Errors
        // ! int a = 0 // Error: no semicolon!
        // ! b = 8; // Error: b not declared!

        // * Below given is example of Logical Error
        // * Write a program to print all prime numbers between 1 to 10
        for (int i = 1; i < 50;) {
            i = i + i;
            System.out.println(i);
        }

        // * Below given is example of Runtime Error
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a non-integer value to generate a Runtime Error ---> ");
        int val = input.nextInt();
        System.out.println("your entered Integer is ---> " + val);

    }
}
