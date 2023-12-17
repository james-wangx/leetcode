package com.codicefun.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution1071Test {

    private final Solution1071 solution = new Solution1071();

    @Test
    public void test() {
        assertEquals("ABC", solution.gcdOfStrings1("ABCABC", "ABC"));
        assertEquals("AB", solution.gcdOfStrings1("ABABAB", "ABAB"));
        assertEquals("", solution.gcdOfStrings1("LEET", "CODE"));
    }

}
