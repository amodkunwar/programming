package com.programming.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SmallestLargest {
    public static void main(String[] args) {
        int[] arr = {12, 1, 34, 56, 6, 5, 4, 33, 3, 2};
        List<Integer> list = Arrays.stream(arr).mapToObj(Integer::valueOf).toList();

        Optional<Integer> first = list.stream().sorted().findFirst();
        System.out.println(first.get());

        Optional<Integer> first1 = list.stream().sorted(Comparator.reverseOrder()).findFirst();

        System.out.println(first1.get());
    }
}
