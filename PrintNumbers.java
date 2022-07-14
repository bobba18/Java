package learn.java;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N:");
        int N = in.nextInt();
        printNumber1toN(N);
        System.out.println();
        printNumberNto1(N);
        System.out.println();
        printNumberNto1and1toN(N);
    }

    public static void printNumber1toN(int N) {
        if(N == 0) {
            return;
        }
        printNumber1toN(N-1);
        System.out.print(N + " ");
    }

    public static void printNumberNto1(int N) {
        if(N == 0) {
            return;
        }
        System.out.print(N + " ");
        printNumberNto1(N-1);
    }

    public static void printNumberNto1and1toN(int N) {
        if(N == 0) {
            return;
        }
        System.out.print(N + " ");
        printNumberNto1and1toN(N-1);
        System.out.print(N + " ");
    }
}
