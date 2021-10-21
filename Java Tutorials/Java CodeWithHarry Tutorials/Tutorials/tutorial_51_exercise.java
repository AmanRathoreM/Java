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
