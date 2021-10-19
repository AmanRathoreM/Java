/*
Date 19-10-2021

This tutorial is an exercise in which you need to do the below question 
Write a program to calculate the percentage of a given student in exam. His marks from 5 subjects must be taken as input from the user(marks are out of 100)
*/

import java.util.Scanner;

public class tutorial_6 {
    public static void main(String[] args) {

        System.out.print("Enter your name --> ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("Enter your Maths");
        input = new Scanner(System.in);
        int maths = input.nextInt();
        System.out.println("Enter your Science");
        input = new Scanner(System.in);
        int science = input.nextInt();
        System.out.println("Enter your English");
        input = new Scanner(System.in);
        int english = input.nextInt();
        System.out.println("Enter your Hindi");
        input = new Scanner(System.in);
        int hindi = input.nextInt();
        System.out.println("Enter your Social Science");
        input = new Scanner(System.in);
        int social_science = input.nextInt();

        float percentage = ((maths + science + english + hindi + social_science) / 5.0f);
        System.out.printf(
                "%s\'s marks - \nMaths are %d\nScience are %d\nEnglish are %d\nHindi are %d\nSocial Science are %d\nAnd %s\'s Percentage is %f\nAnd %s\'s CGPA is %f",
                name, maths, science, english, hindi, social_science, name, percentage, name, (percentage / 9.5f));

    }
}
