package com.codicefun.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution1768Test {

    private final Solution1768 solution = new Solution1768();

    @Test
    public void test() {
        String word1 = "abc";
        String word2 = "pqr";
        assertEquals("apbqcr", solution.mergeAlternately(word1, word2));

        word1 = "ab";
        word2 = "pqrs";
        assertEquals("apbqrs", solution.mergeAlternately(word1, word2));

        word1 = "abcd";
        word2 = "pq";
        assertEquals("apbqcd", solution.mergeAlternately(word1, word2));
    }

}
