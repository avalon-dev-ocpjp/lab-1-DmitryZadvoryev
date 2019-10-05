package ru.avalon.java.ocpjp.labs.tasks.arrays;

import java.io.IOException;
import ru.avalon.java.ocpjp.labs.common.ObjectWriter;

public class TwoDimensionalArraysWriter implements ObjectWriter<int[][]>{

    @Override
    public void write(int[][] array) throws IOException {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
            
        }
    }

    @Override
    public void close() throws IOException {
    }
    
    
}
