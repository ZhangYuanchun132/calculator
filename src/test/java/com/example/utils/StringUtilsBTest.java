package com.example.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsBTest {

    @Test
    public void testConcatenate() {
        assertEquals("helloworld", StringUtilsB.concatenate("hello", "world"));
        assertEquals("hello", StringUtilsB.concatenate("hello", null));
        assertEquals("world", StringUtilsB.concatenate(null, "world"));
        assertEquals("", StringUtilsB.concatenate(null, null));
    }

    @Test
    public void testCalculateLength() {
        assertEquals(5, StringUtilsB.calculateLength("hello"));
        assertEquals(0, StringUtilsB.calculateLength(null));
        assertEquals(0, StringUtilsB.calculateLength(""));
    }

    @Test
    public void testIsEmpty() {
        assertTrue(StringUtilsB.isEmpty(null));
        assertTrue(StringUtilsB.isEmpty(""));
        assertTrue(StringUtilsB.isEmpty("   "));
        assertFalse(StringUtilsB.isEmpty("hello"));
    }
}