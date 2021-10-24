/*
Date 24-10-2021

This code is part of the solution of tutorial_68_exercise.java
*/

package tutorial_68_exercise.shapes;

import java.lang.Math.*;

public class tutorial_68_exercise_sphere extends tutorial_68_exercise_circle {

    public tutorial_68_exercise_sphere(double radius) {
        super(radius);
    }

    public double area_of_sphere() {
        return (4f * area_of_circle());
    }

    public double volume_of_sphere() {
        return ((area_of_sphere() * this.radius) / 3f);
    }
}