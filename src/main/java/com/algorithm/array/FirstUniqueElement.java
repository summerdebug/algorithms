package com.algorithm.array;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueElement {

  public static int findFirstUniqueElementIndexQuadComplexity(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      boolean repeat = false;
      for (int j = 0; j < arr.length; j++) {
        if (i != j && arr[i] == arr[j]) {
          repeat = true;
          break;
        }
      }
      if (!repeat) {
        return i;
      }
    }
    return -1;
  }

  public static int findFirstUniqueElementIndexLinearComplexity(int[] arr) {
    Map<Integer, Integer> counts = new HashMap<>();
    for (int element : arr) {
      Integer count = counts.get(element);
      if (count == null) {
        count = 1;
      } else {
        count++;
      }
      counts.put(element, count);
    }

    for (int i = 0; i < arr.length; i++) {
      if (counts.get(arr[i]) == 1) {
        return i;
      }
    }

    return -1;
  }

}
