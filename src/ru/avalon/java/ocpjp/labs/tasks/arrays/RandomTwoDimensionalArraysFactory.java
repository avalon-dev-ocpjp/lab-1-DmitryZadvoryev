package ru.avalon.java.ocpjp.labs.tasks.arrays;

import java.util.Random;
import ru.avalon.java.ocpjp.labs.common.Factory;

public class RandomTwoDimensionalArraysFactory implements Factory<int[][]> {

    private final Random random;

    public RandomTwoDimensionalArraysFactory() {
        this.random = new Random();
    }

    @Override
    public int[][] create() {
        int[][] array = new int[random.nextInt(10) + 10][random.nextInt(10) + 10];
        for (int i = 0; i < array.length; i++) {
             for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
                
            }
        }
        return array;
    }

}
