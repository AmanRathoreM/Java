/*
Date 24-10-2021

This tutorial is an exercise in which you need to do the below question
You have to create a package named shapes
This package should have individual classes for Rectangle, Square, Circle, Cylinder, Sphere
These classes should use inheritance to properly manage the code!
Include methods like volume, surface area
*/

import tutorial_68_exercise.shapes.tutorial_68_exercise_circle;
import tutorial_68_exercise.shapes.tutorial_68_exercise_cylinder;
import tutorial_68_exercise.shapes.tutorial_68_exercise_rectangle;
import tutorial_68_exercise.shapes.tutorial_68_exercise_sphere;
import tutorial_68_exercise.shapes.tutorial_68_exercise_square;

public class tutorial_68_exercise {
    public static void main(String[] args) {

        // tutorial_68_exercise_circle circle = new tutorial_68_exercise_circle(8.4d);
        // System.out.println(circle.area_of_circle());
        // System.out.println(circle.circumference_of_circle());

        // tutorial_68_exercise_cylinder cyl = new tutorial_68_exercise_cylinder(8, 7);
        // System.out.println(cyl.area_of_cylinder());
        // System.out.println(cyl.volume_of_cylinder());

        // tutorial_68_exercise_sphere sphere = new tutorial_68_exercise_sphere(8);
        // System.out.println(sphere.area_of_sphere());
        // System.out.println(sphere.volume_of_sphere());

        // tutorial_68_exercise_square square = new tutorial_68_exercise_square(8);
        // System.out.println(square.area_of_square());
        // System.out.println(square.perimeter_of_square());

        tutorial_68_exercise_rectangle rec = new tutorial_68_exercise_rectangle(8, 7);
        System.out.println(rec.area_of_rectangle());
        System.out.println(rec.perimeter_of_rectangle());
    }
}
