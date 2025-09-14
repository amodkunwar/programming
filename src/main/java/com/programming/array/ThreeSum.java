package com.programming.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Write a program to find all unique triplets in the array which gives the sum of zero. Input: nums = [-1,0,1,2,-1,-4] Output: [[-1,-1,2],[-1,0,1]]

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

            if (i == 0 || arr[i] != arr[i - 1]) {

                int j = i + 1;
                int k = n - 1;

                int newTarget = target - arr[i];

                while (j < k) {
                    int sum = arr[j] + arr[k];
                    if (sum == newTarget) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        while (j < k && arr[j] == arr[j + 1]) {
                            j++;
                        }
                        while (j < k && arr[k] == arr[k - 1]) {
                            k--;
                        }
                        j++;
                        k--;
                    } else if (sum < newTarget) {
                        j++;
                    } else {
                        k--;
                    }
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

                    int value = arr[i] + arr[j] + arr[k];

                    int[] triplet = {arr[i], arr[j], arr[k]};
                    Arrays.sort(triplet);
                    String key = triplet[0] + "" + triplet[1] + "" + triplet[2];
                    if (value == target && !set.contains(key)) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    }

                    set.add(arr[i] + "" + arr[j] + "" + arr[k]);


                }
            }
        }

    }
}
