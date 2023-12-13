package com.codicefun.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution453Test {

    @Test
    public void test() {
        Solution453 solution = new Solution453();

        assertEquals(solution.minMoves(new int[]{3, 2, 1}), 3);
        assertEquals(solution.minMoves(new int[]{1, 1, 1}), 0);
        assertEquals(solution.minMoves(new int[]{1, 1000000000}), 999999999);
        assertEquals(solution.minMoves(new int[]{0}), 0);
        assertEquals(solution.minMoves(new int[]{1, 2, 3, 4, 5, 6, 7}), 21);
    }

}
