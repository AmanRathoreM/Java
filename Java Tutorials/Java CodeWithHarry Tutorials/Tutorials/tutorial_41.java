/*
Date 21-10-2021

In this Java tutorial, you will learn about Constructors
*/

class tutorial_41_Employee {
    private int salary;
    private String name;
    private String role;

    public tutorial_41_Employee(int salary, String name, String role) {
        this.set_data(salary, name, role);
    }

    public tutorial_41_Employee() {
        this.set_data(salary = 0, name = "Not Defined", role = "Role Not Given");
    }

    public void print_details() {
        System.out.printf("Name of the employee is %s\nHis salary is %d\nHis role is %s", this.name, this.salary,
                this.role);
    }

    public void set_data(int salary, String name, String role) {
        this.salary = salary;
        this.name = name;
        this.role = role;
    }
}

public class tutorial_41 {
    public static void main(String[] args) {

        tutorial_41_Employee aman = new tutorial_41_Employee(4534, "Aman", "Scientist");
        aman.print_details();

        System.out.println("\n--------------------------");

        tutorial_41_Employee rohit = new tutorial_41_Employee();
        rohit.print_details();
    }
}
