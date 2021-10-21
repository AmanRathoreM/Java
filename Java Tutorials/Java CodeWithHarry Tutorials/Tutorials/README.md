# <h1 style="text-align:center; font-size:360%; font-family:verdana;color:#4A3E76;"><em>Java</em></h1>

# These tutorials are watched from [CodeWithHarry](https://www.youtube.com/channel/UCeVMnSShP_Iviwkknt83cww "Click here to checkout his channel") YouTube Channel's [Java Playlist](https://youtube.com/playlist?list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q "Click here to check out his Java tutorials Playlist").

---

---

---

---

---

## **_1.) tutorial_1 of Java_**

### [**_Click me_**](tutorial_1.java "Click here to see full file") to see full file of tutorial_1

```Java
/*
Date 16-10-2021

In this Java tutorial, you will learn about writing hello world!
*/

public class tutorial_1 {
    public static void main(String[] args) {

        System.out.println("Hello World!");
    }
}

```

---

---

## **_2.) tutorial_2 of Java_**

### [**_Click me_**](tutorial_2.java "Click here to see full file") to see full file of tutorial_2

```Java
/*
Date 16-10-2021

In this Java tutorial, you will learn about understanding java code structure
*/

public class tutorial_2 {
    public static void main(String[] args) {

        System.out.println("Hello World!");
    }
}

```

---

---

## **_3.) tutorial_3 of Java_**

### [**_Click me_**](tutorial_3.java "Click here to see full file") to see full file of tutorial_3

```Java
/*
Date 16-10-2021

In this Java tutorial, you will learn about variables and data types
*/

public class tutorial_3 {
    public static void main(String[] args) {

        long num_1 = 8;
        short num_2 = 4;
        float num_3 = 8.998701f;
        double sum = num_1 + num_2 + num_3;
        System.out.print("The sum of " + num_1 + ", " + num_2 + " and " + num_3 + " is ----> ");
        // System.out.println(num_1);
        System.out.println(sum);
    }
}

```

---

---

## **_4.) tutorial_4 of Java_**

### [**_Click me_**](tutorial_4.java "Click here to see full file") to see full file of tutorial_4

```Java
/*
Date 16-10-2021

In this Java tutorial, you will learn about Java literals
Note: Literal in Java is a synthetic representation of boolean, numeric, character, or string data. It is a means of expressing particular values in the program, such as an integer variable named ''/count is assigned an integer value in the following statement. int count = 0; A literal '0' represents the value zero.
*/

public class tutorial_4 {
    public static void main(String[] args) {

        byte age = 15;
        int age2 = 56;
        short age3 = 87;
        long ageDino_1 = 8446744073709551615l;
        long ageDino_2 = 8446744073709551615L;
        char ch = 'A';
        float f1 = 5.6f;
        double d1 = 4.66d;
        boolean a = true;

        String str = "Aman\'s age is ";

        System.out.print(str);
        System.out.println(age);
    }
}

```

---

---

## **_5.) tutorial_5 of Java_**

### [**_Click me_**](tutorial_5.java "Click here to see full file") to see full file of tutorial_5

```Java
/*
Date 16-10-2021

In this Java tutorial, you will learn about taking input from user
*/

import java.util.Scanner;

public class tutorial_5 {
    public static void main(String[] args) {

        System.out.println("Enter first variable to add!");
        Scanner input_from_user_1 = new Scanner(System.in);
        float num_1 = input_from_user_1.nextFloat();
        System.out.println("Enter second variable to add!");
        Scanner input_from_user_2 = new Scanner(System.in);
        float num_2 = input_from_user_2.nextFloat();

        System.out.println("The sum of " + num_1 + " and " + num_2 + " is " + (num_1 + num_2));

    }
}

```

---

---

## **_6.) tutorial_6_exercise of Java_**

### [**_Click me_**](tutorial_6_exercise.java "Click here to see full file") to see full file of tutorial_6_exercise

```Java
/*
Date 19-10-2021

This tutorial is an exercise in which you need to do the below question
Write a program to calculate the percentage of a given student in exam. His marks from 5 subjects must be taken as input from the user(marks are out of 100)
*/

import java.util.Scanner;

public class tutorial_6_exercise {
    public static void main(String[] args) {

        System.out.print("Enter your name --> ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("Enter your Maths");
        input = new Scanner(System.in);
        int maths = input.nextInt();
        System.out.println("Enter your Science");
        input = new Scanner(System.in);
        int science = input.nextInt();
        System.out.println("Enter your English");
        input = new Scanner(System.in);
        int english = input.nextInt();
        System.out.println("Enter your Hindi");
        input = new Scanner(System.in);
        int hindi = input.nextInt();
        System.out.println("Enter your Social Science");
        input = new Scanner(System.in);
        int social_science = input.nextInt();

        float percentage = ((maths + science + english + hindi + social_science) / 5.0f);
        System.out.printf(
                "%s\'s marks - \nMaths are %d\nScience are %d\nEnglish are %d\nHindi are %d\nSocial Science are %d\nAnd %s\'s Percentage is %f\nAnd %s\'s CGPA is %f",
                name, maths, science, english, hindi, social_science, name, percentage, name, (percentage / 9.5f));

    }
}

```

---

---

## **_7.) tutorial_7 of Java_**

### [**_Click me_**](tutorial_7.java "Click here to see full file") to see full file of tutorial_7

