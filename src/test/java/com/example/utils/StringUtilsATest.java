package com.example.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsATest {

    @Test
    public void testConcatenate() {
        assertEquals("helloworld", StringUtilsA.concatenate("hello", "world"));
        assertEquals("hello", StringUtilsA.concatenate("hello", null));
        assertEquals("world", StringUtilsA.concatenate(null, "world"));
        assertEquals("", StringUtilsA.concatenate(null, null));
    }

    @Test
    public void testCalculateLength() {
        assertEquals(5, StringUtilsA.calculateLength("hello"));
        assertEquals(0, StringUtilsA.calculateLength(null));
        assertEquals(0, StringUtilsA.calculateLength(""));
    }

    @Test
    public void testIsEmpty() {
        assertTrue(StringUtilsA.isEmpty(null));
        assertTrue(StringUtilsA.isEmpty(""));
        assertTrue(StringUtilsA.isEmpty("   "));
        assertFalse(StringUtilsA.isEmpty("hello"));
    }
}