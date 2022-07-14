package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Cellswithoddvalueinmatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of m x n: ");
        int m = 2;
        int n = 3;
        int[][] indices;
        indices = new int[][]{{0, 1}, {1, 1}};
        int[][] mat = new int[m][n];

        for (int k = 0; k < indices.length; k++) {
            for (int i = 0; i < n; i++) {
                int ind = indices[k][0];
                mat[ind][i]++;
            }
            int ind = indices[k][1];
            for (int j = 0; j < m; j++) {
                mat[j][ind]++;
            }
        }
        System.out.println(Arrays.deepToString(mat));

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j]%2!= 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}


