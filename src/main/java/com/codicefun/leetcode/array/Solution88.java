package com.codicefun.leetcode.array;

import java.util.Arrays;

@SuppressWarnings("unused")
public class Solution88 {

    /**
     * 方法一：直接合并，然后排序
     * 时间复杂度：O((m+n)log(m+n))
     * 空间复杂度：O(log(m+n))
     */
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }

    /**
     * 方法二：双指针
     * 时间复杂度：O(m+n)
     * 空间复杂度：O(m+n)
     */
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m + n];
        int p1 = 0, p2 = 0;
        int cur;

        while (p1 < m || p2 < n) {
            if (p1 == m) {
                cur = nums2[p2++];
            } else if (p2 == n) {
                cur = nums1[p1++];
            } else if (nums1[p1] > nums2[p2]) {
                cur = nums2[p2++];
            } else {
                cur = nums1[p1++];
            }
            ans[p1 + p2 - 1] = cur;
        }

        System.arraycopy(ans, 0, nums1, 0, m + n);
    }

    /**
     * 方法三（最优方法）：逆向双指针
     * 时间复杂度：O(m+n)
     * 空间复杂度：O(1)
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int cur;

        while (p1 > -1 || p2 > -1) {
            if (p1 == -1) {
                cur = nums2[p2--];
            } else if (p2 == -1) {
                cur = nums1[p1--];
            } else if (nums1[p1] > nums2[p2]) {
                cur = nums1[p1--];
            } else {
                cur = nums2[p2--];
            }
            nums1[p1 + p2 + 2] = cur;
        }
    }

}
