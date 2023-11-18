package com.algorithm.array;

public class LongestCommonSubsequence {

  public static int calculateLength(int[] a, int[] b) {
    int[][] lcs = new int[a.length + 1][b.length + 1];

    for (int i = 1; i <= a.length; i++) {
      for (int j = 1; j <= b.length; j++) {
        if (a[i - 1] == b[j - 1]) {
          lcs[i][j] = lcs[i - 1][j - 1] + 1;
        } else {
          lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j - 1]);
        }
      }
    }

    return lcs[a.length][b.length];
  }

}
