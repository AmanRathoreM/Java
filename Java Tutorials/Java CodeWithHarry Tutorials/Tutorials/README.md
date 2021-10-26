# <h1 style="text-align:center; font-size:360%; font-family:verdana;color:#4A3E76;"><em>Java</em></h1>

# These tutorials are watched from [CodeWithHarry](https://www.youtube.com/channel/UCeVMnSShP_Iviwkknt83cww "Click here to checkout his channel") YouTube Channel's [Java Playlist](https://youtube.com/playlist?list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q "Click here to check out his Java tutorials Playlist").

---

---

---

---

---

## **_1.) tutorial_1 of Java_**

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_1.java "Clike here to see full file") to see full file of tutorial_1

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_2.java "Clike here to see full file") to see full file of tutorial_2

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_3.java "Clike here to see full file") to see full file of tutorial_3

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_4.java "Clike here to see full file") to see full file of tutorial_4

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_5.java "Clike here to see full file") to see full file of tutorial_5

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_6_exercise.java "Clike here to see full file") to see full file of tutorial_6_exercise

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_7.java "Clike here to see full file") to see full file of tutorial_7

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_8.java "Clike here to see full file") to see full file of tutorial_8

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_9.java "Clike here to see full file") to see full file of tutorial_9

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_10.java "Clike here to see full file") to see full file of tutorial_10

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_13.java "Clike here to see full file") to see full file of tutorial_13

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_14.java "Clike here to see full file") to see full file of tutorial_14

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_15.java "Clike here to see full file") to see full file of tutorial_15

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_16.java "Clike here to see full file") to see full file of tutorial_16

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_17.java "Clike here to see full file") to see full file of tutorial_17

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_18.java "Clike here to see full file") to see full file of tutorial_18

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_19.java "Clike here to see full file") to see full file of tutorial_19

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_20_exercise.java "Clike here to see full file") to see full file of tutorial_20_exercise

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_21.java "Clike here to see full file") to see full file of tutorial_21

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_22.java "Clike here to see full file") to see full file of tutorial_22

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_23.java "Clike here to see full file") to see full file of tutorial_23

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_24.java "Clike here to see full file") to see full file of tutorial_24

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_25.java "Clike here to see full file") to see full file of tutorial_25

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_26.java "Clike here to see full file") to see full file of tutorial_26

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_27.java "Clike here to see full file") to see full file of tutorial_27

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_28.java "Clike here to see full file") to see full file of tutorial_28

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_29.java "Clike here to see full file") to see full file of tutorial_29

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_31.java "Clike here to see full file") to see full file of tutorial_31

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_32_1.java "Clike here to see full file") to see full file of tutorial_32_1

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_32_2.java "Clike here to see full file") to see full file of tutorial_32_2

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_33.java "Clike here to see full file") to see full file of tutorial_33

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_34_1.java "Clike here to see full file") to see full file of tutorial_34_1

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_34_2.java "Clike here to see full file") to see full file of tutorial_34_2

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_35.java "Clike here to see full file") to see full file of tutorial_35

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_38.java "Clike here to see full file") to see full file of tutorial_38

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_39.java "Clike here to see full file") to see full file of tutorial_39

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_40.java "Clike here to see full file") to see full file of tutorial_40

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_41.java "Clike here to see full file") to see full file of tutorial_41

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_43_exercise.java "Clike here to see full file") to see full file of tutorial_43_exercise

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_44.java "Clike here to see full file") to see full file of tutorial_44

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_45.java "Clike here to see full file") to see full file of tutorial_45

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_46.java "Clike here to see full file") to see full file of tutorial_46

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_47_1.java "Clike here to see full file") to see full file of tutorial_47_1

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_47_2.java "Clike here to see full file") to see full file of tutorial_47_2

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_48.java "Clike here to see full file") to see full file of tutorial_48

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_49.java "Clike here to see full file") to see full file of tutorial_49

```java
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

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_51_exercise.java "Clike here to see full file") to see full file of tutorial_51_exercise

```java
/*
Date 21-10-2021

This tutorial is an exercise in which you need to do the below question

You have to implement a library using Java Class "Library" it should have the following things-
    Methods: addBook, showAvailableBooks, issueBook, returnBook
    Properties: Array to store the available books,
    Array to store the issued books
*/

class tutorial_51_exercise_Library {

    String[] books_list = new String[100];
    String library_name;
    short index_num_to_append_books = 0;

    tutorial_51_exercise_Library(String library_name) {
        this.library_name = library_name;
    }

