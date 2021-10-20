/*
Date 20-10-2021

In this Java tutorial, you will learn about Arrays
*/

public class tutorial_26 {
    public static void main(String[] args) {

        int array_length = 100;
        int[] num = new int[array_length];

        for (int i = 0; i < array_length; i++) {
            num[i] = i + i;
        }

        for (int i = 0; i < array_length; i++) {
            System.out.printf("Value at index %3d is %5d\n", i, num[i]);
        }

    }
}
