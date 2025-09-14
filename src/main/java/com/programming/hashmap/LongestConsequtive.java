package com.programming.hashmap;

import java.util.HashMap;
import java.util.Map;

// Given an unsorted array of integers, find the length of the longest sequence of consecutive elements. The sequence must consist of consecutive integers, but their order in the array does not matter.
public class LongestConsequtive {
    public static void main(String[] args) {
        int[] arr = {9, 1, 8, 2, 3, 10, 4, 7, 6, 5};
        System.out.println(longestConsecutive(arr));
    }

    private static int longestConsecutive(int[] arr) {

        int max = 0;
        Map<Integer, Boolean> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], true);
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i] - 1)) {
                map.put(arr[i], false);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == true) {
                int count = 1;
                int value = arr[i];
                while (map.containsKey(value + 1)) {
                    count = count + 1;
                    value = value + 1;
                }
                max = Math.max(count, max);
            }
        }

        return max;

    }
}
