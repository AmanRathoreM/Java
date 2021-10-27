/*
Date 26-10-2021

In this Java tutorial, you will learn about nested try catch block
*/

import java.util.Scanner;

public class tutorial_82 {
    public static void main(String[] args) {

        int[] random_numbers = new int[100];
        for (int i = 0; i < random_numbers.length; i++) {
            random_numbers[i] = java.util.concurrent.ThreadLocalRandom.current().nextInt(-2147483648, 2147483647);
        }

        int index = 0;

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the array index");
            index = input.nextInt();
            try {
                System.out.printf("Value of marks[%d] = %d\n", index, random_numbers[index]);
            } catch (ArrayIndexOutOfBoundsException ArrayIndexOutOfBoundsException_1) {
                System.out.printf("Index value %d is out of range\n", index);
            }
        } catch (Exception Exception_error_2) {
            System.out.printf("Please Enter only Integer Value or the problem is \n!" + Exception_error_2);
        }
    }
}
