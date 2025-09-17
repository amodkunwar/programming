package com.programming.binarySearch;

public class SearchInRotateArray {
    public static void main(String[] args) {
        int[] arr = {7, 8, 10, 15, 16, 2, 4, 6};
        int target = 6;
        int minIndex = findMin(arr);
        int index = searchInRotatedArray(arr, 0, minIndex - 1, target);
        if (index == -1) {
            index = searchInRotatedArray(arr, minIndex, arr.length - 1, target);
        }
        System.out.println(index);
    }

    private static int searchInRotatedArray(int[] arr, int left, int right, int target) {

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;

    }

    private static int findMin(int[] arr) {

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
        return left;
    }
}
