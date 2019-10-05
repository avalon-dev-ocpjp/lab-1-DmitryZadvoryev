package ru.avalon.java.ocpjp.labs.tasks.arrays;

import java.util.Arrays;

public class TwoDimensionalArraysSort implements Sort<int[][]>{

    @Override
    public void run(int[][] dataSet) {
        int[]oneDimArray = createOneDimensionalArray(dataSet);
        Arrays.sort(oneDimArray);
        initializeTwoDimArray(dataSet,oneDimArray);
    }
    
    private int[] createOneDimensionalArray(int[][] twoDimArray){
        int[]array = new int[twoDimArray.length * twoDimArray[0].length];
        int n = 0;
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                array[n++] = twoDimArray[i][j];
        
            }
            
        }
        return array;
    }
    
    private void initializeTwoDimArray(int[][]array, int[] oneDimArray){
        int n = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = oneDimArray[n++];
            }
        }
    }
    
    
}
