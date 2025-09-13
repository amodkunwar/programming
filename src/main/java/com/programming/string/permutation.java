package com.programming.string;

public class permutation {
    public static void main(String[] args) {
        String s = "abc";
        permutate(s, "");
    }

    private static void permutate(String s, String result) {
        if (s.isEmpty()) {
            System.out.println(result);
        }
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            String rest = s.substring(0, i) + s.substring(i + 1);
            permutate(rest, result + current);
        }
    }
}