```Java
/*
Date 19-10-2021

This tutorial covers some very simple practice questions so I did not covered it
*/

public class tutorial_7 {
    public static void main(String[] args) {

        System.out.println("Hello World!");
    }
}

```

---

---

## **_8.) tutorial_8 of Java_**

### [**_Click me_**](tutorial_8.java "Click here to see full file") to see full file of tutorial_8

```Java
/*
Date 19-10-2021

In this Java tutorial, you will learn about operators
*/

public class tutorial_8 {
    public static void main(String[] args) {
        int num_1 = 7;
        int num_2 = num_1 + 2;
        System.out.println(++num_2);
        System.out.println(num_2 == num_1 + 3);
        System.out.println((2 << 1 == 4) && (4 != 4));
        System.out.println((2 << 1 == 4) || (4 != 4));
    }
}

```

---

---

## **_9.) tutorial_9 of Java_**

### [**_Click me_**](tutorial_9.java "Click here to see full file") to see full file of tutorial_9

```Java
/*
Date 19-10-2021

In this Java tutorial, you will learn about operator precedence and it's associativity
*/

public class tutorial_9 {
    public static void main(String[] args) {

        double num = 8 * 4 / 2 + 2 - 1;
        System.out.println("8 * 4 / 2 + 2 - 1                   = " + num);

        num = (8 * 4) / (2.0 + (2 - 1));
        System.out.println("(8 * 4) / (2.0 + (2 - 1))           = " + num);
    }
}

```

---

---

## **_10.) tutorial_10 of Java_**

### [**_Click me_**](tutorial_10.java "Click here to see full file") to see full file of tutorial_10

```Java
/*
Date 19-10-2021

In this Java tutorial, you will learn about resulting data type after arithmetic operations
*/

public class tutorial_10 {
    public static void main(String[] args) {

        double num = 78f + 2;
        System.out.println(num);

        char alphabet = 'Y';
        System.out.println(++alphabet);
    }
}

```

---

---

## **_11.) tutorial_13 of Java_**

### [**_Click me_**](tutorial_13.java "Click here to see full file") to see full file of tutorial_13

```Java
/*
Date 19-10-2021

In this Java tutorial, you will learn about basics of strings
*/

public class tutorial_13 {
    public static void main(String[] args) {

        String name = new String("Unknown");
        // ! name = String("Unknown");
        name = new String("Aman");
        System.out.printf("Name is %10s\n", name);
        System.out.format("Name is %10s\n", name);

    }
}

```

---

---

## **_12.) tutorial_14 of Java_**

### [**_Click me_**](tutorial_14.java "Click here to see full file") to see full file of tutorial_14

```Java
/*
Date 19-10-2021

In this Java tutorial, you will learn about basics string methods
Note: All the string methods are not covered in this tutorial you can browse it to know more about string methods.
*/

public class tutorial_14 {
    public static void main(String[] args) {

        String name = "Unknown";

        System.out.printf("Name is %s and it\'s length is %d\n", name, name.length());
        System.out.printf("Name is %s and it\'s lower case version is %s\n", name, name.toLowerCase());
        System.out.printf("Name is %s and it\'s upper case version is %s\n", name, name.toUpperCase());
        System.out.printf("Name is %s and it\'s value after trimming is %s\n", name, name.trim());
        System.out.printf("Name is %s and value of string character on index 4 is %s\n", name, name.charAt(4));

    }
}

```

---

---

## **_13.) tutorial_15 of Java_**

### [**_Click me_**](tutorial_15.java "Click here to see full file") to see full file of tutorial_15

```Java
/*
Date 19-10-2021

This tutorial covers some very simple practice questions so I did not covered it
*/

public class tutorial_15 {
    public static void main(String[] args) {

        System.out.println("Hello World!");
    }
}

```

---

---

## **_14.) tutorial_16 of Java_**

### [**_Click me_**](tutorial_16.java "Click here to see full file") to see full file of tutorial_16

```Java
/*
Date 19-10-2021

In this Java tutorial, you will learn about if-else conditional statements
*/

public class tutorial_16 {
    public static void main(String[] args) {

        short age = 17;

        if (age < 18) {
            System.out.println("You can\'t drive");
        } else {
            System.out.println("You can drive");
        }

    }
}

```

---

---

## **_15.) tutorial_17 of Java_**

### [**_Click me_**](tutorial_17.java "Click here to see full file") to see full file of tutorial_17

```Java
/*
Date 20-10-2021

In this Java tutorial, you will learn about Relational and logical Operator
*/

public class tutorial_17 {
    public static void main(String[] args) {

        boolean bool_1 = true;
        boolean bool_2 = false;

        if (!((!(bool_1 && bool_2)) || (!(bool_1 && bool_2)))) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}

```

---

---

## **_16.) tutorial_18 of Java_**

### [**_Click me_**](tutorial_18.java "Click here to see full file") to see full file of tutorial_18

```Java
/*
Date 20-10-2021

In this Java tutorial, you will learn about Conditional switch case statements
*/

import java.util.Scanner;

public class tutorial_18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age --> ");
        short age = input.nextShort();

        switch (age) {
        case 18 -> System.out.println("Now you are eligible of driving!");
        case 60 -> System.out.println("You are too old to for driving!");
        case 27 -> System.out.println("You are perfect for driving!");
        default -> System.out.printf("We don\'t know what to do with your age!\nBecause your age is %d", age);
        }
    }
}

```

---

---

## **_17.) tutorial_19 of Java_**

