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
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class tutorial_95_1 {
    public static void main(String[] args) {

        LinkedList<Integer> linked_list = new LinkedList<>();

        for (int i = 0; i < 999; i++) {
            linked_list.add(ThreadLocalRandom.current().nextInt(-999, 9999));
        }

        HashSet<Integer> hash_1 = new HashSet<>(linked_list);

        System.out.println(hash_1.size());
        hash_1.add(0);
        System.out.println(hash_1.size());
    }
}
