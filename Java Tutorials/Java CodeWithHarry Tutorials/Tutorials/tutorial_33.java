/*
Date 20-10-2021

In this Java tutorial, you will learn about Variable Arguments
*/

public class tutorial_33 {

    static int sum(int... arr) {
        int result = 0;
        for (int element : arr) {
            result += element;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(sum());
        System.out.println(sum(2, 2, 1, 4, 10, 2, 2));
    }
}