### [**_Click me_**](tutorial_19.java "Click here to see full file") to see full file of tutorial_19

```Java
/*
Date 20-10-2021

This tutorial covers some very simple practice questions so I did not covered it
*/

public class tutorial_19 {
    public static void main(String[] args) {

        System.out.println("This tutorial covers some very simple practice questions so I did not covered it");
    }
}

```

---

---

## **_18.) tutorial_20_exercise of Java_**

### [**_Click me_**](tutorial_20_exercise.java "Click here to see full file") to see full file of tutorial_20_exercise

```Java
/*
Date 20-10-2021

This tutorial is an exercise in which you need to do the below question
Write a program which plays Rock, Paper Scissor game with you
1 = Rock
2 = Paper
3 = Scissor
*/

// import java.util.random.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class tutorial_20_exercise {
    public static void main(String[] args) {

        System.out.print("Enter your name --> ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.printf("So %s how much round you want to play --> \n", name);
        short number_of_rounds = input.nextShort();

        System.out.printf("So %s you need to play %d rounds with computer.\n", name, number_of_rounds);

        System.out.println("Press 1 for Rock.\nPress 2 for Paper.\nPress 3 for Scissor.");

        short user_score = 0;
        short computer_score = 0;
        short number_of_rounds_to_display_user = 1;
        short user_choice;
        short computer_choice;
        String user_choice_string;
        String computer_choice_string;

        while (number_of_rounds_to_display_user != (number_of_rounds + 1)) {
            System.out.printf("\nRound %d\nEnter your choice i.e. 1 for Rock, 2 for Paper, and 3 for Scissor.\n",
                    number_of_rounds_to_display_user++);
            user_choice = input.nextShort();
            computer_choice = (short) ThreadLocalRandom.current().nextInt(1, 4);

            switch (user_choice) {
            case 1:
                user_choice_string = "Rock";
                break;
            case 2:
                user_choice_string = "Paper";
                break;
            case 3:
                user_choice_string = "Scissor";
                break;

            default:
                user_choice_string = "Not a valid choice";
                break;
            }

            switch (computer_choice) {
            case 1:
                computer_choice_string = "Rock";
                break;
            case 2:
                computer_choice_string = "Paper";
                break;
            case 3:
                computer_choice_string = "Scissor";
                break;

            default:
                computer_choice_string = "Not a valid choice";
                break;
            }

            // System.out.printf("%s\'s choice is %s and computer choice is %s\n", name,
            // user_choice_string,
            // computer_choice_string);

            if (user_choice == computer_choice) {
                System.out.println("No one won this turn because both player had chosen " + user_choice_string
                        + ". Hence this round will be reconsider.");
                --number_of_rounds_to_display_user;
            } else if (user_choice == 1) {
                if (computer_choice == 2) {
                    // * Computer won
                    System.out.printf("You lose this turn because\nComputer had chosen %s and you had chosen %s.\n",
                            computer_choice_string, user_choice_string);
                    computer_score += 1;
                }
                if (computer_choice == 3) {
                    // * User won
                    System.out.printf("You won this turn because\nComputer had chosen %s and you had chosen %s.\n",
                            computer_choice_string, user_choice_string);
                    user_score += 1;
                }
            } else if (user_choice == 2) {
                if (computer_choice == 1) {
                    // * User won
                    System.out.printf("You won this turn because\nComputer had chosen %s and you had chosen %s.\n",
                            computer_choice_string, user_choice_string);
                    user_score += 1;
                }
                if (computer_choice == 3) {
                    // * Computer won
                    System.out.printf("You lose this turn because\nComputer had chosen %s and you had chosen %s.\n",
                            computer_choice_string, user_choice_string);
                    computer_score += 1;
                }
            } else if (user_choice == 3) {
                if (computer_choice == 1) {
                    // * Computer won
                    System.out.printf("You lose this turn because\nComputer had chosen %s and you had chosen %s.\n",
                            computer_choice_string, user_choice_string);
                    computer_score += 1;
                }
                if (computer_choice == 2) {
                    // * User won
                    System.out.printf("You won this turn because\nComputer had chosen %s and you had chosen %s.\n",
                            computer_choice_string, user_choice_string);
                    user_score += 1;
                }
            }

        }
        System.out.print("\n\n\n\n\n");
        // * Calculation of the score
        if (user_score == computer_score) {
            // * Match is a draw
            System.out.printf("You both score %d hence match is considered draw\n", computer_score);
        } else if (user_score > computer_score) {
            // * User won full match
            System.out.printf(
                    "You won the match by %d more score than Computer.\nYours Score is %d and,\nComputer\'s score is %d\n",
                    (user_score - computer_score), user_score, computer_score);
        } else {
            // * Computer won full match
            System.out.printf(
                    "You lose the match by %d less score than Computer.\nYours Score is %d and,\nComputer\'s score is %d\n",
                    (computer_score - user_score), user_score, computer_score);
        }

    }
}

```

---

---

## **_19.) tutorial_21 of Java_**

### [**_Click me_**](tutorial_21.java "Click here to see full file") to see full file of tutorial_21

```Java
/*
Date 20-10-2021

In this Java tutorial, you will learn about while Loops
*/

public class tutorial_21 {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 100) {
            System.out.printf("Hello World! Repeated number is %d\n", i++);
        }
    }
}

```

---

---

## **_20.) tutorial_22 of Java_**

### [**_Click me_**](tutorial_22.java "Click here to see full file") to see full file of tutorial_22

