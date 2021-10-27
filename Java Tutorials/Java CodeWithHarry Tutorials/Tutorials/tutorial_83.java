/*
Date 26-10-2021

In this Java tutorial, you will learn about creating a custom exception using Exception class
*/

class tutorial_83_Exception extends Exception {

    @Override
    public String toString() {
        // return "Exception of toString() Occurred!";
        return super.toString() + "\nNote: Exception of toString() Occurred!";
    }

    @Override
    public String getMessage() {
        // return "Exception of getMessage() Occurred!";
        return super.getMessage() + "\nNote: Exception of getMessage() Occurred!";
    }
}

public class tutorial_83 {
    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the value of num ---> ");
        int num = input.nextInt();

        if (num >= 100) {
            try {
                throw new tutorial_83_Exception();
            } catch (Exception e) {
                System.out.print(e.getMessage());
                e.printStackTrace();
            }

        } else {
            System.out.printf("No Exception occurred");
        }

    }
}
