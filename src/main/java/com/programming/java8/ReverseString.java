package com.programming.java8;

import java.util.stream.Stream;

/**
 * Reverse the string in java 8
 */
public class ReverseString {

    public static void main(String[] args) {

        String str = "hello world";
        String reduce = Stream.of(str.split("")).reduce("", (a, b) -> b + a);
        System.out.println(reduce);


    }
}
