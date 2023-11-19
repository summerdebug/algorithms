package com.algorithm.array;

import java.util.Arrays;

public class Combinations {

  public static void print(int n) {
    print(new boolean[n], 0);
  }

  // Iterate all combinations in boolean array.
  private static void print(boolean[] arr, int index) {
    if (index == arr.length) {
      System.out.println(Arrays.toString(arr));
      return;
    }
    arr[index] = false;
    print(arr, index + 1);
    arr[index] = true;
    print(arr, index + 1);
  }

}
