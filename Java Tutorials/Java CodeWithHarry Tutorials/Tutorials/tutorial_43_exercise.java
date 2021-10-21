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
