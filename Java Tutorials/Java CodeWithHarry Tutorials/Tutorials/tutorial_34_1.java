/*
Date 20-10-2021

In this Java tutorial, you will learn about Recursion
Note: In some cases we can also us Iterative approach instead of Recursion to enhance speed
0! = 1
n! = n * n-1 *....1
5! = 5 * 4 * 3 * 2 * 1 = 120
n! = n * (n-1)!
*/

public class tutorial_34_1 {

    static long factorial_using_recursion(int n) {
        long result = 1;

        if ((n == 0) || (n == 1)) {
            return result;
        }

        return (n * (factorial_using_recursion(n - 1)));
    }

    static long factorial_using_iterative_approach(int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {

        short n = 20;
        // 0! = 1
        // 1! = 1
        // 2! = 2
        // 3! = 6
        // 4! = 24
        // 5! = 120

        System.out.printf("Factorial of %d using Iterative Approach is %d\n", n, factorial_using_iterative_approach(n));
        System.out.printf("Factorial of %d using Recursion Approach is %d\n", n, factorial_using_recursion(n));

    }
}
