package com.algorithm.fibonacci;

class FibonacciCycleGenerator {

    static int get(int index) {
        if (index == 0) {
            return 0;
        }
        if (index == 1) {
            return 1;
        }
        int fibonacciMinus2 = 0;
        int fibonacciMinus1 = 1;
        int fibonacciCurrent = 1;

        for (int i = 2; i <= index; i++) {
            fibonacciCurrent = fibonacciMinus2 + fibonacciMinus1;
            fibonacciMinus2 = fibonacciMinus1;
            fibonacciMinus1 = fibonacciCurrent;
        }

        return fibonacciCurrent;
    }
}
