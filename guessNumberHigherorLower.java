package com.company;

import java.util.Scanner;

public class guessNumberHigherorLower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = in.nextInt();
        System.out.println(guessNumber(n));
    }
    static int guessNumber(int n) {
        System.out.println("Enter your pick:");
        Scanner in = new Scanner(System.in);
        int pick = in.nextInt();
        int start = 1;
        int end = n;
        int mid;
        int ans = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            ans = guess(mid,pick);
            if(ans == 0) {
                return mid;
            } else if(ans == -1) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    static int guess(int num, int pick) {
        if(num > pick) {
            return -1;
        } else if(num < pick) {
            return 1;
        } else {
            return 0;
        }
    }
}
