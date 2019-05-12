package com.algorithm.fibonacci;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class FibonacciCycleGeneratorTest {

    private final int index;
    private final int fibonacciNumber;

    public FibonacciCycleGeneratorTest(int index, int fibonacciNumber) {
        this.index = index;
        this.fibonacciNumber = fibonacciNumber;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, 0},
                {1, 1},
                {2, 1},
                {3, 2},
                {4, 3},
                {5, 5},
                {6, 8},
                {12, 144},
                {20, 6765}
        });
    }

    @Test
    public void givenFibonacciCycleGeneratorWhenGetThenSuccessful() throws Exception {
        // Act
        int result = FibonacciCycleGenerator.get(index);

        // Assert
        assertEquals(fibonacciNumber, result);
    }
}
