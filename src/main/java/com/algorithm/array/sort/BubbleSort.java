package com.algorithm.array.sort;

class BubbleSort {

    static void sort(int[] values) {
        for (int i = 0; i < values.length - 1; i++) {
            for (int j = values.length - 1; j > i; j--) {
                if (values[j] < values[i]) {
                    swap(values, i, j);
                }
            }
        }
    }

    private static void swap(int[] values, int i, int j) {
        int temp = values[i];
        values[i] = values[j];
        values[j] = temp;
    }
}