    public tutorial_51_exercise_Library add_books(String... book_names) {

        for (int i = 0; i < book_names.length; i++) {
            this.books_list[this.index_num_to_append_books++] = "(Available)   \t" + book_names[i];
        }

        return this;
    }

    public tutorial_51_exercise_Library display_books() {
        for (int i = 0; i < this.index_num_to_append_books; i++) {
            System.out.printf("%2d.) %s\n", i + 1, books_list[i]);
        }
        return this;
    }

    public tutorial_51_exercise_Library issue_book(int... book_numbers) {
        for (int book_number : book_numbers) {
            this.books_list[--book_number] = this.books_list[book_number].replace("(Available)   ", "(Not Available)");
        }
        end();
        return this;
    }

    public tutorial_51_exercise_Library return_book(int... book_numbers) {
        for (int book_number : book_numbers) {
            this.books_list[--book_number] = this.books_list[book_number].replace("(Not Available)", "(Available)   ");
        }
        end();
        return this;
    }

    private void end() {
        System.out.printf("Thanks for using %s\n", library_name);
    }
}

public class tutorial_51_exercise {
    public static void main(String[] args) {

        tutorial_51_exercise_Library lib = new tutorial_51_exercise_Library("City Library");

        lib.add_books("Sapiens-A brief history of Human Kind").add_books("Advances in Robot Kinematics",
                "Application-Specific Integrated Circuits by SMITH", "C++ Primer Plus",
                "Classic Computer Science Problems in Python", "Computer Science Distilled",
                "Cracking Codes with Python An Introduction", "Cython - A Guide for Python Programmers",
                "Deep Learning by Ian Goodfellow, Yoshua Bengio, Aaron Courville", "Deep Learning with Python",
                "Digital Computer Electronics", "Dive Into Algorithms",
                "The Hidden Language of Computer Hardware and Software");

        lib.issue_book(2, 1, 8, 10).display_books();
        System.out.print("\n");
        lib.return_book(10, 8, 1).display_books();

    }
}

```

---

---

## **_48.) tutorial_52 of Java_**

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_52.java "Clike here to see full file") to see full file of tutorial_52

```java
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

```

---

---

## **_49.) tutorial_53 of Java_**

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_53.java "Clike here to see full file") to see full file of tutorial_53

```java
/*
Date 22-10-2021

In this Java tutorial, you will learn about Abstract base classes and Abstract methods

An abstract method in Java is declared through the keyword "abstract". There is no body in an abstract method, only the signature of the method is present.
If there is only one abstract method in the class then also that class will considered as abstract base class
*/

abstract class tutorial_53_Base_class {
    tutorial_53_Base_class() {
        System.out.println("I\'m constructor of tutorial_53_Base_class");
    }

    public void say_hello() {
        System.out.println("Hello! I'm saying hello to you!");
    }

    abstract public void greet();
}

class tutorial_53_Derived_class_1 extends tutorial_53_Base_class {
    @Override
    public void greet() {
        System.out.println("I'm greeting you!");
    }
}

class tutorial_53_Derived_class_2 extends tutorial_53_Base_class {
    @Override
    public void greet() {
        System.out.println("I'll not greet you at any cause!");
    }
}

abstract class tutorial_53_Derived_class_3 extends tutorial_53_Base_class {
}

public class tutorial_53 {
    public static void main(String[] args) {

        tutorial_53_Derived_class_1 obj_1 = new tutorial_53_Derived_class_1();
        obj_1.greet();

        tutorial_53_Derived_class_2 obj_2 = new tutorial_53_Derived_class_2();
        obj_2.greet();

    }
}

```

---

---

## **_50.) tutorial_54 of Java_**

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_54.java "Clike here to see full file") to see full file of tutorial_54

```java
/*
Date 23-10-2021

In this Java tutorial, you will learn about Interfaces
An interface in the Java programming language is an abstract type that is used to specify a behavior that classes must implement. They are similar to protocols. Interfaces are declared using the interface keyword, and may only contain method signature and constant declarations.
*/

public class tutorial_54 {
    public static void main(String[] args) {

        System.out.println("hello!");

    }
}

```

---

---

## **_51.) tutorial_55_1 of Java_**

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_55_1.java "Clike here to see full file") to see full file of tutorial_55_1

```java
/*
Date 23-10-2021

In this Java tutorial, you will learn about difference between Abstract Based classes and Interfaces Based classes
You can create properties in Interfaces
You cannot modify the properties in Interfaces as they are final by-default
*/

interface tutorial_55_bicycle {

    void apply_brake();

    void accelerate(float percent_of_increasing_speed);

}

interface tutorial_55_blow_horn {

