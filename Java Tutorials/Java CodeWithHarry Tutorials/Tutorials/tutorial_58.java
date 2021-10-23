/*
Date 23-10-2021

In this Java tutorial, you will learn about Inheriting Interface in Interface
*/

interface tutorial_58_interface_1 {

    default void print_details_of_methods(int num) {
        System.out.printf("I\'m method %d\n", num);
    }

    tutorial_58_Class method_1();
}

interface tutorial_58_interface_2 extends tutorial_58_interface_1 {
    tutorial_58_Class method_2();

    default void method_3() {
        print_details_of_methods(3);
    }
}

interface tutorial_58_interface_3 extends tutorial_58_interface_2 {

    default void method_4() {
        print_details_of_methods(4);
    }

    tutorial_58_Class method_5();
}

class tutorial_58_Class implements tutorial_58_interface_3 {
    public tutorial_58_Class method_1() {
        print_details_of_methods(1);
        return this;
    }

    public tutorial_58_Class method_2() {
        print_details_of_methods(2);
        return this;
    }

    public tutorial_58_Class method_5() {
        print_details_of_methods(5);
        return this;
    }
}

public class tutorial_58 {
    public static void main(String[] args) {

        tutorial_58_Class obj = new tutorial_58_Class();
        obj.method_1().method_2().method_5();
        obj.method_3();
        obj.method_4();
        // System.out.print("\n");

    }
}
