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
