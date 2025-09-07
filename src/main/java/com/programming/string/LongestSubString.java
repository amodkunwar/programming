package com.programming.string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {
    public static void main(String[] args) {
        String str = "abcabcdebb";
        String longestSubString = "";
        Map<Character, Integer> map = new HashMap<>();
        int longest = 0;
        int start = 0;
        for (int end = 0; end < str.length(); end++) {
            char c = str.charAt(end);
            if (map.containsKey(c) && map.get(c) >= start) {
                start = map.get(c) + 1;
            }

            map.put(c, end);

            int window = end - start + 1;

            if (window > longest) {
                longest = window;
                longestSubString = str.substring(start, end + 1);
            }
        }

        System.out.println("Longest window " + longest);
        System.out.println("Longest substring " + longestSubString);
    }
}