    void blow_horn_high_volume();

    void blow_horn_low_volume();

}

class tutorial_55_avon_cycle implements tutorial_55_bicycle, tutorial_55_blow_horn {

    public void blow_horn() {
        System.out.println("Blowing horn of Avon Cycle");
    }

    public void apply_brake() {
        System.out.println("Break applied in Avon Cycle");
    }

    public void accelerate(float percent_of_increasing_speed) {
        System.out.printf("%f percent speed is increased in Avon Cycle", percent_of_increasing_speed);
    }

    public void blow_horn_low_volume() {
        System.out.println("Blowing Low volume horn of Avon Cycle");
    }

    public void blow_horn_high_volume() {
        System.out.println("Blowing High volume horn of Avon Cycle");
    }

}

class tutorial_55_atlas_cycle implements tutorial_55_bicycle, tutorial_55_blow_horn {
    public void blow_horn() {
        System.out.println("Blowing horn of Atlas Cycle");
    }

    public void apply_brake() {
        System.out.println("Break applied in Atlas Cycle");
    }

    public void accelerate(float percent_of_increasing_speed) {
        System.out.printf("%f percent speed is increased in Atlas Cycle", percent_of_increasing_speed);
    }

    public void blow_horn_low_volume() {
        System.out.println("Blowing Low volume horn of Atlas Cycle");
    }

    public void blow_horn_high_volume() {
        System.out.println("Blowing High volume horn of Atlas Cycle");
    }
}

public class tutorial_55_1 {
    public static void main(String[] args) {

        tutorial_55_avon_cycle av_obj = new tutorial_55_avon_cycle();
        av_obj.blow_horn();
        av_obj.apply_brake();
        av_obj.accelerate(5.3f);
        System.out.print("\n\n");
        tutorial_55_atlas_cycle at_obj = new tutorial_55_atlas_cycle();
        at_obj.blow_horn();
        at_obj.apply_brake();
        at_obj.accelerate(7.9f);

    }
}

```

---

---

## **_52.) tutorial_55_2 of Java_**

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_55_2.java "Clike here to see full file") to see full file of tutorial_55_2

```java
/*
Date 23-10-2021

In this Java tutorial, you will learn about difference between Abstract Based classes and Interfaces Based classes
You can create properties in Interfaces
You cannot modify the properties in Interfaces as they are final by-default
*/

public class tutorial_55_2 {
    public static void main(String[] args) {

        tutorial_55_avon_cycle av_obj = new tutorial_55_avon_cycle();
        av_obj.blow_horn_high_volume();
        av_obj.blow_horn_low_volume();
        System.out.print("\n\n");
        tutorial_55_atlas_cycle at_obj = new tutorial_55_atlas_cycle();
        at_obj.blow_horn_high_volume();
        at_obj.blow_horn_low_volume();

    }
}

```

---

---

## **_53.) tutorial_57 of Java_**

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_57.java "Clike here to see full file") to see full file of tutorial_57

```java

/*
Date 23-10-2021

In this Java tutorial, we will see examples of Interfaces and Default methods
Java 8 has introduced the concept of default methods which allow the interfaces to have methods with implementation without affecting the classes that implement the interface. Default methods are also known as defender methods or virtual extension methods. You can define Default methods int interface itself
*/

import java.util.concurrent.ThreadLocalRandom;

interface tutorial_57_camera {
    tutorial_57_smart_phone take_photo();

    tutorial_57_smart_phone record_video();

    private void print_recording() {
        System.out.print("Recording");

    }

    default void record_4k_video() {
        print_recording();
        System.out.print(" 4k video!\n");
    }
}

interface tutorial_57_GPS {
    tutorial_57_smart_phone get_latitude();

    tutorial_57_smart_phone get_longitude();
}

interface tutorial_57_music_player {
    tutorial_57_smart_phone play_song();

    tutorial_57_smart_phone play_next_song();
}

interface tutorial_57_video_game {

    tutorial_57_smart_phone play_game();

    tutorial_57_smart_phone get_score();
}

class tutorial_57_cell_phone {

    void call_person(long phone_number) {
        System.out.println("Calling +91 " + phone_number);
    }

    void pick_call() {
        int phone_number_1 = ThreadLocalRandom.current().nextInt(10000, 99999);
        int phone_number_2 = ThreadLocalRandom.current().nextInt(10000, 99999);
        System.out.printf("Call picked up from +91 %d%d\n", phone_number_1, phone_number_2);
    }
}

