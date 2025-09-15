package com.programming.binarySearch;

// Find the minimum element in a sorted and rotated array. Input: {7, 8, 10, 15, 16, 2, 4, 6} Output: 2
public class FindMinimumInRotatedArray {

    public static void main(String[] args) {

        int[] arr = {7, 8, 10, 15, 16, 2, 4, 6};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else if (arr[mid] < arr[right]) {
                right = mid;
            }
        }

        System.out.println(arr[left]);


    }
}
