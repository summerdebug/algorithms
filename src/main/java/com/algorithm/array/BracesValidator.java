package com.algorithm.array;

public class BracesValidator {

    /**
     * Input string should contain only ( and ) symbols.
     */
    public static boolean isBracesOrderCorrect(String str) {
        char[] chars = str.toCharArray();
        int counter = 0;
        for (char c : chars) {
            if (c == '(') {
                counter++;
            } else if (c == ')') {
                counter--;
                if (counter < 0) {
                    return false;
                }
            } else {
                throw new IllegalArgumentException("Input strings should contain only ( and ) characters");
            }
        }
        return counter == 0;
    }
}