class tutorial_57_smart_phone extends tutorial_57_cell_phone
        implements tutorial_57_camera, tutorial_57_GPS, tutorial_57_music_player, tutorial_57_video_game {

    public tutorial_57_smart_phone get_latitude() {
        int latitude_before_decimal = ThreadLocalRandom.current().nextInt(0, 361);
        int latitude_after_decimal = ThreadLocalRandom.current().nextInt(1, 999999);

        System.out.printf("Latitude is %d.%d\n", latitude_before_decimal, latitude_after_decimal);
        return this;
    }

    public tutorial_57_smart_phone get_longitude() {
        int longitude_before_decimal = ThreadLocalRandom.current().nextInt(0, 361);
        int longitude_after_decimal = ThreadLocalRandom.current().nextInt(1, 999999);

        System.out.printf("Longitude is %d.%d\n", longitude_before_decimal, longitude_after_decimal);
        return this;
    }

    public tutorial_57_smart_phone play_game() {
        System.out.printf("Starting Game.....\n");
        return this;
    }

    public tutorial_57_smart_phone get_score() {
        int score = ThreadLocalRandom.current().nextInt(1, 101);
        System.out.printf("Your Score is %d out of 100\n", score);
        return this;
    }

    public tutorial_57_smart_phone play_song() {
        System.out.printf("Playing Song...\n");
        return this;
    }

    public tutorial_57_smart_phone play_next_song() {
        System.out.printf("Playing next Song...\n");
        return this;
    }

    public tutorial_57_smart_phone take_photo() {
        System.out.printf("Photo captured...\n");
        return this;
    }

    public tutorial_57_smart_phone record_video() {
        System.out.printf("Video recording started...\n");
        return this;
    }

    // public void record_4k_video() {
    // System.out.printf("Recording 4k video in Smart Phone!\n");
    // }
}

public class tutorial_57 {
    public static void main(String[] args) {

        tutorial_57_smart_phone iphone_13 = new tutorial_57_smart_phone();
        iphone_13.get_longitude().get_latitude();
        iphone_13.play_game().get_score();
        iphone_13.take_photo().record_video();
        iphone_13.pick_call();
        iphone_13.call_person(7854397458L);
        iphone_13.play_song().play_next_song();
        iphone_13.record_4k_video();

    }
}

```

---

---

## **_54.) tutorial_58 of Java_**

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_58.java "Clike here to see full file") to see full file of tutorial_58

```java
/*
Date 23-10-2021

In this Java tutorial, you will learn about Inheriting Interface in Interface
*/

interface tutorial_58_interface_1 {

    default void print_details_of_methods(int num) {
        System.out.printf("I\'m method %d\n", num);
    }

    tutorial_58_Class method_1();
}

interface tutorial_58_interface_2 extends tutorial_58_interface_1 {
    tutorial_58_Class method_2();

    default void method_3() {
        print_details_of_methods(3);
    }
}

interface tutorial_58_interface_3 extends tutorial_58_interface_2 {

    default void method_4() {
        print_details_of_methods(4);
    }

    tutorial_58_Class method_5();
}

class tutorial_58_Class implements tutorial_58_interface_3 {
    public tutorial_58_Class method_1() {
        print_details_of_methods(1);
        return this;
    }

    public tutorial_58_Class method_2() {
        print_details_of_methods(2);
        return this;
    }

    public tutorial_58_Class method_5() {
        print_details_of_methods(5);
        return this;
    }
}

public class tutorial_58 {
    public static void main(String[] args) {

        tutorial_58_Class obj = new tutorial_58_Class();
        obj.method_1().method_2().method_5();
        obj.method_3();
        obj.method_4();
        // System.out.print("\n");

    }
}

```

---

---

## **_55.) tutorial_59 of Java_**

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_59.java "Clike here to see full file") to see full file of tutorial_59

```java
/*
Date 23-10-2021

In this Java tutorial, you will learn about Polymorphism in Interfaces and where to implement polymorphism.
*/

import java.util.concurrent.ThreadLocalRandom;

interface tutorial_59_camera {
    /*
     * Interface is been copied from tutorial_57's interface with name
     * "tutorial_59_camera"
     */
    tutorial_59_smart_phone take_photo();

    tutorial_59_smart_phone record_video();

    private void print_recording() {
        System.out.print("Recording");

    }

    default void record_4k_video() {
        print_recording();
        System.out.print(" 4k video!\n");
    }
}

interface tutorial_59_GPS {
    /*
     * Interface is been copied from tutorial_57's interface with name
     * "tutorial_59_GPS"
     */
    tutorial_59_smart_phone get_latitude();

    tutorial_59_smart_phone get_longitude();
}

