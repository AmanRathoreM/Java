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
