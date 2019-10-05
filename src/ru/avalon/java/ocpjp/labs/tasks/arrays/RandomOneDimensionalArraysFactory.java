/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.arrays;

import java.util.Arrays;
import java.util.Random;
import ru.avalon.java.ocpjp.labs.common.Factory;

/**
 *
 * @author miair
 */
public class RandomOneDimensionalArraysFactory implements Factory<int[]> {

    private final Random random;

    RandomOneDimensionalArraysFactory() {
        this.random = new Random();
    }

    @Override
    public int[] create() {
        int[] array = new int[random.nextInt(10) + 10];
        for (int i = 0; i < array.length; i++) {
             array[i] = random.nextInt(100);
        }
        return array;
    }

}
