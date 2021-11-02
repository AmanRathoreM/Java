/*
Date 02-11-2021

In this advance Java tutorial, you will learn about how and why to use Array Deque
The ArrayDeque class provides the facility of using deque and resizable-array. It inherits AbstractCollection class and implements the Deque interface.
The important points about ArrayDeque class are as follows:
Unlike Queue, we can add or remove elements from both sides.
Null elements are not allowed in the ArrayDeque.
ArrayDeque is not thread safe, in the absence of external synchronization.
ArrayDeque has no capacity restrictions.
ArrayDeque is faster than LinkedList and Stack.
*/

import java.util.ArrayDeque;
import java.util.concurrent.ThreadLocalRandom;

public class tutorial_93 {
    public static void print_array_list(ArrayDeque<Integer> de_que) {
        int i = 0;
        for (Integer element : de_que) {
            System.out.printf("value at %2d index of array list is: %4d\n", i++, element);
        }
    }

    public static void main(String[] args) {
        ArrayDeque<Integer> arr_deque_1 = new ArrayDeque<>();
        ArrayDeque<Integer> arr_deque_2 = new ArrayDeque<>();

        for (int i = 0; i < 5; i++) {
            arr_deque_1.add(ThreadLocalRandom.current().nextInt(-999, 9999));
            arr_deque_2.add(0);
        }

        print_array_list(arr_deque_1);
        System.out.println();

        arr_deque_1.addAll(arr_deque_2);
        print_array_list(arr_deque_1);
        System.out.println();
        System.out.println(
                "Note: There are much more of ArrayDeque functions you can browse them on oracle\'s java website!");

    }
}
