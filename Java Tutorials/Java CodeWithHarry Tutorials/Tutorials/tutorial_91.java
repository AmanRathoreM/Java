/*
Date 02-11-2021

In this advance Java tutorial, you will learn about how and why to use array lists
ArrayList is a part of collection framework and is present in java.util package. It provides us with dynamic arrays in Java. Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed.
*/

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class tutorial_91 {
    public static void print_array_list(ArrayList<Integer> li) {
        for (int i = 0; i < li.size(); i++) {
            System.out.printf("value at %2d index of array list is: %4d\n", i, li.get(i));
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> arr_list_1 = new ArrayList<>();
        ArrayList<Integer> arr_list_2 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arr_list_1.add(ThreadLocalRandom.current().nextInt(-999, 9999));
            arr_list_2.add(0);
        }

        print_array_list(arr_list_1);
        System.out.println();
        arr_list_1.set(4, 11111111);
        print_array_list(arr_list_1);
        System.out.println();
        arr_list_1.add(1, 4);
        print_array_list(arr_list_1);
        System.out.println();
        arr_list_1.addAll(3, arr_list_2);
        print_array_list(arr_list_1);
        System.out.println();
        System.out.println(
                "Note: There are much more of ArrayList functions you can browse them on oracle\'s java website!");

    }
}
