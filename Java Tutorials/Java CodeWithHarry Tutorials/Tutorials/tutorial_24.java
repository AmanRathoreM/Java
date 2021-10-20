/*
Date 20-10-2021

In this Java tutorial, you will learn about break and continue statements
*/

public class tutorial_24 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.printf("Hello World! Repeated number is %3d\n", i);
            if (i++ == 50) {
                break;
            }
        }
    }
}
