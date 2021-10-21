/*
Date 21-10-2021

In this Java tutorial, you will learn about Access modifiers

| Access Modifier | Within class | Within package | Outside package by Sub-class only | Outside Package |
|:---------------:|:------------:|:--------------:|:--------------------------------:|:---------------:|
|      Public     |       Y      |        Y       |                 Y                |        Y        |
|    Protected    |       Y      |        Y       |                 Y                |        N        |
|     Default     |       Y      |        Y       |                 N                |        N        |
|     Private     |       Y      |        N       |                 N                |        N        |

*/

class tutorial_40_Employee {
    private int salary;
    private String name;

    public void print_details() {
        System.out.printf("Name of the employee is %s and his salary is %d", name, salary);
    }

    public void set_data(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }
}

public class tutorial_40 {
    public static void main(String[] args) {

        tutorial_40_Employee aman = new tutorial_40_Employee();
        aman.set_data(7894, "Aman");
        // ! aman.salary = 213;
        // * This will give an error because salary is the private attribute of the
        // class
        aman.print_details();

    }
}
