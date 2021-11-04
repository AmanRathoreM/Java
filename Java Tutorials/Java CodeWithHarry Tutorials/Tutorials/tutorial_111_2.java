/*
Date 04-11-2021

In this advance Java tutorial, you will learn about File IO
*/

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class tutorial_111_2 {
    public static void main(String[] args) throws IOException {
        String location = "tutorial_111_2_sample_txt_file_2.txt";
        /*
         * File a_file_to_create = new File(location); a_file_to_create.createNewFile();
         * System.out.println(a_file_to_create.canWrite()); a_file_to_create.delete();
         * 
         * FileWriter a_file_to_write = new FileWriter(location);
         * a_file_to_write.write("Hi my name is Aman!\n");
         * a_file_to_write.write("I study in class 10\n");
         * a_file_to_write.write("Currently I\'m learning Java\n");
         * a_file_to_write.close();
         */

        File a_file_to_read = new File(location);
        Scanner file_content = new Scanner(a_file_to_read);
        while (file_content.hasNextLine()) {

            System.out.println(file_content.nextLine());
        }

    }
}
