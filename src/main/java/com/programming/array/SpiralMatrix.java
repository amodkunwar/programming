package com.programming.array;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        int rmin = 0;
        int cmin = 0;
        int rmax = arr.length - 1;
        int cmax = arr[0].length;

        int m = arr.length;
        int n = arr[0].length;

        int count = 0;

        while (count < m * n) {

            // top boundary
            for (int col = cmin; col <= cmax; col++) {
                System.out.print(arr[rmin][col] + " ");
                count++;
            }
            rmin++;


            // right boundary

            for (int row = rmin; row <= rmax; row++) {
                System.out.print(arr[row][cmax]);
                count++;
            }
            cmax--;


            // bottom boundary

            // left boundary


        }


    }
}
