package com.example.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testConcatenate() {
        assertEquals("helloworld", StringUtils.concatenate("hello", "world"));
        assertEquals("hello", StringUtils.concatenate("hello", null));
        assertEquals("world", StringUtils.concatenate(null, "world"));
        assertEquals("", StringUtils.concatenate(null, null));
    }

    @Test
    public void testCalculateLength() {
        assertEquals(5, StringUtils.calculateLength("hello"));
        assertEquals(0, StringUtils.calculateLength(null));
        assertEquals(0, StringUtils.calculateLength(""));
    }

    @Test
    public void testIsEmpty() {
        assertTrue(StringUtils.isEmpty(null));
        assertTrue(StringUtils.isEmpty(""));
        assertTrue(StringUtils.isEmpty("   "));
        assertFalse(StringUtils.isEmpty("hello"));
    }
}