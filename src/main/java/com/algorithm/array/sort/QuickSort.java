package com.algorithm.array.sort;

import java.util.Random;

class QuickSort {

    static void sort(int[] values) {
        sort(values, 0, values.length - 1);
    }

    private static void sort(int[] values, int start, int end) {
        if (start >= end) {
            return;
        }
        int middle = getMiddle(start, end);
        int i = start;
        int j = end;
        while (true) {
            while (values[i] <= values[middle] && i < middle) {
                i++;
            }
            while (values[j] >= values[middle] && j > middle) {
                j--;
            }
            if (i == j) {
                break;
            }
            swap(values, i, j);
            if (i == middle) {
                middle = j;
            } else if (j == middle) {
                middle = i;
            }
        }
        sort(values, start, middle - 1);
        sort(values, middle + 1, end);
    }

    private static void swap(int[] values, int i, int j) {
        int temp = values[i];
        values[i] = values[j];
        values[j] = temp;
    }

    private static int getMiddle(int start, int end) {
        int count = end - start + 1;
        Random random = new Random();
        int offset = random.nextInt(count);
        return start + offset;
    }
}
