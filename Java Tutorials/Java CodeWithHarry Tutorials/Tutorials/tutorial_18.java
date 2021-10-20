/*
Date 20-10-2021

In this Java tutorial, you will learn about Conditional switch case statements
*/

import java.util.Scanner;

public class tutorial_18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age --> ");
        short age = input.nextShort();

        switch (age) {
        case 18 -> System.out.println("Now you are eligible of driving!");
        case 60 -> System.out.println("You are too old to for driving!");
        case 27 -> System.out.println("You are perfect for driving!");
        default -> System.out.printf("We don\'t know what to do with your age!\nBecause your age is %d", age);
        }
    }
}