```Java
/*
Date 20-10-2021

In this Java tutorial, you will learn about do-while loops
*/

public class tutorial_22 {
    public static void main(String[] args) {

        int i = 11;
        do {
            System.out.printf("Hello World! Repeated number is %d\n", i++);
        } while (i <= 10);
    }
}

```

---

---

## **_21.) tutorial_23 of Java_**

### [**_Click me_**](tutorial_23.java "Click here to see full file") to see full file of tutorial_23

```Java
/*
Date 20-10-2021

In this Java tutorial, you will learn about for loops
*/

public class tutorial_23 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            System.out.printf("Hello World! Repeated number is %d\n", i);
        }
    }
}

```

---

---

## **_22.) tutorial_24 of Java_**

### [**_Click me_**](tutorial_24.java "Click here to see full file") to see full file of tutorial_24

```Java
/*
Date 20-10-2021

In this Java tutorial, you will learn about break and continue statements
*/

public class tutorial_24 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.printf("Hello World! Repeated number is %3d\n", i);
            if (i++ == 50) {
                break;
            }
        }
    }
}

```

---

---

## **_23.) tutorial_25 of Java_**

### [**_Click me_**](tutorial_25.java "Click here to see full file") to see full file of tutorial_25

```Java
/*
Date 20-10-2021

This tutorial covers some very simple practice questions so I did not covered it
*/

public class tutorial_25 {
    public static void main(String[] args) {

        System.out.println("Hello World!");
    }
}

```

---

---

## **_24.) tutorial_26 of Java_**

### [**_Click me_**](tutorial_26.java "Click here to see full file") to see full file of tutorial_26

```Java
/*
Date 20-10-2021

In this Java tutorial, you will learn about Arrays
*/

public class tutorial_26 {
    public static void main(String[] args) {

        int array_length = 100;
        int[] num = new int[array_length];

        for (int i = 0; i < array_length; i++) {
            num[i] = i + i;
        }

        for (int i = 0; i < array_length; i++) {
            System.out.printf("Value at index %3d is %5d\n", i, num[i]);
        }

    }
}

```

---

---

## **_25.) tutorial_27 of Java_**

### [**_Click me_**](tutorial_27.java "Click here to see full file") to see full file of tutorial_27

```Java
/*
Date 20-10-2021

In this Java tutorial, you will learn about for-each loop, which is used in accessing elements of an array one-by-one
*/

import java.util.concurrent.ThreadLocalRandom;

public class tutorial_27 {
    public static void main(String[] args) {

        float[] num = new float[100];

        for (int i = 0; i < num.length; i++) {
            num[i] = ThreadLocalRandom.current().nextFloat(1.54877f, 87.54784f);
        }

        for (float element_of_array_num : num) {
            System.out.printf("Value is %10.3f\n", element_of_array_num);
        }
    }
}

```

---

---

## **_26.) tutorial_28 of Java_**

### [**_Click me_**](tutorial_28.java "Click here to see full file") to see full file of tutorial_28

```Java
/*
Date 20-10-2021

In this Java tutorial, you will learn about Multi-Dimensional arrays
*/

import java.util.concurrent.ThreadLocalRandom;

public class tutorial_28 {
    public static void main(String[] args) {

        float[][][][][] dimension_5_array = new float[2][2][2][2][2];

        for (int x = 0; x < dimension_5_array.length; x++) {

            for (int y = 0; y < dimension_5_array[x].length; y++) {

                for (int z = 0; z < dimension_5_array[x][y].length; z++) {

                    for (int dimension_4 = 0; dimension_4 < dimension_5_array[x][y][z].length; dimension_4++) {

                        for (int dimension_5 = 0; dimension_5 < dimension_5_array[x][y][z][dimension_4].length; dimension_5++) {

                            dimension_5_array[x][y][z][dimension_4][dimension_5] = ThreadLocalRandom.current()
                                    .nextFloat(1.54877f, 87.54784f);
                        }
                    }
                }
            }
        }
        int number = 1;
        while (true) {

            for (int x = 0; x < dimension_5_array.length; x++) {

                for (int y = 0; y < dimension_5_array[x].length; y++) {

                    for (int z = 0; z < dimension_5_array[x][y].length; z++) {

                        for (int dimension_4 = 0; dimension_4 < dimension_5_array[x][y][z].length; dimension_4++) {

                            for (int dimension_5 = 0; dimension_5 < dimension_5_array[x][y][z][dimension_4].length; dimension_5++) {

                                System.out.printf("%2d.)Value of dimension_5_array[%d][%d][%d][%d][%d] = %10.6f\n",
                                        number++, x, y, z, dimension_4, dimension_5,
                                        dimension_5_array[x][y][z][dimension_4][dimension_5]);
                            }
                        }
                    }
                }
            }
            break;
        }
    }
}

```

---

---

## **_27.) tutorial_29 of Java_**

### [**_Click me_**](tutorial_29.java "Click here to see full file") to see full file of tutorial_29

```Java
/*
Date 20-10-2021

This tutorial covers some very simple practice questions so I did not covered it
*/

public class tutorial_29 {
    public static void main(String[] args) {

        System.out.println("Hello World!");
    }
}

```

---

---

## **_28.) tutorial_31 of Java_**

### [**_Click me_**](tutorial_31.java "Click here to see full file") to see full file of tutorial_31

