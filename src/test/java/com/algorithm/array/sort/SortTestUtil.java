package com.algorithm.array.sort;

import static org.junit.Assert.assertTrue;

import java.util.Random;

class SortTestUtil {

    private static final int SIZE = 1000;

    static void assertAscending(int[] values) {
        for (int i = 0; i < values.length - 1; i++) {
            assertTrue(values[i + 1] >= values[i]);
        }
    }

    static int[] getRandomIntArray() {
        Random random = new Random();
        int[] values = new int[SIZE];
        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt();
        }
        return values;
    }
}
