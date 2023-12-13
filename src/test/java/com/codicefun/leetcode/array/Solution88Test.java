package com.codicefun.leetcode.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution88Test {

    private final Solution88 solution = new Solution88();

    @Test
    public void test() {
        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{};
        solution.merge(nums1, 1, nums2, 0);
        Assertions.assertArrayEquals(nums1, new int[]{1});

        nums1 = new int[]{0};
        nums2 = new int[]{1};
        solution.merge(nums1, 0, nums2, 1);
        Assertions.assertArrayEquals(nums1, new int[]{1});

        nums1 = new int[]{1, 2, 3, 0, 0, 0};
        nums2 = new int[]{2, 5, 6};
        solution.merge(nums1, 3, nums2, 3);
        Assertions.assertArrayEquals(nums1, new int[]{1, 2, 2, 3, 5, 6});
    }

}
