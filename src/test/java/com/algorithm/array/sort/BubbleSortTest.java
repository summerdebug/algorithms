package com.algorithm.array.sort;

import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void givenBubbleSortWhenSortThenSuccessful() throws Exception {
        // Arrange
        int[] values = SortTestUtil.getRandomIntArray();

        // Act
        BubbleSort.sort(values);

        // Assert
        SortTestUtil.assertAscending(values);
    }
}
