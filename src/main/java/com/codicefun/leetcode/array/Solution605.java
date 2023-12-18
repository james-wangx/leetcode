package com.codicefun.leetcode.array;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Solution605 {

    public boolean canPlaceFlowers1(int[] flowerbed, int n) {
        StringBuilder sb = new StringBuilder();
        List<Integer> nums = new ArrayList<>();
        int sum = 0;

        for (int i: flowerbed) {
            sb.append(i);
        }

        String string = sb.toString();
        String[] split = string.split("1");

        for (String s: split) {
            if (!s.isEmpty()) {
                nums.add(s.length());
            }
        }

        for (Integer num: nums) {
            if (num % 2 == 0) {
                sum += (num - 1) / 2;
            } else {
                sum += num / 2;
            }
        }

        if (flowerbed[0] != 1 && flowerbed[flowerbed.length - 1] != 1 && split.length == 1) {
            sum++;
        } else {
            if (flowerbed[0] != 1 &&
                split[0].length() % 2 == 0) {
                sum++;
            }
            if (flowerbed[flowerbed.length - 1] != 1 &&
                split[split.length - 1].length() % 2 == 0) {
                sum++;
            }
        }

        return n <= sum;
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0, len = flowerbed.length; i < len && n > 0; ) {
            if (flowerbed[i] == 1) {
                i += 2;
            } else if (i == len - 1 || flowerbed[i + 1] == 0) {
                n--;
                i += 2;
            } else {
                i += 3;
            }
        }

        return n <= 0;
    }

}
