/*
Date 27-10-2021

In this Java tutorial, you will learn about difference between Throw and Throws
Throws ---> Throws keyword is used in the method signature to declare an exception which might be thrown by the function while the execution of the code.
Throw ---> Throw keyword is used throw an exception explicitly in the code, inside the function or the block of code.
*/

class tutorial_84_Negative_Radius_Exception extends Exception {

    @Override
    public String toString() {
        return "Radius cannot be -ve!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be -ve!";
    }
}

public class tutorial_84 {

    public static double area(double r) throws tutorial_84_Negative_Radius_Exception {
        if (r < 0) {
            throw new tutorial_84_Negative_Radius_Exception();
        }
        return Math.PI * r * r;
    }

    public static void main(String[] args) {

        try {
            System.out.println(area(7));
        } catch (Exception e) {
            System.out.println("Error occurred");
        }
    }
}
