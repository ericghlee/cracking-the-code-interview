package com.ericghlee.ctci.strings;

public class Palindrome {

    // CTCI - Exercise 1.2
    public static boolean isPermutation(String str, String other) {
        if (str.length() != other.length()) {
            return false;
        }

        int[] charSet = new int[128];

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            charSet[val]++;
        }

        for (int i = 0; i < other.length(); i++) {
            int val = other.charAt(i);
            charSet[val]--;

            if (charSet[val] < 0) {
                return false;
            }
        }

        return true;
    }

    // CTCI - Exercise 1.4
    public static boolean isPalindromePermutation(String str) {
        int oddsCount = 0;

        boolean[] charSet = new boolean[128]; // assuming ASCII

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);

            if (charSet[val]) {
                charSet[val] = false;
                oddsCount--;
            } else {
                charSet[val] = true;
                oddsCount++;
            }
        }

        return oddsCount < 2;
    }
}
