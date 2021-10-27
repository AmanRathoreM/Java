/*
Date 26-10-2021

In this Java tutorial, you will learn about handling a specific Exception
*/

import java.util.Scanner;

public class tutorial_81 {
    public static void main(String[] args) {

        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = input.nextInt();

        System.out.println("Enter the number you want to divide the value with");
        int number = input.nextInt();

        try {
            System.out.println("The value at array index entered is: " + marks[ind]);
            System.out.println("The value of array-value/number is: " + marks[ind] / number);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception!");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception!");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Some other exception!");
            System.out.println(e);
        }
    }
}
