/*
Date 20-10-2021

In this Java tutorial, you will learn about methods
Note: There are no function in Java, there are only methods in Java as it is only Object Oriented Language
*/

public class tutorial_31 {

    static int difference(int x, int y) {
        if (x > y) {
            return x - y;
        }
        return y - x;
    }

    public static void main(String[] args) {

        System.out.println(difference(9, 9));
    }
}
