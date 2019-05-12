package com.algorithm.fibonacci;

public class FibonacciRecursiveGenerator {

    public static int get(int index) {

        if (index == 0) {
            return 0;
        }
        if (index == 1) {
            return 1;
        }
        return get(index - 1) + get(index - 2);
    }

}
