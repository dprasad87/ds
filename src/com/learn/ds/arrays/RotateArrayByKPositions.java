package com.learn.ds.arrays;


public class RotateArrayByKPositions extends OneDArray {

    public static void main(String[] args) {
	// write your code here
        //int[] inArray = {};
        int k = 3;
        printArray(arr);
        rotateArray(arr, 2);
    }

    private static void rotateArray(int[] a, int k) {
        int size = a.length;
        reverseArray(a, 0, k-1);
        reverseArray(a, k, size-1);
        reverseArray(a, 0, size-1);
    }

    private static void reverseArray(int[] a, int start, int end) {
        for(int i=start,j=end;i<j;i++,j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        printArray(a);
    }
}