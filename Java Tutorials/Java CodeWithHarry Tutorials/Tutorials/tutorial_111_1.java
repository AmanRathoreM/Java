/*
Date 04-11-2021

In this advance Java tutorial, you will learn about File IO
*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class tutorial_111_1 {
    public static void main(String[] args) throws IOException {
        String location = "tutorial_111_1_sample_txt_file_1.txt";
        File a_file_to_create = new File(location);
        a_file_to_create.createNewFile();
        System.out.println(a_file_to_create.canWrite());
        // * a_file_to_create.delete();

        FileWriter a_file_to_write = new FileWriter(location);
        for (int i = 1; i <= 1000; i++) {
            a_file_to_write.write("Hi is been written " + i + " Times!\n");
        }
        a_file_to_write.close();

    }
}
