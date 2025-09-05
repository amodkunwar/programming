package com.programming.array;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        rotate(arr, 0, arr.length - 1 - k);
        rotate(arr, arr.length - k, arr.length - 1);
        rotate(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));

    }

    public static void rotate(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
