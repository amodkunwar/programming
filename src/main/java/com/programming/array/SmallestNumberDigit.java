package com.programming.array;

public class SmallestNumberDigit {
    public static void main(String[] args) {
        String result = "";
        int n = 81000;
        int[] arr = new int[10];
        int count = 0;
        for (int i = 9; i >= 2; i--) {
            while (n % i == 0) {
                n = n / i;
                result = i + result;
            }
        }

        if (n != 1) {
            System.out.println(-1);
        } else {
            System.out.println(Integer.parseInt(result));
        }

    }
}
