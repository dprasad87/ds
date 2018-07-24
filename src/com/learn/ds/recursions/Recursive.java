package com.learn.ds.recursions;

public class Recursive {

    static int n = 48725;
    public static void main(String[] args) {
        //System.out.printf("Facotial of %d is %d:\n", n, factorial(n));
        System.out.printf("Base 10 integers till %d are :\n", n);
        printBase10(n);
        System.out.printf("\nBase 16 integers till %d are :\n", n);
        printBase16(n,16);
        System.out.println();
}

/**
 * O(n)
 */
    private static void printBase16(int number, int base) {
        String conversion = "0123456789ABCDEF";
        int digit = (char) (number % base);
//        System.out.println(digit);
        number  = number / base;
        if(number != 0)
            printBase16(number, base);
        System.out.print(" " + conversion.charAt(digit));

    }

    //O(n)
    private static void printBase10(int number) {
        char digit = (char) (number % 10 + '0');
//        System.out.println(digit);
        number = number / 10;
        if (number != 0)
            printBase10(number);
        System.out.print(" " + digit);
    }

    private static long factorial(int i) {
        if( i <= 1)
            return 1;
        return i * factorial(i-1);
    }
}
