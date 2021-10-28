/*
Date 28-10-2021

This tutorial is an exercise in which you need to do the below question
Exercise 6: You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        
        Which throws the following exceptions:
        1. Invalid input Exception when given the operator which is not in +,-,*,/ ex: 8 & 9
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
*/

class tutorial_87_exercise_Cannot_Divide_by_Zero extends Exception {

    @Override
    public String getMessage() {
        return "Number Cannot Divide by Zero!";
    }
}

class tutorial_87_exercise_Max_Input extends Exception {

    @Override
    public String getMessage() {
        return "Overflow, Number Reached it's Max limit!";
    }
}

class tutorial_87_exercise_calculator {
    double num_1 = 0, num_2 = 0;

    tutorial_87_exercise_calculator(double num_1, double num_2) throws tutorial_87_exercise_Max_Input {
        try {
            set_values(num_1, num_2);
        } catch (Exception e) {
            // System.out.println("Exception of Constructor!");
            throw new tutorial_87_exercise_Max_Input();
        }
    }

    tutorial_87_exercise_calculator() {
        System.out.println("Values of numbers not given");
    }

    public void set_values(double num_1, double num_2) throws tutorial_87_exercise_Max_Input {
        if ((num_1 > 100000) || (num_2 > 100000)) {
            // System.out.println("Exception of set_values() function!");
            throw new tutorial_87_exercise_Max_Input();
        }
        this.num_1 = num_1;
        this.num_2 = num_2;
    }

    public double addition(double... arr) {
        double result = this.num_1 + this.num_2;
        for (double element : arr) {
            result += element;
        }
        return result;
    }

    public double difference() {
        if (this.num_2 > this.num_1) {
            return this.num_2 - this.num_1;
        }
        return this.num_1 - this.num_2;
    }

    public double subtraction() {
        return this.num_1 - this.num_2;
    }

    public double multiplication(double... arr) throws tutorial_87_exercise_Max_Input {
        if ((num_1 > 7000) || (num_2 > 7000)) {
            throw new tutorial_87_exercise_Max_Input();
        }
        double result = this.num_1 * this.num_2;
        for (double element : arr) {
            result *= element;
        }
        return result;
    }

    public double division() throws tutorial_87_exercise_Cannot_Divide_by_Zero {
        if ((num_1 == 0) || (num_2 == 0)) {
            throw new tutorial_87_exercise_Cannot_Divide_by_Zero();
        }
        if (this.num_1 > this.num_2) {
            return this.num_1 / this.num_2;
        }
        return this.num_2 / this.num_1;
    }
}

public class tutorial_87_exercise {
    public static void main(String[] args) {
        try {

            tutorial_87_exercise_calculator obj_1 = new tutorial_87_exercise_calculator(50, 10);
            System.out.println(obj_1.difference());
            System.out.println(obj_1.subtraction());
            try {
                System.out.println(obj_1.division());
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(obj_1.multiplication(2, 4));
            System.out.println(obj_1.addition(15, 5, 2, 4, 4, 10));

            tutorial_87_exercise_calculator obj_2 = new tutorial_87_exercise_calculator(0, 10);
            try {
                System.out.println(obj_2.division());
            } catch (Exception e) {
                System.out.println(e);
            }

            try {
                tutorial_87_exercise_calculator obj_3 = new tutorial_87_exercise_calculator(54478812, 87814);
            } catch (Exception e_2) {
                System.out.println(e_2);
            }

            try {
                tutorial_87_exercise_calculator obj_4 = new tutorial_87_exercise_calculator(7001, 14);
                System.out.println(obj_4.multiplication());
            } catch (Exception e_3) {
                System.out.println(e_3);
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
