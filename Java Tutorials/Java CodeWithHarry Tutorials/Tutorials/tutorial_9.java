/*
Date 19-10-2021

In this Java tutorial, you will learn about operator precedence and it's associativity
*/

public class tutorial_9 {
    public static void main(String[] args) {

        double num = 8 * 4 / 2 + 2 - 1;
        System.out.println("8 * 4 / 2 + 2 - 1                   = " + num);

        num = (8 * 4) / (2.0 + (2 - 1));
        System.out.println("(8 * 4) / (2.0 + (2 - 1))           = " + num);
    }
}
