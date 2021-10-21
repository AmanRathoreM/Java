/*
Date 21-10-2021

In this Java tutorial, you will learn about this and super keyword in depth
*/

class tutorial_47_1_class_1 {
    int num_1;

    tutorial_47_1_class_1(int num_1) {
        num_1 = num_1;
    }

    public void print_info() {
        System.out.println("num_1 = " + num_1);
    }
}

class tutorial_47_1_class_2 {
    int num_1;

    tutorial_47_1_class_2(int num_1) {
        this.num_1 = num_1;
    }

    public void print_info() {
        System.out.println("num_1 = " + num_1);
    }
}

public class tutorial_47_1 {
    public static void main(String[] args) {
        int var_1 = 88;

        tutorial_47_1_class_1 obj_1 = new tutorial_47_1_class_1(var_1);
        obj_1.print_info();

        tutorial_47_1_class_2 obj_2 = new tutorial_47_1_class_2(var_1);
        obj_2.print_info();
    }
}
