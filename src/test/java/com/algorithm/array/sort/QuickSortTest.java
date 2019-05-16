package com.algorithm.array.sort;

import org.junit.Test;

public class QuickSortTest {

    @Test
    public void givenQuickSortWhenSortThenSuccessful() throws Exception {
        // Arrange
        int[] values = SortTestUtil.getRandomIntArray();

        // Act
        QuickSort.sort(values);

        // Assert
        SortTestUtil.assertAscending(values);
    }
}
