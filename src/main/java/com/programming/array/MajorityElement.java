package com.programming.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 3, 9, 2, 3, 2, 5, 2, 7, 2};
        int n = arr.length;

        majorityElement(arr, n);
    }

    private static void majorityElement(int[] arr, int n) {

        int candidate = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }


        }
        System.out.println(candidate);

    }

    /**
     * Brute force code
     *
     * @param arr
     * @param n
     */
    private static void majorityElementBrute(int[] arr, int n) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int a : arr) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        Map.Entry<Integer, Integer> first = map.entrySet().stream().filter(x -> x.getValue() > n / 2).findFirst().orElse(Map.entry(-1, -1));
        System.out.println(first.getKey());

    }
}
