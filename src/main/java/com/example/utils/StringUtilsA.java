package com.example.utils;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class StringUtilsA {

    // 原始版本：简单的字符串连接
    public static String concatenate(String str1, String str2) {
        if (str1 == null) {
            str1 = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return str1 + str2;
    }

    // 原始版本：计算字符串长度
    public static int calculateLength(String str) {
        if (str == null) {
            return 0;
        }
        return str.length();
    }

    // 原始版本：检查字符串是否为空
    public static boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
}