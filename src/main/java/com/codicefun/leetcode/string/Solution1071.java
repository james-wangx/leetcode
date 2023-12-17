package com.codicefun.leetcode.string;

public class Solution1071 {

    /**
     * 方法一：模仿整数的辗转相除，对字符串进行辗转相除
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public String gcdOfStrings1(String str1, String str2) {
        if (str2.isEmpty()) {
            return str1;
        }

        int len1 = str1.length();
        int len2 = str2.length();
        int quotientOfString = divideOfString(str1, str2);
        int quotientOfLength = len1 / len2;

        if (quotientOfString == quotientOfLength) {
            return gcdOfStrings1(str2, str1.substring(len1 - len1 % len2));
        }

        return "";
    }

    /**
     * 字符串的除法
     */
    public int divideOfString(String str1, String str2) {
        int quotient = 0;
        int len1 = str1.length();
        int len2 = str2.length();

        for (int i = 0; i < len1 && i + len2 <= len1; i += len2) {
            String substring = str1.substring(i, i + len2);
            if (substring.equals(str2)) {
                quotient++;
            }
        }

        return quotient;
    }

    /**
     * 方法二：数学
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    /**
     * 计算最大公约数
     */
    public int gcd(int a, int b) {
        int t;

        while (b != 0) {
            t = a % b;
            a = b;
            b = t;
        }

        return a;
    }

}
