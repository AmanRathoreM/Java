/*
Date 04-11-2021

In this advance Java tutorial, you will learn about Java Generics and why to use them
Generics are a facility of generic programming that were added to the Java programming language in 2004 within version J2SE 5.0. They were designed to extend Java's type system to allow "a type or method to operate on objects of various types while providing compile-time type safety". These Generics are very similar to C++ Templates(but not same)
*/

class tutorial_110_generic_class<t1, t2> {
    private t1 var_1;
    private t2 var_2;

    // tutorial_110_generic_class(t1 var_1) {
    tutorial_110_generic_class(t1 var_1, t2 var_2) {
        this.var_1 = var_1;
        this.var_2 = var_2;
    }

    public t1 return_type_1() {
        return var_1;
    }

    public t2 return_type_2() {
        return var_2;
    }
}

// * @SuppressWarnings("unchecked")
public class tutorial_110 {
    public static void main(String[] args) {

        tutorial_110_generic_class<String, Float> obj_1 = new tutorial_110_generic_class("A string", 45.7);
        System.out.println(obj_1.return_type_1());
        System.out.println(obj_1.return_type_2());

        tutorial_110_generic_class<Double, Character> obj_2 = new tutorial_110_generic_class(7.89856, '%');
        System.out.println(obj_2.return_type_1());
        System.out.println(obj_2.return_type_2());
    }
}
