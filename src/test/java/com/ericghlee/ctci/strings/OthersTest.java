package com.ericghlee.ctci.strings;

import org.junit.jupiter.api.Test;

import static com.ericghlee.ctci.strings.Others.isOneEditAway;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OthersTest {

    @Test
    public void test_isOneEditAway() {
        assertTrue(isOneEditAway("123456", "123456"));
        assertTrue(isOneEditAway("124456", "124456"));
        assertTrue(isOneEditAway("12456", "123456"));
        assertTrue(isOneEditAway("123456", "12456"));
        assertTrue(isOneEditAway("", "1"));
        assertTrue(isOneEditAway("1", ""));
        assertTrue(isOneEditAway("", ""));
        assertFalse(isOneEditAway("123", "1"));
        assertFalse(isOneEditAway("1", "123"));
    }
}