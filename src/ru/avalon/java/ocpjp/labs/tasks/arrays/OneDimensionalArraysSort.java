package ru.avalon.java.ocpjp.labs.tasks.arrays;

import java.util.Arrays;

public class OneDimensionalArraysSort implements Sort<int[]>{ 

    @Override
    public void run(int[] array) {
        Arrays.sort(array);
    }
    
}
