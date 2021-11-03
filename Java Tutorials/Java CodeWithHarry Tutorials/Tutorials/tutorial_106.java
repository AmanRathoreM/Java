/*
Date 03-11-2021

In this advance Java tutorial, you will learn about how to construct our own JavaDoc
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
public class tutorial_106 {
    public static void add(int... arr) {
        /**
         * Print sum of all parameters given
         */
        long result = 0;
        for (int i : arr) {
            result += i;
        }
        System.out.println("Addition is " + result);
    }

    public static void main(String[] args) {
        System.out.println("This is my main Method!");
        add(78, 2, 10, 21, 89);
    }
}
