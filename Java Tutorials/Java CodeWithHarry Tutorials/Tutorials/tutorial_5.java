/*
Date 16-10-2021

In this Java tutorial, you will learn about taking input from user
*/

import java.util.Scanner;

public class tutorial_5 {
    public static void main(String[] args) {

        System.out.println("Enter first variable to add!");
        Scanner input_from_user_1 = new Scanner(System.in);
        float num_1 = input_from_user_1.nextFloat();
        System.out.println("Enter second variable to add!");
        Scanner input_from_user_2 = new Scanner(System.in);
        float num_2 = input_from_user_2.nextFloat();

        System.out.println("The sum of " + num_1 + " and " + num_2 + " is " + (num_1 + num_2));

    }
}
