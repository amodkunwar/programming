package com.programming.binarySearch;

public class FindFirstAndLastOccurance {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 5, 5, 5, 7, 8};
        int target = 5;
        int left = 0;
        int right = arr.length - 1;

        int first = -1;
        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                first = mid;

                right = mid - 1;

            } else if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            }
        }

        left = 0;
        right = arr.length - 1;

        int second = -1;
        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                second = mid;

                left = mid + 1;

            } else if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            }
        }

        System.out.println("first: " + first);

        System.out.println("first: " + second);


    }
}
