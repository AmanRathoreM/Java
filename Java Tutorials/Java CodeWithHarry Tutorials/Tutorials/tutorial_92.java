/*
Date 02-11-2021

In this advance Java tutorial, you will learn about how and why to use linked lists
Linked List is a part of the Collection framework present in java.util package. This class is an implementation of the LinkedList data structure which is a linear data structure where the elements are not stored in contiguous locations and every element is a separate object with a data part and address part. The elements are linked using pointers and addresses. Each element is known as a node. Due to the dynamicity and ease of insertions and deletions, they are preferred over the arrays. It also has few disadvantages like the nodes cannot be accessed directly instead we need to start from the head and follow through the link to reach to a node we wish to access.
*/

import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class tutorial_92 {
    public static void print_array_list(LinkedList<Integer> li) {
        for (int i = 0; i < li.size(); i++) {
            System.out.printf("value at %2d index of array list is: %4d\n", i, li.get(i));
        }
    }

    public static void main(String[] args) {

        LinkedList<Integer> linked_list_1 = new LinkedList<>();
        LinkedList<Integer> arr_list_2 = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            linked_list_1.add(ThreadLocalRandom.current().nextInt(-999, 9999));
            arr_list_2.add(0);
        }

        // print_array_list(linked_list_1);
        // System.out.println();
        linked_list_1.set(4, 11111111);
        // print_array_list(linked_list_1);
        // System.out.println();
        linked_list_1.add(1, 4);
        // print_array_list(linked_list_1);
        // System.out.println();
        linked_list_1.addAll(3, arr_list_2);
        // print_array_list(linked_list_1);
        // System.out.println();

        linked_list_1.addFirst(11);
        linked_list_1.addLast(7);
        print_array_list(linked_list_1);
        System.out.println(
                "Note: There are much more of LinkedList functions you can browse them on oracle\'s java website!\nNote: LinkedList and ArrayList method are mostly the same!");

    }
}