interface tutorial_59_music_player {
    /*
     * Interface is been copied from tutorial_57's interface with name
     * "tutorial_59_music_player"
     */
    tutorial_59_smart_phone play_song();

    tutorial_59_smart_phone play_next_song();
}

interface tutorial_59_video_game {
    /*
     * Interface is been copied from tutorial_57's interface with name
     * "tutorial_59_video_game"
     */

    tutorial_59_smart_phone play_game();

    tutorial_59_smart_phone get_score();
}

class tutorial_59_cell_phone {
    /*
     * Class is been copied from tutorial_57's class with name
     * "tutorial_59_cell_phone"
     */

    void call_person(long phone_number) {
        System.out.println("Calling +91 " + phone_number);
    }

    void pick_call() {
        int phone_number_1 = ThreadLocalRandom.current().nextInt(10000, 99999);
        int phone_number_2 = ThreadLocalRandom.current().nextInt(10000, 99999);
        System.out.printf("Call picked up from +91 %d%d\n", phone_number_1, phone_number_2);
    }
}

class tutorial_59_smart_phone extends tutorial_59_cell_phone
        implements tutorial_59_camera, tutorial_59_GPS, tutorial_59_music_player, tutorial_59_video_game {
    /*
     * Class is been copied from tutorial_57's class with name
     * "tutorial_59_smart_phone"
     */

    public tutorial_59_smart_phone get_latitude() {
        int latitude_before_decimal = ThreadLocalRandom.current().nextInt(0, 361);
        int latitude_after_decimal = ThreadLocalRandom.current().nextInt(1, 999999);

        System.out.printf("Latitude is %d.%d\n", latitude_before_decimal, latitude_after_decimal);
        return this;
    }

    public tutorial_59_smart_phone get_longitude() {
        int longitude_before_decimal = ThreadLocalRandom.current().nextInt(0, 361);
        int longitude_after_decimal = ThreadLocalRandom.current().nextInt(1, 999999);

        System.out.printf("Longitude is %d.%d\n", longitude_before_decimal, longitude_after_decimal);
        return this;
    }

    public tutorial_59_smart_phone play_game() {
        System.out.printf("Starting Game.....\n");
        return this;
    }

    public tutorial_59_smart_phone get_score() {
        int score = ThreadLocalRandom.current().nextInt(1, 101);
        System.out.printf("Your Score is %d out of 100\n", score);
        return this;
    }

    public tutorial_59_smart_phone play_song() {
        System.out.printf("Playing Song...\n");
        return this;
    }

    public tutorial_59_smart_phone play_next_song() {
        System.out.printf("Playing next Song...\n");
        return this;
    }

    public tutorial_59_smart_phone take_photo() {
        System.out.printf("Photo captured...\n");
        return this;
    }

    public tutorial_59_smart_phone record_video() {
        System.out.printf("Video recording started...\n");
        return this;
    }

}

public class tutorial_59 {
    public static void main(String[] args) {
        tutorial_59_camera camera = new tutorial_59_smart_phone();

        /*
         * The below after this comment will give an error because we made reference of
         * camera not of Smart Phone or music player
         */
        // ! camera.play_next_song();
        /*
         * The above before this comment will give an error because we made reference of
         * camera not of Smart Phone or music player
         */

        camera.take_photo().record_video();
        camera.record_4k_video();

    }
}

```

---

---

## **_56.) tutorial_60 of Java_**

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_60.java "Clike here to see full file") to see full file of tutorial_60

```java
/*
Date 23-10-2021

This tutorial covers some very simple practice questions so I did not covered it
*/

public class tutorial_60 {
    public static void main(String[] args) {

        System.out.println("Hello World!");
    }
}

```

---

---

## **_57.) tutorial_64 of Java_**

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_64.java "Clike here to see full file") to see full file of tutorial_64

```java
/*
Date 24-10-2021

In this Java tutorial, you will learn about packages
A Java package organizes Java classes into namespaces, providing a unique namespace for each type it contains. Classes in the same package can access each other's package-private and protected members.
*/

public class tutorial_64 {
    public static void main(String[] args) {

        System.out.println("Hello World!");
    }
}

```

---

---

## **_58.) tutorial_65 of Java_**

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_65.java "Clike here to see full file") to see full file of tutorial_65

```java
/*
Date 24-10-2021

In this Java tutorial, we will more about packages and ho to create them
*/

//* import java.util.*;

public class tutorial_65 {
    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);
        // * Scanner input = new Scanner(System.in);

        System.out.println("Enter a number!");
        int num = input.nextInt();
        System.out.println("Your entered number is " + num);
    }
}

