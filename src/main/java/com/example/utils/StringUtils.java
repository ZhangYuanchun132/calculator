package com.example.utils;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class StringUtils {

    // 修改版本：添加分隔符的字符串连接
    public static String concatenate(String str1, String str2, String delimiter) {
        if (delimiter == null) {
            delimiter = "";
        }
        return (str1 == null ? "null" : str1) + delimiter + (str2 == null ? "null" : str2);
    }

    // 修改版本：添加最大长度限制
    public static int calculateLength(String str, int maxLength) {
        if (str == null) {
            return 0;
        }
        int length = str.length();
        return length > maxLength ? maxLength : length;
    }

    // 修改版本：添加trim选项
    public static boolean isEmpty(String str, boolean trim) {
        if (str == null) {
            return true;
        }
        return trim ? str.trim().isEmpty() : str.isEmpty();
    }
}