package com.programming.string;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String value = minWindow(s, t);
        System.out.println(value);
    }

    private static String minWindow(String s, String t) {

        Map<Character, Integer> map = new HashMap<>();

        for (char c : t.toCharArray()) {
            map.put(c, 1);
        }

        int left = 0;
        int right = 0;
        int count = t.length();
        int min = Integer.MAX_VALUE;

        int left_start = 0;

        while (right < s.length()) {
            char current = s.charAt(right);
            if (map.containsKey(current)) {
                if (map.get(current) > 0) {
                    count--;
                }
                map.put(current, map.get(current) - 1);
            }

            while (count == 0) {

                if (right - left + 1 < min) {
                    min = right - left + 1;
                }

                left_start = left;
                char leftCh = s.charAt(left);
                if (map.containsKey(leftCh)) {
                    map.put(leftCh, map.get(leftCh) + 1);
                    if (map.get(leftCh) > 0) {
                        count++;
                    }
                }
                left++;
            }

            right++;
        }
        System.out.println(min);
        return min == Integer.MAX_VALUE ? "-1" : s.substring(left_start, left_start + min);

    }
}
