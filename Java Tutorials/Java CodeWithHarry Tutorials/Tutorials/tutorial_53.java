/*
Date 22-10-2021

In this Java tutorial, you will learn about Abstract base classes and Abstract methods

An abstract method in Java is declared through the keyword "abstract". There is no body in an abstract method, only the signature of the method is present.
If there is only one abstract method in the class then also that class will considered as abstract base class
*/

abstract class tutorial_53_Base_class {
    tutorial_53_Base_class() {
        System.out.println("I\'m constructor of tutorial_53_Base_class");
    }

    public void say_hello() {
        System.out.println("Hello! I'm saying hello to you!");
    }

    abstract public void greet();
}

class tutorial_53_Derived_class_1 extends tutorial_53_Base_class {
    @Override
    public void greet() {
        System.out.println("I'm greeting you!");
    }
}

class tutorial_53_Derived_class_2 extends tutorial_53_Base_class {
    @Override
    public void greet() {
        System.out.println("I'll not greet you at any cause!");
    }
}

abstract class tutorial_53_Derived_class_3 extends tutorial_53_Base_class {
}

public class tutorial_53 {
    public static void main(String[] args) {

        tutorial_53_Derived_class_1 obj_1 = new tutorial_53_Derived_class_1();
        obj_1.greet();

        tutorial_53_Derived_class_2 obj_2 = new tutorial_53_Derived_class_2();
        obj_2.greet();

    }
}
