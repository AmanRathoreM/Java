/*
Date 22-10-2021

This tutorial covers some below given practice questions--

Create a class circle and use inheritance to create another class cylinder from it
Create a class rectangle and use inheritance to create another class cuboid, try to keep it as close to the real-world scenario as possible 
Create a method for area and volume in 1 
create methods for area & volume in 2 also create getters and setters 
*/

class tutorial_52_circle {
    double radius = 0;

    public double area_of_circle() {
        return ((22f / 7) * radius * radius);
    }

    // public double circumference_of_circle() {
    // return (2 * (22 / 7) * radius);
    // }
}

class tutorial_52_cylinder extends tutorial_52_circle {

    double height;

    tutorial_52_cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double area_of_cylinder() {
        return ((2 * (22f / 7) * radius * height) + (area_of_circle() * 2));
    }

    public double volume_of_cylinder() {
        return (area_of_circle() * height);
    }
}

class tutorial_52_rectangle {
    double length;
    double width;

    tutorial_52_rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

}

class tutorial_52_cuboid extends tutorial_52_rectangle {

    double height;

    tutorial_52_cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public double area_of_cuboid() {
        return ((2f * length * width) + (2f * length * height) + (2f * height * width));
    }

    public double volume_of_cuboid() {
        return (1f * length * width * height);
    }
}

public class tutorial_52 {
    public static void main(String[] args) {

        // tutorial_52_cylinder cyl = new tutorial_52_cylinder(5, 5);
        // System.out.println(cyl.volume_of_cylinder());
        // System.out.println(cyl.area_of_cylinder());

        tutorial_52_cuboid cu = new tutorial_52_cuboid(4, 4, 4);
        System.out.println(cu.volume_of_cuboid());
        System.out.println(cu.area_of_cuboid());

    }
}
