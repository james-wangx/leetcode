package com.codicefun.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Solution605Test {

    private final Solution605 solution = new Solution605();

    @Test
    public void test() {
        assertTrue(solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
        assertFalse(solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
        assertFalse(solution.canPlaceFlowers(new int[]{1}, 1));
        assertTrue(solution.canPlaceFlowers(new int[]{0}, 1));
        assertTrue(solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 0, 0}, 3));
        assertFalse(solution.canPlaceFlowers(new int[]{0, 0, 0, 0, 0, 1}, 3));
        assertFalse(solution.canPlaceFlowers(new int[]{0, 0, 0, 1, 0, 0}, 3));
        assertTrue(solution.canPlaceFlowers(new int[]{0, 0, 1, 0, 1}, 1));
        assertTrue(solution.canPlaceFlowers(new int[]{0, 0, 1, 0, 0}, 2));

    }

}
