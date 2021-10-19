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
