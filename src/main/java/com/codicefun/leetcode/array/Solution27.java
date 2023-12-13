package com.codicefun.leetcode.array;

@SuppressWarnings("unused")
public class Solution27 {

    /**
     * 方法一：双指针
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public int removeElement1(int[] nums, int val) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != val) {
                nums[left++] = nums[right];
            }
        }

        return left;
    }

    /**
     * 方法二（最优）：优化双指针
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            if (nums[left] == val) {
                nums[left] = nums[--right];
            } else {
                left++;
            }
        }

        return left;
    }

}
