package com.learn.ds.recursions;

/**
 * Euclid’s algorithm is used to find gcd. GCD(n,m) == GCD(m, n mod m)
 * */
public class GCDProg {

    public static void main(String[] args) {
        int num1 = 2356;
        int num2 = 4566;
        System.out.printf("GCD of %d and %d = %d\n ", num1, num2, gcd(num1,num2));
    }

    private static int gcd(int m, int n) {
        //Assuption : m>n

        if(m < n)
            return gcd(n,m);
        if(m%n == 0)
            return n;
        return gcd(n, m%n);
    }

}
