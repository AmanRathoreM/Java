/*
Date 24-10-2021

This code is part of the solution of tutorial_68_exercise.java
*/

package tutorial_68_exercise.shapes;

import java.lang.Math.*;

import tutorial_68_exercise.shapes.tutorial_68_exercise_rectangle;

public class tutorial_68_exercise_square extends tutorial_68_exercise_rectangle {

    public tutorial_68_exercise_square(double length) {
        super(length, length);
    }

    public double area_of_square() {
        return ((this.length) * (this.breadth) * 1f);
    }

    public double perimeter_of_square() {
        return (2f * ((this.length) + (this.breadth)));
    }
}