```

---

---

## **_59.) tutorial_66 of Java_**

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_66.java "Clike here to see full file") to see full file of tutorial_66

```java
/*
Date 24-10-2021

In this Java tutorial, you will learn more about Access Modifiers


|    Access Modifier    | Within class | Within Package | Sub-class | Outside Package |
=======================================================================================
|        Public         |      Y       |       Y        |     Y     |        Y        |
|       Protected       |      Y       |       Y        |     Y     |        N        |
| Default (No-Modifier) |      Y       |       Y        |     N     |        N        |
|        Private        |      Y       |       N        |     N     |        N        |

*/

public class tutorial_66 {
    public static void main(String[] args) {

        System.out.println("Hello World!");
    }
}

```

---

---

## **_60.) tutorial_67 of Java_**

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_67.java "Clike here to see full file") to see full file of tutorial_67

```java
/*
Date 24-10-2021

This tutorial covers some very simple practice questions so I did not covered it
*/

public class tutorial_67 {
    public static void main(String[] args) {

        System.out.println("Hello World!");
    }
}

```

---

---

## **_61.) tutorial_68_exercise of Java_**

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_68_exercise.java "Clike here to see full file") to see full file of tutorial_68_exercise

```java
/*
Date 24-10-2021

This tutorial is an exercise in which you need to do the below question
You have to create a package named shapes
This package should have individual classes for Rectangle, Square, Circle, Cylinder, Sphere
These classes should use inheritance to properly manage the code!
Include methods like volume, surface area
*/

import tutorial_68_exercise.shapes.tutorial_68_exercise_circle;
import tutorial_68_exercise.shapes.tutorial_68_exercise_cylinder;
import tutorial_68_exercise.shapes.tutorial_68_exercise_rectangle;
import tutorial_68_exercise.shapes.tutorial_68_exercise_sphere;
import tutorial_68_exercise.shapes.tutorial_68_exercise_square;

public class tutorial_68_exercise {
    public static void main(String[] args) {

        // tutorial_68_exercise_circle circle = new tutorial_68_exercise_circle(8.4d);
        // System.out.println(circle.area_of_circle());
        // System.out.println(circle.circumference_of_circle());

        // tutorial_68_exercise_cylinder cyl = new tutorial_68_exercise_cylinder(8, 7);
        // System.out.println(cyl.area_of_cylinder());
        // System.out.println(cyl.volume_of_cylinder());

        // tutorial_68_exercise_sphere sphere = new tutorial_68_exercise_sphere(8);
        // System.out.println(sphere.area_of_sphere());
        // System.out.println(sphere.volume_of_sphere());

        // tutorial_68_exercise_square square = new tutorial_68_exercise_square(8);
        // System.out.println(square.area_of_square());
        // System.out.println(square.perimeter_of_square());

        tutorial_68_exercise_rectangle rec = new tutorial_68_exercise_rectangle(8, 7);
        System.out.println(rec.area_of_rectangle());
        System.out.println(rec.perimeter_of_rectangle());
    }
}

```

---

---

## **_62.) tutorial_68_exercise_circle of Java_**

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_68_exercise_circle.java "Clike here to see full file") to see full file of tutorial_68_exercise_circle

```java
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
```

---

---

## **_63.) tutorial_68_exercise_cylinder of Java_**

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_68_exercise_cylinder.java "Clike here to see full file") to see full file of tutorial_68_exercise_cylinder

```java
/*
Date 24-10-2021

This code is part of the solution of tutorial_68_exercise.java
*/

package tutorial_68_exercise.shapes;

import java.lang.Math.*;

public class tutorial_68_exercise_cylinder extends tutorial_68_exercise_circle {
    double height = 0;

    public tutorial_68_exercise_cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double area_of_cylinder() {
        return ((2 * Math.PI * radius * height) + (area_of_circle() * 2));
    }

    public double volume_of_cylinder() {
        return (area_of_circle() * height);
    }
}
```

---

---

## **_64.) tutorial_68_exercise_rectangle of Java_**

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_68_exercise_rectangle.java "Clike here to see full file") to see full file of tutorial_68_exercise_rectangle

```java
/*
Date 24-10-2021

This code is part of the solution of tutorial_68_exercise.java
*/

package tutorial_68_exercise.shapes;

import java.lang.Math.*;

public class tutorial_68_exercise_rectangle {
    double length = 0;
    double breadth = 0;

    public tutorial_68_exercise_rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area_of_rectangle() {
        return ((this.length) * (this.breadth) * 1f);
    }

