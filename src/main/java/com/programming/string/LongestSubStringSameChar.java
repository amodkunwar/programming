package com.programming.string;

public class LongestSubStringSameChar {

    public static void main(String[] args) {

        String s = "aaabbbbcccccc";

        int count = 1;

        int max = 1;

        for (int i = 1; i < s.length(); i++) {
            char current = s.charAt(i);
            char previous = s.charAt(i - 1);
            if (current == previous) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 1;
            }
        }

        System.out.println(max);
    }
}
