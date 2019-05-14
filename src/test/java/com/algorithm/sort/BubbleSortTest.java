package com.algorithm.sort;

import static org.junit.Assert.assertTrue;

import java.util.Random;
import org.junit.Test;

public class BubbleSortTest {

    private static final int SIZE = 1000;

    @Test
    public void givenBubbleSortWhenSortThenSuccessful() throws Exception {
        // Arrange
        Random random = new Random();
        int[] values = new int[SIZE];
        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt();
        }

        // Act
        BubbleSort.sort(values);

        // Assert
        for (int i = 0; i < values.length - 1; i++) {
            assertTrue(values[i + 1] >= values[i]);
        }
    }
}
