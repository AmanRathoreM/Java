/*
Date 02-11-2021

In this advance Java tutorial, you will learn about how to implement HashSets in our programme
Java HashSet class is used to create a collection that uses a hash table for storage. It inherits the AbstractSet class and implements Set interface.
The important points about Java HashSet class are as follows:
HashSet stores the elements by using a mechanism called hashing.
HashSet contains unique elements only.
HashSet allows null value.
HashSet class is non synchronized.
HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
HashSet is the best approach for search operations.
The initial default capacity of HashSet is 16, and the load factor is 0.75.
*/

import java.util.HashSet;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class tutorial_95_2 {
    public static void main(String[] args) {

        ArrayList<Integer> arr_list = new ArrayList<>();

        for (int i = 1; i <= 2147483; i++) {
            arr_list.add(i);
        }

        HashSet<Integer> hash_1 = new HashSet<>(arr_list);

        for (int i = 0; i < 50000; i++) {
            hash_1.add(-2147483648);
            hash_1.add(2147483647);
        }
        System.out.println(hash_1.contains(45));
        System.out.println(hash_1.contains(-45));
    }
}
