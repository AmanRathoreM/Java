/*
Date 24-10-2021

This code is part of the solution of tutorial_68_exercise.java
*/

package tutorial_68_exercise.shapes;

import java.lang.Math.*;

public class tutorial_68_exercise_rectangle {
    double length = 0;
    double breadth = 0;

    public tutorial_68_exercise_rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area_of_rectangle() {
        return ((this.length) * (this.breadth) * 1f);
    }

    public double perimeter_of_rectangle() {
        return (2f * ((this.length) + (this.breadth)));
    }
}