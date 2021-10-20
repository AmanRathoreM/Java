/*
Date 20-10-2021

In this Java tutorial, you will learn about method Overloading
*/

public class tutorial_32_1 {

    static void change_var_value(int num) {

        // * This method will not change the value because, it is using call by value
        // * property of a variable
        num = 786;
    }

    static void change_array_value(int[] arr) {
        // * This method is using call by reference property of a variable, so value
        // * will definitely change
        arr[0] = 7845;
    }

    public static void main(String[] args) {

        int var = 10;
        int[] array = { 4, 7, 2, 9, 4 };

        change_var_value(var);
        change_array_value(array);

        System.out.println("Value of var is " + var);
        System.out.println("Value of array[0] is " + array[0]);
    }
}
