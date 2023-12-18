package com.codicefun.leetcode.string;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Solution345 {

    public String reverseVowels(String s) {
        char[] charArray = s.toCharArray();
        int i = 0, j = charArray.length - 1;

        while (i < j) {
            while (i < j && notVowel(charArray[i])) {
                i++;
            }
            while (i < j && notVowel(charArray[j])) {
                j--;
            }
            swap(charArray, i++, j--);
        }

        return new String(charArray);
    }

    public boolean notVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) < 0;
    }

    public void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public String reverseVowels1(String s) {
        List<Character> vowelList = new ArrayList<>();
        List<Integer> indexList = new ArrayList<>();
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char cur = charArray[i];
            if (cur == 'a' || cur == 'e' || cur == 'i' || cur == 'o' || cur == 'u' ||
                cur == 'A' || cur == 'E' || cur == 'I' || cur == 'O' || cur == 'U') {
                vowelList.add(cur);
                indexList.add(i);
            }
        }

        for (int i = 0, j = vowelList.size() - 1; i < indexList.size() && j > -1; i++, j--) {
            charArray[indexList.get(i)] = vowelList.get(j);
        }

        return new String(charArray);
    }

}
