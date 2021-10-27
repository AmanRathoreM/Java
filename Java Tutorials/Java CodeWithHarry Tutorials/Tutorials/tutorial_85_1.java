/*
Date 27-10-2021

In this Java tutorial, you will learn about Finally block uses in java
Finally block ---> A finally block contains all the crucial statements that must be executed whether exception occurs or not. The statements present in this block will always execute regardless of whether exception occurs in try block or not such as closing a connection, stream etc.
*/

public class tutorial_85_1 {

    public static int greet() {
        try {
            int a = 50;
            int b = 10;
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Cleaning up resources... This is the end of this function");
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(greet());
    }
}
