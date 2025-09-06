package com.programming.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {7, -6, 3, 8, -1, 8, -11};
        int target = 0;

        threeSum(arr, target, arr.length);

        System.out.println("Brute force ");

        threeSumBruce(arr, target);
    }

    private static void threeSum(int[] arr, int target, int n) {
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            int newTarget = target - arr[i];
            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                if (arr[j] + arr[k] == newTarget) {
                    System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    while (j < k && arr[j] == arr[j + 1]) {
                        j++;
                    }
                    while (j < k && arr[k] == arr[k - 1]) {
                        k--;
                    }
                    j++;
                    k--;
                } else if (arr[j] + arr[k] < newTarget) {
                    j++;
                } else {
                    k--;
                }
            }
        }

    }

    /**
     * This is bruteforce rule
     *
     * @param arr
     * @param target
     */
    private static void threeSumBruce(int[] arr, int target) {

        Set<String> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (i == j || j == k || i == k) {
                        continue;
                    }
                    int[] triplet = {arr[i], arr[j], arr[k]};
                    Arrays.sort(triplet);
                    String sortedValue = triplet[0] + "" + triplet[1] + "" + triplet[2];
                    if (arr[i] + arr[j] + arr[k] == target && !set.contains(sortedValue)) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        set.add(sortedValue);
                    }


                }
            }
        }


    }
}
