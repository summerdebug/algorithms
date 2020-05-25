package com.algorithm.array;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BracesValidatorTest {

    @Test
    public void whenOrderCorrectThenTrue() throws Exception {
        // Arrange
        String str = "()()(()()(()))";

        // Act
        boolean result = BracesValidator.isBracesOrderCorrect(str);

        // Assert
        assertTrue(result);
    }

    @Test
    public void whenOrderInCorrectThenFalse() throws Exception {
        // Arrange
        String str = "())()(()()(()))";

        // Act
        boolean result = BracesValidator.isBracesOrderCorrect(str);

        // Assert
        assertFalse(result);
    }
}
