/*
Date 27-10-2021

In this Java tutorial, you will learn about Finally block uses in java
Finally block ---> A finally block contains all the crucial statements that must be executed whether exception occurs or not. The statements present in this block will always execute regardless of whether exception occurs in try block or not such as closing a connection, stream etc.
*/

public class tutorial_85_2 {
    public static void main(String[] args) {
        int i = 1;
        while (true) {
            try {

                System.out.println("Value of i is " + i);
                if (i++ == 6) {
                    break;
                }

            } finally {
                System.out.println("For loop ended");
            }
        }
    }
}