    public double perimeter_of_rectangle() {
        return (2f * ((this.length) + (this.breadth)));
    }
}
```

---

---

## **_65.) tutorial_68_exercise_sphere of Java_**

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_68_exercise_sphere.java "Clike here to see full file") to see full file of tutorial_68_exercise_sphere

```java
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
```

---

---

## **_66.) tutorial_68_exercise_square of Java_**

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_68_exercise_square.java "Clike here to see full file") to see full file of tutorial_68_exercise_square

```java
/*
Date 24-10-2021

This code is part of the solution of tutorial_68_exercise.java
*/

package tutorial_68_exercise.shapes;

import java.lang.Math.*;

import tutorial_68_exercise.shapes.tutorial_68_exercise_rectangle;

public class tutorial_68_exercise_square extends tutorial_68_exercise_rectangle {

    public tutorial_68_exercise_square(double length) {
        super(length, length);
    }

    public double area_of_square() {
        return ((this.length) * (this.breadth) * 1f);
    }

    public double perimeter_of_square() {
        return (2f * ((this.length) + (this.breadth)));
    }
}
```

---

---

## **_67.) tutorial_70 of Java_**

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_70.java "Clike here to see full file") to see full file of tutorial_70

```java
/*
Date 25-10-2021

In this Java tutorial, you will learn about how to implement concept of Multithreading in java using Thread class
Multithreading is a Java feature that allows concurrent execution of two or more parts of a program for maximum utilization of CPU. Each part of such program is called a thread. So, threads are light-weight processes within a process.
*/

class tutorial_70_thread_1 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("I'm in Thread 1 which is build for cooking, it had been executed " + i + " times");
            System.out.println("And now also I'm in Thread 1, it had been executed " + i + " times");
        }
    }
}

class tutorial_70_thread_2 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("I'm in Thread 2 which is build for chatting, it had been executed " + i + " times");
            System.out.println("And now also I'm in Thread 2, it had been executed " + i + " times");
        }
    }

}

public class tutorial_70 {
    public static void main(String[] args) {

        System.out.println("Running started...");

        tutorial_70_thread_1 t1 = new tutorial_70_thread_1();
        tutorial_70_thread_2 t2 = new tutorial_70_thread_2();

        t1.start();
        t2.start();

        System.out.println("Running ended...");
    }
}

```

---

---

## **_68.) tutorial_71 of Java_**

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_71.java "Clike here to see full file") to see full file of tutorial_71

```java
/*
Date 25-10-2021

In this Java tutorial, you will learn how to achieve Multithreading using Runnable interface
*/

class tutorial_71_thread_1 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Bullet 1 fired %d times\n", i);
            System.out.printf("Bullet 1 again fired %d times\n", i);
        }
    }
}

class tutorial_71_thread_2 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Bullet 2 fired %d times\n", i);
            System.out.printf("Bullet 2 again fired %d times\n", i);
        }
    }
}

public class tutorial_71 {
    public static void main(String[] args) {

        System.out.println("Running started...");

        tutorial_71_thread_1 bullet_1 = new tutorial_71_thread_1();
        Thread gun_1 = new Thread(bullet_1);
        gun_1.start();
        tutorial_71_thread_2 bullet_2 = new tutorial_71_thread_2();
        Thread gun_2 = new Thread(bullet_2);
        gun_2.start();

        System.out.println("Running ended...");
    }
}

```

---

---

## **_69.) tutorial_72 of Java_**

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_72.java "Clike here to see full file") to see full file of tutorial_72

```java
/*
Date 25-10-2021

I found multithreading a bit complex topic so I'm not doing it now...
*/

public class tutorial_72 {
    public static void main(String[] args) {

        System.out.println("I found multithreading a bit complex topic so I'm not doing it now...");
    }
}

```

---

---

## **_70.) tutorial_73 of Java_**

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_73.java "Clike here to see full file") to see full file of tutorial_73

```java
/*
Date 25-10-2021

I found multithreading a bit complex topic so I'm not doing it now...
*/

public class tutorial_73 {
    public static void main(String[] args) {

        System.out.println("I found multithreading a bit complex topic so I'm not doing it now...");
    }
}

```

---

---

## **_71.) tutorial_74 of Java_**

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_74.java "Clike here to see full file") to see full file of tutorial_74

```java
/*
Date 25-10-2021

I found multithreading a bit complex topic so I'm not doing it now...
*/

public class tutorial_74 {
    public static void main(String[] args) {

        System.out.println("I found multithreading a bit complex topic so I'm not doing it now...");
    }
}

