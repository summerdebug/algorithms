package com.algorithm.array.sort;

import org.junit.Test;

public class MergeSortTest {

    @Test
    public void givenMergeSortWhenSortThenSuccessful() throws Exception {
        // Arrange
        int[] values = SortTestUtil.getRandomIntArray();

        // Act
        int[] result = MergeSort.sort(values);

        // Assert
        SortTestUtil.assertAscending(result);
    }
}