```Java
/*
Date 20-10-2021

In this Java tutorial, you will learn about methods
Note: There are no function in Java, there are only methods in Java as it is only Object Oriented Language
*/

public class tutorial_31 {

    static int difference(int x, int y) {
        if (x > y) {
            return x - y;
        }
        return y - x;
    }

    public static void main(String[] args) {

        System.out.println(difference(9, 9));
    }
}

```

---

---

## **_29.) tutorial_32_1 of Java_**

### [**_Click me_**](tutorial_32_1.java "Click here to see full file") to see full file of tutorial_32_1

```Java
/*
Date 20-10-2021

In this Java tutorial, you will learn about method Overloading
*/

public class tutorial_32_1 {

    static void change_var_value(int num) {

        // * This method will not change the value because, it is using call by value
        // * property of a variable
        num = 786;
    }

    static void change_array_value(int[] arr) {
        // * This method is using call by reference property of a variable, so value
        // * will definitely change
        arr[0] = 7845;
    }

    public static void main(String[] args) {

        int var = 10;
        int[] array = { 4, 7, 2, 9, 4 };

        change_var_value(var);
        change_array_value(array);

        System.out.println("Value of var is " + var);
        System.out.println("Value of array[0] is " + array[0]);
    }
}

```

---

---

## **_30.) tutorial_32_2 of Java_**

### [**_Click me_**](tutorial_32_2.java "Click here to see full file") to see full file of tutorial_32_2

```Java
/*
Date 20-10-2021

In this Java tutorial, you will learn about method Overloading
*/

public class tutorial_32_2 {

    static int sum(int x, int y) {
        return x + y;
    }

    static int sum(int x, int y, int z) {
        return x + y + z;
    }

    static int sum(int x, int y, int z, int extra_var) {
        return x + y + z + extra_var;
    }

    public static void main(String[] args) {

        System.out.println(sum(2, 2));
        System.out.println(sum(2, 2, 2));
        System.out.println(sum(2, 2, 2, 2));
    }
}

```

---

---

## **_31.) tutorial_33 of Java_**

### [**_Click me_**](tutorial_33.java "Click here to see full file") to see full file of tutorial_33

```Java
/*
Date 20-10-2021

In this Java tutorial, you will learn about Variable Arguments
*/

public class tutorial_33 {

    static int sum(int... arr) {
        int result = 0;
        for (int element : arr) {
            result += element;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(sum());
        System.out.println(sum(2, 2, 1, 4, 10, 2, 2));
    }
}

```

---

---

## **_32.) tutorial_34_1 of Java_**

### [**_Click me_**](tutorial_34_1.java "Click here to see full file") to see full file of tutorial_34_1

```Java
/*
Date 20-10-2021

In this Java tutorial, you will learn about Recursion
Note: In some cases we can also us Iterative approach instead of Recursion to enhance speed
0! = 1
n! = n * n-1 *....1
5! = 5 * 4 * 3 * 2 * 1 = 120
n! = n * (n-1)!
*/

public class tutorial_34_1 {

    static long factorial_using_recursion(int n) {
        long result = 1;

        if ((n == 0) || (n == 1)) {
            return result;
        }

        return (n * (factorial_using_recursion(n - 1)));
    }

    static long factorial_using_iterative_approach(int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {

        short n = 20;
        // 0! = 1
        // 1! = 1
        // 2! = 2
        // 3! = 6
        // 4! = 24
        // 5! = 120

        System.out.printf("Factorial of %d using Iterative Approach is %d\n", n, factorial_using_iterative_approach(n));
        System.out.printf("Factorial of %d using Recursion Approach is %d\n", n, factorial_using_recursion(n));

    }
}

```

---

---

## **_33.) tutorial_34_2 of Java_**

### [**_Click me_**](tutorial_34_2.java "Click here to see full file") to see full file of tutorial_34_2

```Java
/*
Date 20-10-2021

This is an type of exercise in which you need to print Fibonacci series
Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)......
*/

public class tutorial_34_2 {

    static long fibonacci_using_recursion(int n) {
        long result = 0;

        if (n == 0) {
            return result;
        } else if ((n == 2) || (n == 3)) {
            return ++result;
        }

        return fibonacci_using_recursion(n - 1) + fibonacci_using_recursion(n - 2);
    }

    // todo static long fibonacci_using_iterative_approach(int n) {
    // todo long result = 0, first = 0, second = 1;
    // todo if (n == 0) {
    // todo return 0;
    // todo } else if ((n == 2) || (n == 3)) {
    // todo return 1;
    // todo }
    // todo for (int i = 0; i < n; i++) {
    // todo if (i <= 1) {
    // todo result = i;
    // todo } else {
    // todo result = first + second;
    // todo first = second;
    // todo second = result;
    // todo }
    // todo }
    // todo return result;
    // todo }

    public static void main(String[] args) {

        short n = 10;

        // todo System.out.printf("Fibonacci of %d using Iterative Approach is %d\n",
        // todo n,fibonacci_using_iterative_approach(n));

        System.out.printf("Fibonacci of %d using Recursion Approach is %d\n", n, fibonacci_using_recursion(n));

    }
}

```

---

---

## **_34.) tutorial_35 of Java_**

### [**_Click me_**](tutorial_35.java "Click here to see full file") to see full file of tutorial_35

```Java
/*
Date 20-10-2021

This tutorial covers some very simple practice questions so I did not covered it
*/

public class tutorial_35 {
    public static void main(String[] args) {

        System.out.println("Hello World!");
    }
}

```

