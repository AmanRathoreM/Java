/*
Date 20-10-2021

In this Java tutorial, you will learn about Relational and logical Operator
*/

public class tutorial_17 {
    public static void main(String[] args) {

        boolean bool_1 = true;
        boolean bool_2 = false;

        if (!((!(bool_1 && bool_2)) || (!(bool_1 && bool_2)))) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
