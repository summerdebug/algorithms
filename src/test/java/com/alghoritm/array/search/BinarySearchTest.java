package com.alghoritm.array.search;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BinarySearchTest {

    private static final List<Integer> VALUE_LIST = Collections.unmodifiableList(Arrays.asList(1, 3, 5, 10, 20, 30));

    private final int value;
    private final int expectedResult;

    public BinarySearchTest(int value, int expectedResult) {
        this.value = value;
        this.expectedResult = expectedResult;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 0},
                {3, 1},
                {5, 2},
                {10, 3},
                {20, 4},
                {30, 5},
                {0, -1},
                {4, -1},
                {31, -1},
                {0, -1},
                {-1, -1},
                {Integer.MIN_VALUE, -1},
                {Integer.MAX_VALUE, -1}
        });
    }

    @Test
    public void givenBinarySearchWhenSearchValueThenExpectedResult() throws Exception {
        // Arrange
        int[] values = VALUE_LIST.stream().mapToInt(i -> i).toArray();

        // Act
        int result = BinarySearch.search(values, value);

        // Assert
        assertEquals(expectedResult, result);
    }
}
