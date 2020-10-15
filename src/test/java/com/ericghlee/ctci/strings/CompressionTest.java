package com.ericghlee.ctci.strings;

import org.junit.jupiter.api.Test;

import static com.ericghlee.ctci.strings.Compression.repeatedCharactersCompression;
import static org.junit.jupiter.api.Assertions.*;

class CompressionTest {

    @Test
    public void test_repeatedCharactersCompression() {
        assertEquals("a3b3", repeatedCharactersCompression("aaabbb"));
        assertEquals("a5b3", repeatedCharactersCompression("aaaaabbb"));
        assertEquals("a5", repeatedCharactersCompression("aaaaa"));
        assertEquals("aa", repeatedCharactersCompression("aa"));
        assertEquals("a", repeatedCharactersCompression("a"));
        assertEquals("aabbc", repeatedCharactersCompression("aabbc"));
        assertEquals("", repeatedCharactersCompression(""));
    }
}