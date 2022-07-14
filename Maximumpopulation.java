package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Maximumpopulation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n = in.nextInt();
        int[][] year = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                year[i][j] = in.nextInt();
            }
        }
        maxpop(year, n);
    }

    public static void maxpop(int[][] year, int n) {
        int[][] alive = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 1) {
                    alive[i][j] = (year[i][j] - 1);
                } else {
                    alive[i][j] = year[i][j];
                }
            }
        }
            System.out.println(Arrays.deepToString(alive));
            for(int i = 0 ; i<n; i++){
                for(int j = 0; j<n ; j++)
                {

                }
            }
    }
}

