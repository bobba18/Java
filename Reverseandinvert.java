package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Reverseandinvert {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] o_mat;
        int r = 4;
        o_mat = new int[][]{{1, 1, 0,0}, {1, 0,0, 1}, {0, 1, 1,1},{1, 0, 1,0}};
        int[][] n_mat = new int[r][r];
        System.out.println("ORIGINAL:  " + Arrays.deepToString(o_mat));

        //to flip it horizontally
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                n_mat[i][j] = o_mat[i][r - (j + 1)];
            }
        }
        System.out.println("HORIZONTALLY FLIPPED:  " + Arrays.deepToString(n_mat));

        //to invert it
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                n_mat[i][j] ^= 1;
            }
        }
            System.out.println("INVERTED:  " + Arrays.deepToString(n_mat));
    }
}

