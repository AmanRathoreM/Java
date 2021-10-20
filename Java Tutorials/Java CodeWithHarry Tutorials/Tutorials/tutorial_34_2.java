/*
Date 20-10-2021

This is an type of exercise in which you need to print Fibonacci series
Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)......
*/

public class tutorial_34_2 {

    static long fibonacci_using_recursion(int n) {
        long result = 0;

        if (n == 0) {
            return result;
        } else if ((n == 2) || (n == 3)) {
            return ++result;
        }

        return fibonacci_using_recursion(n - 1) + fibonacci_using_recursion(n - 2);
    }

    // todo static long fibonacci_using_iterative_approach(int n) {
    // todo long result = 0, first = 0, second = 1;
    // todo if (n == 0) {
    // todo return 0;
    // todo } else if ((n == 2) || (n == 3)) {
    // todo return 1;
    // todo }
    // todo for (int i = 0; i < n; i++) {
    // todo if (i <= 1) {
    // todo result = i;
    // todo } else {
    // todo result = first + second;
    // todo first = second;
    // todo second = result;
    // todo }
    // todo }
    // todo return result;
    // todo }

    public static void main(String[] args) {

        short n = 10;

        // todo System.out.printf("Fibonacci of %d using Iterative Approach is %d\n",
        // todo n,fibonacci_using_iterative_approach(n));

        System.out.printf("Fibonacci of %d using Recursion Approach is %d\n", n, fibonacci_using_recursion(n));

    }
}
