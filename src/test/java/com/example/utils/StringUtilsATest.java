package com.example.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsATest {

    @Test
    public void testConcatenate() {
//        assertEquals("helloworld", StringUtils.concatenate("hello", "world"));
//        assertEquals("hello", StringUtils.concatenate("hello", null));
//        assertEquals("world", StringUtils.concatenate(null, "world"));
//        assertEquals("", StringUtils.concatenate(null, null));
        // 测试修改版本
        assertEquals("hello-world", StringUtilsA.concatenate("hello", "world", "-"));
        assertEquals("hello world", StringUtilsA.concatenate("hello", "world", " "));
        assertEquals("helloworld", StringUtilsA.concatenate("hello", "world", null));
        assertEquals("null-null", StringUtilsA.concatenate(null, null, "-"));
    }

    @Test
    public void testCalculateLength() {
//        assertEquals(5, StringUtils.calculateLength("hello"));
//        assertEquals(0, StringUtils.calculateLength(null));
//        assertEquals(0, StringUtils.calculateLength(""));
        // 测试修改版本
        assertEquals(3, StringUtilsA.calculateLength("hello", 3));
        assertEquals(5, StringUtilsA.calculateLength("hello", 10));
        assertEquals(0, StringUtilsA.calculateLength(null, 5));
        assertEquals(0, StringUtilsA.calculateLength("", 5));
    }

    @Test
    public void testIsEmpty() {
//        assertTrue(StringUtils.isEmpty(null));
//        assertTrue(StringUtils.isEmpty(""));
//        assertTrue(StringUtils.isEmpty("   "));
//        assertFalse(StringUtils.isEmpty("hello"));
        // 测试修改版本
        assertTrue(StringUtilsA.isEmpty(null, true));
        assertTrue(StringUtilsA.isEmpty("", false));
        assertFalse(StringUtilsA.isEmpty("   ", false));
        assertTrue(StringUtilsA.isEmpty("   ", true));
        assertFalse(StringUtilsA.isEmpty("hello", true));
    }
}