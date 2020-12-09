package com.ericghlee.ctci.strings;

public class Compression {

    // CTCI - Exercise 1.6
    public static String repeatedCharactersCompression(String str) {
        StringBuilder sb = new StringBuilder();
        int charCounter = 0;

        for (int i = 0; i < str.length(); i++) {
            charCounter++;

            // caso esteja no fim ou o proximo char for diferente do atual
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                sb.append(str.charAt(i));
                sb.append(charCounter);
                charCounter = 0;
            }
        }

        return sb.length() < str.length() ? sb.toString() : str;
    }
}
