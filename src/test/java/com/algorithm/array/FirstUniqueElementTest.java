package com.algorithm.array;

import static com.algorithm.array.FirstUniqueElement.findFirstUniqueElementIndexLinearComplexity;
import static com.algorithm.array.FirstUniqueElement.findFirstUniqueElementIndexQuadComplexity;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FirstUniqueElementTest {

  @Test
  public void testQuadAlgorithm() {
    int[] arr = {1, 2, 1, 2, 3, 4, 6}; // First unique element is 3 with index of 4.

    int firstUniqueElementIndex = findFirstUniqueElementIndexQuadComplexity(arr);

    assertEquals(4, firstUniqueElementIndex);
  }

  @Test
  public void testLinearAlgorithm() {
    int[] arr = {1, 2, 1, 2, 3, 4, 6}; // First unique element is 3 with index of 4.

    int firstUniqueElementIndex = findFirstUniqueElementIndexLinearComplexity(arr);

    assertEquals(4, firstUniqueElementIndex);
  }

}