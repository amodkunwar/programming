package com.programming.java8;

import java.util.stream.Stream;

public class ReverseStringWord {

    public static void main(String[] args) {
        String str = "hello world";
        String trim = Stream.of(str.split(" ")).reduce("", (a, b) -> b + " " + a).trim();
        System.out.println(trim);
    }
}