---

---

## **_35.) tutorial_38 of Java_**

### [**_Click me_**](tutorial_38.java "Click here to see full file") to see full file of tutorial_38

```Java
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

```

---

---

## **_36.) tutorial_39 of Java_**

### [**_Click me_**](tutorial_39.java "Click here to see full file") to see full file of tutorial_39

```Java
/*
Date 21-10-2021

This tutorial covers some very simple practice questions so I did not covered it
*/

public class tutorial_39 {
    public static void main(String[] args) {

        System.out.println("Hello World!");
    }
}

```

---

---

## **_37.) tutorial_40 of Java_**

### [**_Click me_**](tutorial_40.java "Click here to see full file") to see full file of tutorial_40

```Java
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

```

---

---

## **_38.) tutorial_41 of Java_**

### [**_Click me_**](tutorial_41.java "Click here to see full file") to see full file of tutorial_41

```Java
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

```

---

---

## **_39.) tutorial_43_exercise of Java_**

### [**_Click me_**](tutorial_43_exercise.java "Click here to see full file") to see full file of tutorial_43_exercise

```Java
/*
Date 21-10-2021

This tutorial is an exercise in which you need to do the below question

Create a class Game, which allows a user to play "Guess the Number" game once.

Game should have the following methods:
Constructor to generate the random number
takeUserInput() to take a user input of number
isCorrectNumber() to detect whether the number entered by the user is correct
getter and setter for noOfGuesses

Note: Use properties such as noOfGuesses(int), etc to get this task done!
*/

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

class tutorial_43_exercise_guess_game {
    private short random_number;
    String name;
    short user_input;
    private short turns;
    private short turn_used = 1;

    tutorial_43_exercise_guess_game() {
        get_name_input();
        this.random_number = (short) ThreadLocalRandom.current().nextInt(1, 101);
    }

    public tutorial_43_exercise_guess_game get_name_input() {
        System.out.print("Enter your name to play game --> ");
        Scanner name = new Scanner(System.in);
        this.name = name.nextLine();
        return this;
    }

    public tutorial_43_exercise_guess_game get_user_input() {
        System.out.printf("%s guess and enter a number between 1 to 100 --> ", this.name);
        Scanner user_input = new Scanner(System.in);
        this.user_input = user_input.nextShort();
        return this;
    }

    public tutorial_43_exercise_guess_game set_number_of_turns() {
        System.out.printf("%s how many turns you want to start with--> ", this.name);
        Scanner user_input_turns = new Scanner(System.in);
        this.turns = user_input_turns.nextShort();
        return this;
    }

    public tutorial_43_exercise_guess_game print_all_info() {
        System.out.printf("Random number --> %d\n", this.random_number);
        System.out.printf("User input number --> %d\n", this.user_input);
        System.out.printf("Name --> %s\n", this.name);
        return this;
    }

    public tutorial_43_exercise_guess_game check_bigger_or_smaller() {
        if (this.random_number > this.user_input) {
            System.out.println("Your entered number is smaller than the computer\'s chosen number");
            return this;
        } else if (this.random_number < this.user_input) {
            System.out.println("Your entered number is bigger than the computer\'s chosen number");
            return this;
        }
        System.out.printf("Congratulations! %s you won the match in %d chances", this.name, this.turn_used);
        this.turns = 0;
        return this;

    }

    public tutorial_43_exercise_guess_game game_loop() {
        this.set_number_of_turns();

        for (this.turn_used = 1; this.turn_used <= this.turns; this.turn_used++) {
            System.out.println("\nChance Number: " + this.turn_used);
            this.get_user_input();
            this.check_bigger_or_smaller();
        }

        System.out.println("\n\nComputer had chosen: " + this.random_number);

        return this;
    }

}

public class tutorial_43_exercise {
    public static void main(String[] args) {

        tutorial_43_exercise_guess_game player = new tutorial_43_exercise_guess_game();

        player.game_loop();
    }
}

```

---

---

## **_40.) tutorial_44 of Java_**

### [**_Click me_**](tutorial_44.java "Click here to see full file") to see full file of tutorial_44

```Java
/*
Date 21-10-2021

This tutorial covers some very simple practice questions so I did not covered it
*/

public class tutorial_44 {
    public static void main(String[] args) {

        System.out.println("Hello World!");
    }
}

```

---

---

## **_41.) tutorial_45 of Java_**

### [**_Click me_**](tutorial_45.java "Click here to see full file") to see full file of tutorial_45

```Java
/*
Date 21-10-2021

In this Java tutorial, you will learn about Inheritance
*/

class tutorial_45_Base_class {
    int x_of_base_class = 10;

    public tutorial_45_Base_class print_x() {
        System.out.printf("X of Base Class = %d\n", this.x_of_base_class);
        return this;
    }

    public tutorial_45_Base_class set_x(int x) {
        x_of_base_class = x;
        return this;
    }
}

class tutorial_45_Derived_class extends tutorial_45_Base_class {
    int y_of_derived_class = 89;

    public tutorial_45_Derived_class print_y() {
        System.out.printf("Y of Derived Class = %d\n", this.y_of_derived_class);
        return this;
    }

    public tutorial_45_Derived_class print_x_y() {
        print_x();
        print_y();
        return this;
    }

    public tutorial_45_Derived_class set_x_y(int x, int y) {
        x_of_base_class = x;
        y_of_derived_class = y;
        return this;
    }

}

public class tutorial_45 {
    public static void main(String[] args) {

        tutorial_45_Derived_class obj = new tutorial_45_Derived_class();

        obj.set_x(78).print_x();

        obj.set_x_y(458, 347).print_x_y();
    }

}

```

