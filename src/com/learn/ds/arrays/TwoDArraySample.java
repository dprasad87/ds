package com.learn.ds.arrays;

public class TwoDArraySample {

    public static void main(String[] args) {
         twoDArrayExample();
    }

    private static void twoDArrayExample() {
        int[][] arr = new int[4][2];
        int count = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = count++;
            }
        }

        print2DArray(arr);
    }

    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" " + arr[i][j]);
            }

        }
    }
}
