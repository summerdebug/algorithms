package com.algorithm.array.sort;

import java.util.Arrays;

class MergeSort {

    static int[] sort(int[] values) {
        if (values.length <= 1) {
            return values;
        }

        int middle = values.length / 2;
        int[] left = Arrays.copyOfRange(values, 0, middle);
        int[] right = Arrays.copyOfRange(values, middle, values.length);
        int[] leftSorted = sort(left);
        int[] rightSorted = sort(right);
        return merge(leftSorted, rightSorted);
    }

    private static int[] merge(int[] leftSorted, int[] rightSorted) {
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;
        int[] result = new int[leftSorted.length + rightSorted.length];
        while (leftIndex < leftSorted.length && rightIndex < rightSorted.length) {
            if (leftSorted[leftIndex] <= rightSorted[rightIndex]) {
                result[resultIndex++] = leftSorted[leftIndex++];
            } else {
                result[resultIndex++] = rightSorted[rightIndex++];
            }
        }
        if (leftIndex < leftSorted.length) {
            System.arraycopy(leftSorted, leftIndex, result, resultIndex, leftSorted.length - leftIndex);
        }
        if (rightIndex < rightSorted.length) {
            System.arraycopy(rightSorted, rightIndex, result, resultIndex, rightSorted.length - rightIndex);
        }
        return result;
    }
}