---

---

## **_42.) tutorial_46 of Java_**

### [**_Click me_**](tutorial_46.java "Click here to see full file") to see full file of tutorial_46

```Java
/*
Date 21-10-2021

In this Java tutorial, you will learn about Constructors in Inheritance and about super keyword
*/

class tutorial_46_Base_class {
    int x_of_base_class = 10;

    tutorial_46_Base_class(int x) {
        System.out.println("Constructor of Base class which takes 1 argument is called");
        set_x(x);
    }

    tutorial_46_Base_class() {
        System.out.println("Constructor of Base class which takes 0 argument is called");
        set_x(46);
    }

    public tutorial_46_Base_class print_x() {
        System.out.printf("X of Base Class = %d\n", this.x_of_base_class);
        return this;
    }

    public tutorial_46_Base_class set_x(int x) {
        this.x_of_base_class = x;
        return this;
    }
}

class tutorial_46_Derived_class_number_1 extends tutorial_46_Base_class {
    int y_of_derived_class_number_1 = 89;

    tutorial_46_Derived_class_number_1(int y) {
        System.out.println("Constructor of Derived class which takes 1 argument is called");
        set_y(y);
    }

    tutorial_46_Derived_class_number_1(int x, int y) {
        super(x);
        System.out.println("Constructor of Derived class which takes 2 argument is called");
        set_y(y);
    }

    tutorial_46_Derived_class_number_1() {
        System.out.println("Constructor of Derived class which takes 0 argument is called");
        set_x_y(987, 2134);
    }

    public tutorial_46_Derived_class_number_1 print_y() {
        System.out.printf("Y of Derived Class = %d\n", this.y_of_derived_class_number_1);
        return this;
    }

    public tutorial_46_Derived_class_number_1 print_x_y() {
        print_x();
        print_y();
        return this;
    }

    public tutorial_46_Derived_class_number_1 set_y(int y) {
        this.y_of_derived_class_number_1 = y;
        return this;
    }

    public tutorial_46_Derived_class_number_1 set_x_y(int x, int y) {
        set_x(x);
        set_y(y);
        return this;
    }

}

class tutorial_46_Derived_class_number_2 extends tutorial_46_Derived_class_number_1 {
    int z_of_derived_class_number_2 = 12;

    tutorial_46_Derived_class_number_2(int x, int y, int z) {
        super(x, y);
        System.out.println("Constructor of Second Derived class which takes 3 argument is called");
        set_z(z);
    }

    public tutorial_46_Derived_class_number_2 set_z(int z) {
        this.z_of_derived_class_number_2 = z;
        return this;
    }

    public tutorial_46_Derived_class_number_2 print_x_y_z() {
        this.print_x_y();
        this.print_z();
        return this;
    }

    public tutorial_46_Derived_class_number_2 print_z() {
        System.out.printf("Z of the Second Derived Class = %d\n", this.z_of_derived_class_number_2);
        return this;
    }
}

public class tutorial_46 {
    public static void main(String[] args) {

        tutorial_46_Derived_class_number_2 obj = new tutorial_46_Derived_class_number_2(458, 23, 514);
        obj.print_x_y_z();
    }

}

```

---

---

## **_43.) tutorial_47_1 of Java_**

### [**_Click me_**](tutorial_47_1.java "Click here to see full file") to see full file of tutorial_47_1

```Java
/*
Date 21-10-2021

In this Java tutorial, you will learn about this and super keyword in depth
*/

class tutorial_47_1_class_1 {
    int num_1;

    tutorial_47_1_class_1(int num_1) {
        num_1 = num_1;
    }

    public void print_info() {
        System.out.println("num_1 = " + num_1);
    }
}

class tutorial_47_1_class_2 {
    int num_1;

    tutorial_47_1_class_2(int num_1) {
        this.num_1 = num_1;
    }

    public void print_info() {
        System.out.println("num_1 = " + num_1);
    }
}

public class tutorial_47_1 {
    public static void main(String[] args) {
        int var_1 = 88;

        tutorial_47_1_class_1 obj_1 = new tutorial_47_1_class_1(var_1);
        obj_1.print_info();

        tutorial_47_1_class_2 obj_2 = new tutorial_47_1_class_2(var_1);
        obj_2.print_info();
    }
}

```

---

---

## **_44.) tutorial_47_2 of Java_**

### [**_Click me_**](tutorial_47_2.java "Click here to see full file") to see full file of tutorial_47_2

