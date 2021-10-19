/*
Date 19-10-2021

In this Java tutorial, you will learn about operators
*/

public class tutorial_8 {
    public static void main(String[] args) {
        int num_1 = 7;
        int num_2 = num_1 + 2;
        System.out.println(++num_2);
        System.out.println(num_2 == num_1 + 3);
        System.out.println((2 << 1 == 4) && (4 != 4));
        System.out.println((2 << 1 == 4) || (4 != 4));
    }
}
