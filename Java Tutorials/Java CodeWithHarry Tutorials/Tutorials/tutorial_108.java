/*
Date 03-11-2021

In this advance Java tutorial, you will learn about Annotations in Java
In the Java, an annotation is a form of syntactic metadata that can be added to Java source code. Classes, methods, variables, parameters and Java packages may be annotated. Like Javadoc tags, Java annotations can be read from source files.
*/

@FunctionalInterface
interface tutorial_108_a_functional_interface {
    void a_function();

    // *Below line will give an error because interface is a functional interface
    // ! void another_function();
    // *Above line will give an error because interface is a functional interface
}

class tutorial_108_base_class {
    public void print_class_info() {
        System.out.println("You are in class named tutorial_108_base_class");
    }
}

class tutorial_108_derived_class extends tutorial_108_base_class {
    @Override // * A java annotation
    public void print_class_info() {
        System.out.println("You are in class named tutorial_108_derived_class");
    }

    @Deprecated // *This will throw an warning but no Error is generated
    public void print_1_to_10() {
        System.out.println("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n");
    }

    public void print_1_to_n(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}

public class tutorial_108 {
    @SuppressWarnings("deprecation") // *This will force compiler for not to throw Warnings
    public static void main(String[] args) {
        // * new tutorial_108_derived_class().print_class_info();
        new tutorial_108_derived_class().print_1_to_10();
        new tutorial_108_derived_class().print_1_to_n(2);
    }
}
