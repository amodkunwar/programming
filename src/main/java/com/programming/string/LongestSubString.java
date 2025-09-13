package com.programming.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
        String s = "abcdeabcdbb";

        Set<Character> set = new HashSet<>();

        int window = 0;
        int left = 0;
        int right = 0;
        int left_start = 0;
        while (right < s.length()) {
            char current = s.charAt(right);
            while (set.contains(current)) {
                set.remove(current);
                left++;
            }

            if (right - left + 1 > window) {
                window = right - left + 1;
                left_start = left;
            }


            set.add(current);
            right++;

        }

        System.out.println(s.substring(left_start, left_start + window));
        System.out.println("window: " + window);

    }
}
