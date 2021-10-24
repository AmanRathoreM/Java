/*
Date 24-10-2021

This code is part of the solution of tutorial_68_exercise.java
*/

package tutorial_68_exercise.shapes;

import java.lang.Math.*;

public class tutorial_68_exercise_circle {
    double radius = 0;

    public tutorial_68_exercise_circle(double radius) {
        this.radius = radius;
    }

    public double area_of_circle() {
        return (Math.PI * radius * radius);
    }

    public double circumference_of_circle() {
        return (2f * Math.PI * radius);
    }
}