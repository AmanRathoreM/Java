/*
Date 21-10-2021

In this Java tutorial, you will learn do a introduction to Object-Oriented Programming
*/

class tutorial_38_Employee {
    int salary;
    String name;

    public void print_details() {
        System.out.printf("Name of the employee is %s and his salary is %d", name, salary);
    }

    public void set_data(int income, String employee_name) {
        salary = income;
        name = employee_name;
    }
}

public class tutorial_38 {
    public static void main(String[] args) {

        tutorial_38_Employee aman = new tutorial_38_Employee();
        aman.set_data(7894, "Aman");
        aman.print_details();

    }
}
