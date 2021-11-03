/*
Date 03-11-2021

In this advance Java tutorial, you will learn about Lambda Expression and Anonymous classes
Lambda Expressions were added in Java 8.

lambda expression: Lambda Expressions were added in Java 8. A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

Anonymous classes: It is an inner class without a name and for which only a single object is created. An anonymous inner class can be useful when making an instance of an object with certain "extras" such as overriding methods of a class or interface, without having to actually subclass a class.
*/

@FunctionalInterface
interface tutorial_109_an_interface {
    void meth_1(int parameter);
}

public class tutorial_109 {
    public static void main(String[] args) {

        tutorial_109_an_interface obj_1 = new tutorial_109_an_interface() {
            // * This class will pretend to be an Anonymous class
            @Override
            public void meth_1(int parameter) {
                System.out.println("I\'m method 1 created from Anonymous class! and parameter is " + parameter);
            }
        };
        obj_1.meth_1(120);

        tutorial_109_an_interface obj_2 = (parameter) -> {
            System.out.println("I\'m method 1 created from lambda Expression! and parameter is " + parameter);
        };
        obj_2.meth_1(4);
    }
}
