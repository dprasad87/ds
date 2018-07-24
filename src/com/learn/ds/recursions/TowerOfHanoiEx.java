package com.learn.ds.recursions;

// O(n)
public class TowerOfHanoiEx {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("The sequence of moves in Tower of Hanoi are:");
        towerOfHanoi(num,'A','B','C');
    }

    private static void towerOfHanoi(int n, char src, char dest, char aux) {
        if(n == 1) {
            System.out.println(src +" --> "+ dest);
            return;
        }
        //Move top n-1 discs from peg A to peg B via peg C
        towerOfHanoi(n-1, src, aux, dest);

        //Move remaining disk from A to C
        System.out.println(src + " --> " + dest);

        //Move discs from B to C via A
        towerOfHanoi(n-1, aux,dest, src );
    }
}
