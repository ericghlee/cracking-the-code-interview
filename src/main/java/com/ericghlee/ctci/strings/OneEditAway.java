package com.ericghlee.ctci.strings;

public class OneEditAway {

    // CTCI - Exercise 1.5
    public static boolean isOneEditAway(String str, String other) {
        if (str.equals(other)) {
            return true;
        }

        if (str.length() == other.length()) {
            return isOneReplaceAway(str, other);
        } else {
            if (str.length() - 1 == other.length()) {
                return isOneInsertAway(other, str);
            } else if (str.length() + 1 == other.length()){
                return isOneInsertAway(str, other);
            }
        }

        return false;
    }

    private static boolean isOneReplaceAway(String str, String other) {
        boolean diffChar = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != other.charAt(i)) {
                if (diffChar) {
                    return false;
                }

                diffChar = true;
            }
        }

        return true;
    }

    private static boolean isOneInsertAway(String str, String other) {
        boolean diffChar = false;
        int firstIndex = 0;
        int secondIndex = 0;

        while (firstIndex < str.length() && secondIndex < other.length()) {
            if (str.charAt(firstIndex) != other.charAt(secondIndex)) {
                if (diffChar) {
                    return false;
                }

                firstIndex -= 1;
                diffChar = true;
            }

            firstIndex++;
            secondIndex++;
        }

        return true;
    }
}
