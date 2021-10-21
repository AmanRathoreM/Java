/*
Date 21-10-2021

In this Java tutorial, you will learn about Inheritance
*/

class tutorial_45_Base_class {
    int x_of_base_class = 10;

    public tutorial_45_Base_class print_x() {
        System.out.printf("X of Base Class = %d\n", this.x_of_base_class);
        return this;
    }

    public tutorial_45_Base_class set_x(int x) {
        x_of_base_class = x;
        return this;
    }
}

class tutorial_45_Derived_class extends tutorial_45_Base_class {
    int y_of_derived_class = 89;

    public tutorial_45_Derived_class print_y() {
        System.out.printf("Y of Derived Class = %d\n", this.y_of_derived_class);
        return this;
    }

    public tutorial_45_Derived_class print_x_y() {
        print_x();
        print_y();
        return this;
    }

    public tutorial_45_Derived_class set_x_y(int x, int y) {
        x_of_base_class = x;
        y_of_derived_class = y;
        return this;
    }

}

public class tutorial_45 {
    public static void main(String[] args) {

        tutorial_45_Derived_class obj = new tutorial_45_Derived_class();

        obj.set_x(78).print_x();

        obj.set_x_y(458, 347).print_x_y();
    }

}