```

---

---

## **_72.) tutorial_75 of Java_**

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_75.java "Clike here to see full file") to see full file of tutorial_75

```java
/*
Date 25-10-2021

I found multithreading a bit complex topic so I'm not doing it now...
*/

public class tutorial_75 {
    public static void main(String[] args) {

        System.out.println("I found multithreading a bit complex topic so I'm not doing it now...");
    }
}

```

---

---

## **_73.) tutorial_76 of Java_**

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_76.java "Clike here to see full file") to see full file of tutorial_76

```java
/*
Date 25-10-2021

I found multithreading a bit complex topic so I'm not doing it now...
*/

public class tutorial_76 {
    public static void main(String[] args) {

        System.out.println("I found multithreading a bit complex topic so I'm not doing it now...");
    }
}

```

---

---

## **_74.) tutorial_78 of Java_**

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_78.java "Clike here to see full file") to see full file of tutorial_78

```java
/*
Date 25-10-2021

In this Java tutorial, you will learn about Types of Errors in Java
There are three types of error in java which are as follows:

Syntax errors ---> A syntactical error in Java code is one in which the language you use to create your code is incorrect. For example, if you try to create an if statement that doesn't include the condition in parentheses, even when the condition is present on the same line as the if statement, that's a syntax error.

Logical errors ---> Logical Error: A logic error is when your program compiles and executes, but does the wrong thing or returns an incorrect result or no output when it should be returning an output.

Runtime errors(also called Exceptions) ---> Runtime errors/Exceptions occur when a program does not contain any syntax errors but asks the computer to do something that the computer is unable to reliably do. It is the JVM (Java Virtual Machine) which detects it while the program is running.

Note: Error and Exceptions are different words with different meaning
*/

public class tutorial_78 {
    public static void main(String[] args) {

        System.out.println("Hello World!");
    }
}

```

---

---

## **_75.) tutorial_79 of Java_**

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_79.java "Clike here to see full file") to see full file of tutorial_79

```java
/*
Date 25-10-2021

In this Java tutorial, you will learn about Error handling in Java
*/

import java.util.Scanner;

public class tutorial_79 {
    public static void main(String[] args) {

        // * Below given are some Syntax Errors
        // ! int a = 0 // Error: no semicolon!
        // ! b = 8; // Error: b not declared!

        // * Below given is example of Logical Error
        // * Write a program to print all prime numbers between 1 to 10
        for (int i = 1; i < 50;) {
            i = i + i;
            System.out.println(i);
        }

        // * Below given is example of Runtime Error
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a non-integer value to generate a Runtime Error ---> ");
        int val = input.nextInt();
        System.out.println("your entered Integer is ---> " + val);

    }
}

```

---

---

## **_76.) tutorial_80 of Java_**

### [**_Click me_**](https://github.com/AmanRathoreM/Java/blob/main/Java%20Tutorials/Java%20CodeWithHarry%20Tutorials/Tutorials/tutorial_80.java "Clike here to see full file") to see full file of tutorial_80

```java
/*
Date 25-10-2021

In this Java tutorial, you will learn about how to handel Exception using Try Catch

There are 2 types of exceptions in Java which are as follows -
Checked Exception --->  Checked are the exceptions that are checked at compile time. If some code within a method throws a checked exception, then the method must either handle the exception or it must specify the exception using throws keyword.
Un-Checked Exception --->  Unchecked Exception in Java is those Exceptions whose handling is NOT verified during Compile time . These exceptions occurs because of bad programming. The program won't give a compilation error. All Unchecked exceptions are direct subclasses of RuntimeException class.

Some of the commonly occurring Checked exceptions are -
1.) Class Not Found Exception
2.) Invocation Target Exception
3.) Interrupted Exception
4.) No Such Method Exception

Some of the commonly occurring Un-Checked exceptions are -
1.) Null Pointer Exception
2.) Array IndexOut Of Bounds Exception
3.) Arithmetic Exception
4.) Class Cast Exception
5.) Illegal State Exception
6.) Illegal Argument Exception
7.) Number Format Exception

Try catch block ---> Place any code statements that might raise or throw an exception in a try block, and place statements used to handle the exception or exceptions in one or more catch blocks below the try block. Each catch block includes the exception type and can contain additional statements needed to handle that exception type.
*/

public class tutorial_80 {
    public static void main(String[] args) {

        int a = 100, b = 0;
        try {
            int c = a / b;
            System.out.printf("Your answer is %d\n", c);
        } catch (Exception error_value) {
            System.out.println("Unable to divide due to " + error_value);
        }

        // System.out.println("Hello World!");
    }
}

```

---

---
