/*
Date 21-10-2021

In this Java tutorial, you will learn about Dynamic Method Dispatch
Note: This code is also an example of run time Polymorphism
*/

class tutorial_49_class_Base {
    public tutorial_49_class_Base greet_me_of_class_Base() {
        System.out.println("Welcome by Base Class");
        return this;
    }

    public tutorial_49_class_Base name() {
        System.out.println("My name is --> Base Class");
        return this;
    }
}

class tutorial_49_class_Derived extends tutorial_49_class_Base {
    public tutorial_49_class_Base greet_me_of_class_Derived() {
        System.out.println("Welcome by Derived Class");
        return this;
    }

    public tutorial_49_class_Base name() {
        System.out.println("My name is --> Derived Class");
        return this;
    }
}

public class tutorial_49 {
    public static void main(String[] args) {

        // * Below line is not allowed in Java
        // ! tutorial_49_class_Derived obj = new tutorial_49_class_Base();
        // * Above line is not allowed in Java

        tutorial_49_class_Base obj = new tutorial_49_class_Derived();
        obj.greet_me_of_class_Base().name();
    }
}
