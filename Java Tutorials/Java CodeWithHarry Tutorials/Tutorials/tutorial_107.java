/*
Date 03-11-2021

In this advance Java tutorial, you will learn about how to generate our own JavaDoc
Note: /** is comment for javadoc and /* is normal multiple line comment
*/

/**
 * This class is to demonstrate how to use JavaDoc You can render <i>Html</i>
 * <p>
 * in generation of JavaDocs
 * </p>
 * 
 * @author Aman @ version 1.0.1 @ since 2019 @ see <a href=
 *         "https://docs.oracle.com/en/java/javase/14/docs/api/index.html"
 *         target="_blank">JDK 14 API Docs</a>
 */

public class tutorial_107 {
    /**
     * <i>Print</i> and <i>Returns</i> sum of all parameters given
     * 
     * @param mul This is number from which all addition will multiply by
     * @param arr These are all the numbers which will be add automatically in
     *            function
     * @return Sum of all numbers available in arr and multiple them by mul
     * @throws IllegalArgumentException if mul = 0
     * @deprecated This method is deprecated from 2020, Please use <b>+</b> operator
     *             instead of this method.
     */
    public static void add_and_multiply(int mul, int... arr) throws IllegalArgumentException {
        if (mul == 0) {
            throw new IllegalArgumentException();
        }
        long result = 0;
        for (int i : arr) {
            result += i;
        }
        System.out.println("Addition and Multiplication is " + (result * mul));
    }

    public static void main(String[] args) {
        System.out.println("This is my main Method!");
        add_and_multiply(2, 78, 2, 10, 21, 89);
    }
}
