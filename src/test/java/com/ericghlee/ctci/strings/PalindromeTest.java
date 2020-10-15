package com.ericghlee.ctci.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {


    @Test
    void test_IsPermutation() {
        assertTrue(Palindrome.isPermutation("abdef", "fedba"));
        assertTrue(Palindrome.isPermutation("aaaaaa", "aaaaaa"));
        assertTrue(Palindrome.isPermutation("aaaaabaaaaa", "aaaaabaaaaa"));
        assertTrue(Palindrome.isPermutation("", ""));
        assertFalse(Palindrome.isPermutation("abd", "edba"));
        assertFalse(Palindrome.isPermutation("aaaaabaaaaa", "aaaaacaaaaa"));
        assertFalse(Palindrome.isPermutation("", "aaaaaaaaa"));
    }

    @Test
    void test_isPalindromePermutation() {
        assertTrue(Palindrome.isPalindromePermutation("aaaabbbb"));
        assertTrue(Palindrome.isPalindromePermutation("aaaaaa"));
        assertTrue(Palindrome.isPalindromePermutation("baaaaaaaaaa"));
        assertTrue(Palindrome.isPalindromePermutation(""));
        assertFalse(Palindrome.isPalindromePermutation("abd"));
        assertFalse(Palindrome.isPalindromePermutation("aaaabc"));
    }
}