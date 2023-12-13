package com.codicefun.leetcode.string;

public class Solution1768 {

    /**
     * 方法一：双指针
     * 时间复杂度：O(m+n)
     * 空间复杂度：O(m+n)
     */
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int p1 = 0, p2 = 0;
        StringBuilder ans = new StringBuilder();

        while (p1 < m || p2 < n) {
            if (p1 < m) {
                ans.append(word1.charAt(p1++));
            }
            if (p2 < n) {
                ans.append(word2.charAt(p2++));
            }
        }

        return ans.toString();
    }

}
