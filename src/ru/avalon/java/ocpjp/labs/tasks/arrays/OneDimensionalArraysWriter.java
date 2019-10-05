package ru.avalon.java.ocpjp.labs.tasks.arrays;

import java.io.IOException;
import ru.avalon.java.ocpjp.labs.common.ObjectWriter;

public class OneDimensionalArraysWriter implements ObjectWriter<int[]> {

    @Override
    public void write(int[] array) throws IOException {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    @Override
    public void close() throws IOException {
    }

}
