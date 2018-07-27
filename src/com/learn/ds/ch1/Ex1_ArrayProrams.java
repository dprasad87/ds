package com.learn.ds.ch1;

public class Ex1_ArrayProrams {

    public static void main(String[] args) {
        int[] arr = {1,4,634,-34,6,7,76,54,46,44,47,49,87,9,-9,-86,5,53,43};
        int[][] twoDArray = {{2,34,5,9,8},{2,34,5,9,8}};
        System.out.println("Average = " + calculateAverage(arr));
        print2DArray(twoDArray);
        System.out.println("Sum 2D = " + sum(twoDArray));
        System.out.println("Largest = " + largest(arr));
        System.out.println("Smallest = " + smallest(arr));
        System.out.println("2nd largest = " + secondLargest(arr));
        printMaximas(arr);
    }

    private static void printMaximas(int[] arr) {
        System.out.print("local maximas : ");
        for (int i = 0; i < arr.length ; i++) {
            if((i == 0 || arr[i-1] < arr[i]) && (i == arr.length -1 || arr[i+1] < arr[i])) {
                System.out.print(" " + arr[i]);
            }
        }
        System.out.println();
    }

    private static int secondLargest(int[] arr) {
        int largest = 0;
        int secLargest = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] > secLargest) {
                if(arr[i] > largest) {
                    secLargest = largest;
                    largest = arr[i];
                }
                else {
                    //secLargest < arr[i] < largest
                    secLargest = arr[i];
                }
            }
        }
        return secLargest;
    }

    private static int smallest(int[] arr) {
        int smallest = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] < smallest)
                smallest = arr[i];
        }
        return smallest;
    }

    private static int largest(int[] arr) {
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest)
                largest = arr[i];
        }
        return largest;
    }

    private static int sum(int[][] twoDArray) {
        int sum= 0;
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[0].length ; j++) {
                sum += twoDArray[i][j];
            }
        }
        return sum;
    }

    private static void print2DArray(int[][] twoDArray) {
        for (int i = 0; i < twoDArray.length; i++) {
            System.out.print("[");
            int[] rec0 = twoDArray[0];
            for (int j = 0; j < rec0.length; j++) {
                System.out.print(" " + twoDArray[i][j] );
            }
            System.out.println("]");
        }
    }

    private static int calculateAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

}
