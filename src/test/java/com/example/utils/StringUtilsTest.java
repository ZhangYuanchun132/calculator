package com.example.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testConcatenate() {
//        assertEquals("helloworld", StringUtils.concatenate("hello", "world"));
//        assertEquals("hello", StringUtils.concatenate("hello", null));
//        assertEquals("world", StringUtils.concatenate(null, "world"));
//        assertEquals("", StringUtils.concatenate(null, null));
        // 测试修改版本
        assertEquals("hello-world", StringUtils.concatenate("hello", "world", "-"));
        assertEquals("hello world", StringUtils.concatenate("hello", "world", " "));
        assertEquals("helloworld", StringUtils.concatenate("hello", "world", null));
        assertEquals("null-null", StringUtils.concatenate(null, null, "-"));
    }

    @Test
    public void testCalculateLength() {
//        assertEquals(5, StringUtils.calculateLength("hello"));
//        assertEquals(0, StringUtils.calculateLength(null));
//        assertEquals(0, StringUtils.calculateLength(""));
        // 测试修改版本
        assertEquals(3, StringUtils.calculateLength("hello", 3));
        assertEquals(5, StringUtils.calculateLength("hello", 10));
        assertEquals(0, StringUtils.calculateLength(null, 5));
        assertEquals(0, StringUtils.calculateLength("", 5));
    }

    @Test
    public void testIsEmpty() {
//        assertTrue(StringUtils.isEmpty(null));
//        assertTrue(StringUtils.isEmpty(""));
//        assertTrue(StringUtils.isEmpty("   "));
//        assertFalse(StringUtils.isEmpty("hello"));
        // 测试修改版本
        assertTrue(StringUtils.isEmpty(null, true));
        assertTrue(StringUtils.isEmpty("", false));
        assertFalse(StringUtils.isEmpty("   ", false));
        assertTrue(StringUtils.isEmpty("   ", true));
        assertFalse(StringUtils.isEmpty("hello", true));
    }
}