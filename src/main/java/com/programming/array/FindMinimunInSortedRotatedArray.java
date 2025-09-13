package com.programming.array;

public class FindMinimunInSortedRotatedArray {

    public static void main(String[] args) {
        int[] arr = {22, 23, 25, 26, 28, 4, 6, 8, 9};
        int min = finMin(arr, 4);
        System.out.println(min);
    }

    private static int finMin(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            if (arr[mid] < target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return arr[left];

    }
}
