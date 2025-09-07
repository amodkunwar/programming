package com.programming.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4};

        int unique = 0;

        List<Integer> lst = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            if (lst.contains(arr[i])) {
                continue;
            } else {
                lst.add(arr[i]);
            }

        }

        int[] array = lst.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(array));
    }

}
