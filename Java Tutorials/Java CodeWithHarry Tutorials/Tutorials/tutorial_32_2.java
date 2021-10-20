/*
Date 20-10-2021

In this Java tutorial, you will learn about method Overloading
*/

public class tutorial_32_2 {

    static int sum(int x, int y) {
        return x + y;
    }

    static int sum(int x, int y, int z) {
        return x + y + z;
    }

    static int sum(int x, int y, int z, int extra_var) {
        return x + y + z + extra_var;
    }

    public static void main(String[] args) {

        System.out.println(sum(2, 2));
        System.out.println(sum(2, 2, 2));
        System.out.println(sum(2, 2, 2, 2));
    }
}
