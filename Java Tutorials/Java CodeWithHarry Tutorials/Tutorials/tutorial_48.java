/*
Date 21-10-2021

In this Java tutorial, you will learn about Method Overriding
*/

class tutorial_48_class_A {
    public void method_1() {
        System.out.println("I\'m Method 1 of Class A");
    }

    public void method_2() {
        System.out.println("I\'m Method 2 of Class A");
    }
}

class tutorial_48_class_B extends tutorial_48_class_A {

    @Override
    public void method_1() {
        // * This function is overriding method_1
        System.out.println("I\'m Method 1 of Class B");
    }

    public void method_2(int var) {
        // * This function is not overriding a method_2, it is overloading it
        System.out.println("I\'m Method 2 of Class B");
    }

    public void method_3() {
        System.out.println("I\'m Method 3 of Class B");
    }
}

public class tutorial_48 {
    public static void main(String[] args) {

        tutorial_48_class_B obj = new tutorial_48_class_B();
        // obj.method_1();
        obj.method_2();
        obj.method_2(89);
    }
}
