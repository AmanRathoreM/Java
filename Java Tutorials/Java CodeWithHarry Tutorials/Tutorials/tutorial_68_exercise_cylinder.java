/*
Date 24-10-2021

This code is part of the solution of tutorial_68_exercise.java
*/

package tutorial_68_exercise.shapes;

import java.lang.Math.*;

public class tutorial_68_exercise_cylinder extends tutorial_68_exercise_circle {
    double height = 0;

    public tutorial_68_exercise_cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double area_of_cylinder() {
        return ((2 * Math.PI * radius * height) + (area_of_circle() * 2));
    }

    public double volume_of_cylinder() {
        return (area_of_circle() * height);
    }
}