package com.programming.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int target = 14;
        int[] arr = {7, 6, 3, 8, 2};
        int[] a = twoSum(arr, target);
        System.out.println(a[0] + " " + a[1]);
    }

    private static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int value = target - arr[i];
            if (map.containsKey(value)) {
                return new int[]{map.get(value), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }
}
