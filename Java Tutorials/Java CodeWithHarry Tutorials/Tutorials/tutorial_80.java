/*
Date 25-10-2021

In this Java tutorial, you will learn about how to handel Exception using Try Catch

There are 2 types of exceptions in Java which are as follows -
Checked Exception --->  Checked are the exceptions that are checked at compile time. If some code within a method throws a checked exception, then the method must either handle the exception or it must specify the exception using throws keyword.
Un-Checked Exception --->  Unchecked Exception in Java is those Exceptions whose handling is NOT verified during Compile time . These exceptions occurs because of bad programming. The program won't give a compilation error. All Unchecked exceptions are direct subclasses of RuntimeException class.

Some of the commonly occurring Checked exceptions are -
1.) Class Not Found Exception
2.) Invocation Target Exception
3.) Interrupted Exception
4.) No Such Method Exception

Some of the commonly occurring Un-Checked exceptions are -
1.) Null Pointer Exception
2.) Array IndexOut Of Bounds Exception
3.) Arithmetic Exception
4.) Class Cast Exception
5.) Illegal State Exception
6.) Illegal Argument Exception
7.) Number Format Exception

Try catch block ---> Place any code statements that might raise or throw an exception in a try block, and place statements used to handle the exception or exceptions in one or more catch blocks below the try block. Each catch block includes the exception type and can contain additional statements needed to handle that exception type.
*/

public class tutorial_80 {
    public static void main(String[] args) {

        int a = 100, b = 0;
        try {
            int c = a / b;
            System.out.printf("Your answer is %d\n", c);
        } catch (Exception error_value) {
            System.out.println("Unable to divide due to " + error_value);
        }

        // System.out.println("Hello World!");
    }
}