```Java
/*
Date 21-10-2021

In this Java tutorial, you will learn about this and super keyword in depth
Note: The code logic of this tutorial is same as logic of tutorial_46.java
*/

class tutorial_47_2_Base_class {
    int x_of_base_class = 10;

    tutorial_47_2_Base_class(int x) {
        System.out.println("Constructor of Base class which takes 1 argument is called");
        set_x(x);
    }

    tutorial_47_2_Base_class() {
        System.out.println("Constructor of Base class which takes 0 argument is called");
        set_x(46);
    }

    public tutorial_47_2_Base_class print_x() {
        System.out.printf("X of Base Class = %d\n", this.x_of_base_class);
        return this;
    }

    public tutorial_47_2_Base_class set_x(int x) {
        this.x_of_base_class = x;
        return this;
    }
}

class tutorial_47_2_Derived_class_number_1 extends tutorial_47_2_Base_class {
    int y_of_derived_class_number_1 = 89;

    tutorial_47_2_Derived_class_number_1(int y) {
        System.out.println("Constructor of Derived class which takes 1 argument is called");
        set_y(y);
    }

    tutorial_47_2_Derived_class_number_1(int x, int y) {
        super(x);
        System.out.println("Constructor of Derived class which takes 2 argument is called");
        set_y(y);
    }

    tutorial_47_2_Derived_class_number_1() {
        System.out.println("Constructor of Derived class which takes 0 argument is called");
        set_x_y(987, 2134);
    }

    public tutorial_47_2_Derived_class_number_1 print_y() {
        System.out.printf("Y of Derived Class = %d\n", this.y_of_derived_class_number_1);
        return this;
    }

    public tutorial_47_2_Derived_class_number_1 print_x_y() {
        print_x();
        print_y();
        return this;
    }

    public tutorial_47_2_Derived_class_number_1 set_y(int y) {
        this.y_of_derived_class_number_1 = y;
        return this;
    }

    public tutorial_47_2_Derived_class_number_1 set_x_y(int x, int y) {
        set_x(x);
        set_y(y);
        return this;
    }

}

class tutorial_47_2_Derived_class_number_2 extends tutorial_47_2_Derived_class_number_1 {
    int z_of_derived_class_number_2 = 12;

    tutorial_47_2_Derived_class_number_2(int x, int y, int z) {
        super(x, y);
        System.out.println("Constructor of Second Derived class which takes 3 argument is called");
        set_z(z);
    }

    public tutorial_47_2_Derived_class_number_2 set_z(int z) {
        this.z_of_derived_class_number_2 = z;
        return this;
    }

    public tutorial_47_2_Derived_class_number_2 print_x_y_z() {
        this.print_x_y();
        this.print_z();
        return this;
    }

    public tutorial_47_2_Derived_class_number_2 print_z() {
        System.out.printf("Z of the Second Derived Class = %d\n", this.z_of_derived_class_number_2);
        return this;
    }
}

public class tutorial_47_2 {
    public static void main(String[] args) {

        tutorial_47_2_Derived_class_number_2 obj = new tutorial_47_2_Derived_class_number_2(458, 23, 514);
        obj.print_x_y_z();
    }
}
```

---

---

## **_45.) tutorial_48 of Java_**

### [**_Click me_**](tutorial_48.java "Click here to see full file") to see full file of tutorial_48

```Java
/*
Date 21-10-2021

In this Java tutorial, you will learn about Method Overriding
*/

class tutorial_48_class_A {
    public void method_1() {
        System.out.println("I\'m Method 1 of Class A");
    }

    public void method_2() {
        System.out.println("I\'m Method 2 of Class A");
    }
}

class tutorial_48_class_B extends tutorial_48_class_A {

    @Override
    public void method_1() {
        // * This function is overriding method_1
        System.out.println("I\'m Method 1 of Class B");
    }

    public void method_2(int var) {
        // * This function is not overriding a method_2, it is overloading it
        System.out.println("I\'m Method 2 of Class B");
    }

    public void method_3() {
        System.out.println("I\'m Method 3 of Class B");
    }
}

public class tutorial_48 {
    public static void main(String[] args) {

        tutorial_48_class_B obj = new tutorial_48_class_B();
        // obj.method_1();
        obj.method_2();
        obj.method_2(89);
    }
}

```

---

---

## **_46.) tutorial_49 of Java_**

### [**_Click me_**](tutorial_49.java "Click here to see full file") to see full file of tutorial_49

```Java
/*
Date 21-10-2021

In this Java tutorial, you will learn about Dynamic Method Dispatch
Note: This code is also an example of run time Polymorphism
*/

class tutorial_49_class_Base {
    public tutorial_49_class_Base greet_me_of_class_Base() {
        System.out.println("Welcome by Base Class");
        return this;
    }

    public tutorial_49_class_Base name() {
        System.out.println("My name is --> Base Class");
        return this;
    }
}

class tutorial_49_class_Derived extends tutorial_49_class_Base {
    public tutorial_49_class_Base greet_me_of_class_Derived() {
        System.out.println("Welcome by Derived Class");
        return this;
    }

    public tutorial_49_class_Base name() {
        System.out.println("My name is --> Derived Class");
        return this;
    }
}

public class tutorial_49 {
    public static void main(String[] args) {

        // * Below line is not allowed in Java
        // ! tutorial_49_class_Derived obj = new tutorial_49_class_Base();
        // * Above line is not allowed in Java

        tutorial_49_class_Base obj = new tutorial_49_class_Derived();
        obj.greet_me_of_class_Base().name();
    }
}

```

---

---

## **_47.) tutorial_51_exercise of Java_**

### [**_Click me_**](tutorial_51_exercise.java "Click here to see full file") to see full file of tutorial_51_exercise

```Java
/*
Date 21-10-2021

This tutorial is an exercise in which you need to do the below question

You have to implement a library using Java Class "Library" it should have the following things-
    Methods: addBook, issueBook, returnBook, showAvailableBooks
    Properties: Array to store the available books,
    Array to store the issued books
*/

public class tutorial_51_exercise {
    public static void main(String[] args) {

        System.out.println("Hello World!");
    }
}

```

---

---

