package com.learn.ds.arrays;


import javax.swing.*;
import java.util.Arrays;

public class OneDArray {
    public static int[] arr = {1,6,7,8,12,14,2,3,4,5,14,15};

    public static void main(String[] args) {
        printArray(arr);
        int searchFor = 3;
        System.out.printf("SequentialSearch--> Value %d found at index: %d\n",searchFor,sequentialSearch(arr, searchFor ));
//        Arrays.sort(arr);
        System.out.printf("binarySearch--> Value %d found at index: %d\n",searchFor,binarySearch(arr, searchFor ));
        printArray(arr);
        rotateByKPos(arr, 2);
        printArray(arr);

    }



    public static void printArray(int[] a) {
        System.out.printf("The values in array are: ");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i] + " ");

        }
        System.out.printf("\n");
    }


    public static int sequentialSearch(int[] arr, int value){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] arr, int searchFor) {
        int mid;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (searchFor == arr[mid]) {
                return mid;
            } else if (searchFor < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    private static void rotateByKPos(int[] arr, int k) {
        int arrLen = arr.length;
        reverseArr(arr,0,k-1);
        reverseArr(arr, k, arrLen-1);
        reverseArr(arr, 0, arrLen-1);
        System.out.printf("After rotation by pos:%d, ",k);
    }

    private static void reverseArr(int[] subArr, int start, int end) {
        int temp;
        for (int i=start, j=end; i<j ; i++,j--) {
            temp = subArr[i];
            subArr[i] = subArr[j];
            subArr[j] = temp;
        }
    }


}
