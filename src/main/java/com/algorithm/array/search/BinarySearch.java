package com.algorithm.array.search;

public class BinarySearch {

    public static int search(int[] values, int value) {
        return search(values, value, 0, values.length - 1);
    }

    private static int search(int[] values, int value, int beginIndex, int endIndex) {
        if (beginIndex > endIndex) {
            return -1;
        }
        if (beginIndex == endIndex) {
            if (values[beginIndex] == value) {
                return beginIndex;
            }
            return -1;
        }

        int count = endIndex - beginIndex + 1;
        int half = count / 2;
        int middle = beginIndex + half;

        if (value == values[middle]) {
            return middle;
        } else if (value > values[middle]) {
            return search(values, value, middle + 1, endIndex);
        } else {
            return search(values, value, beginIndex, middle - 1);
        }
    }
}
