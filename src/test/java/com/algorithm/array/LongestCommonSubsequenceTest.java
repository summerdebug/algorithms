package com.algorithm.array;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestCommonSubsequenceTest {

  @Test
  public void lcsTest() {
    int[] a = {1, 3, 4, 8, 2, 3, 7, 8};
    int[] b = {0, 0, 4, 9, 8, 9, 2, 3, 8};
    // Longest common subsequence is {4, 8, 2, 3, 8} with length of 5.

    int length = LongestCommonSubsequence.calculateLength(a, b);

    assertEquals(5, length);
  }

}