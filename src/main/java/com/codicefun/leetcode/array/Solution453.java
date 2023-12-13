package com.codicefun.leetcode.array;

public class Solution453 {

    public int minMoves(int[] nums) {
        long sum = 0;
        long min = nums[0];

        for (int num: nums) {
            sum += num;
            min = Math.min(min, num);
        }

        return (int) (sum - min * nums.length);
    }

}
