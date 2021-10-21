/*
Date 21-10-2021

In this Java tutorial, you will learn about this and super keyword in depth
Note: The code logic of this tutorial is same as logic of tutorial_46.java
*/

class tutorial_47_2_Base_class {
    int x_of_base_class = 10;

    tutorial_47_2_Base_class(int x) {
        System.out.println("Constructor of Base class which takes 1 argument is called");
        set_x(x);
    }

    tutorial_47_2_Base_class() {
        System.out.println("Constructor of Base class which takes 0 argument is called");
        set_x(46);
    }

    public tutorial_47_2_Base_class print_x() {
        System.out.printf("X of Base Class = %d\n", this.x_of_base_class);
        return this;
    }

    public tutorial_47_2_Base_class set_x(int x) {
        this.x_of_base_class = x;
        return this;
    }
}

class tutorial_47_2_Derived_class_number_1 extends tutorial_47_2_Base_class {
    int y_of_derived_class_number_1 = 89;

    tutorial_47_2_Derived_class_number_1(int y) {
        System.out.println("Constructor of Derived class which takes 1 argument is called");
        set_y(y);
    }

    tutorial_47_2_Derived_class_number_1(int x, int y) {
        super(x);
        System.out.println("Constructor of Derived class which takes 2 argument is called");
        set_y(y);
    }

    tutorial_47_2_Derived_class_number_1() {
        System.out.println("Constructor of Derived class which takes 0 argument is called");
        set_x_y(987, 2134);
    }

    public tutorial_47_2_Derived_class_number_1 print_y() {
        System.out.printf("Y of Derived Class = %d\n", this.y_of_derived_class_number_1);
        return this;
    }

    public tutorial_47_2_Derived_class_number_1 print_x_y() {
        print_x();
        print_y();
        return this;
    }

    public tutorial_47_2_Derived_class_number_1 set_y(int y) {
        this.y_of_derived_class_number_1 = y;
        return this;
    }

    public tutorial_47_2_Derived_class_number_1 set_x_y(int x, int y) {
        set_x(x);
        set_y(y);
        return this;
    }

}

class tutorial_47_2_Derived_class_number_2 extends tutorial_47_2_Derived_class_number_1 {
    int z_of_derived_class_number_2 = 12;

    tutorial_47_2_Derived_class_number_2(int x, int y, int z) {
        super(x, y);
        System.out.println("Constructor of Second Derived class which takes 3 argument is called");
        set_z(z);
    }

    public tutorial_47_2_Derived_class_number_2 set_z(int z) {
        this.z_of_derived_class_number_2 = z;
        return this;
    }

    public tutorial_47_2_Derived_class_number_2 print_x_y_z() {
        this.print_x_y();
        this.print_z();
        return this;
    }

    public tutorial_47_2_Derived_class_number_2 print_z() {
        System.out.printf("Z of the Second Derived Class = %d\n", this.z_of_derived_class_number_2);
        return this;
    }
}

public class tutorial_47_2 {
    public static void main(String[] args) {

        tutorial_47_2_Derived_class_number_2 obj = new tutorial_47_2_Derived_class_number_2(458, 23, 514);
        obj.print_x_y_z();
    }
}