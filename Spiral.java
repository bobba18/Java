package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        ArrayList<Integer> matrix = new ArrayList<>(9);
        ArrayList<Integer> ans = spiral(arr);
        System.out.println(ans);
    }

    static ArrayList<Integer> spiral(int[][] arr) {

        ArrayList<Integer> matrix = new ArrayList<>(9);
        int colStart = 0;
        int colEnd = arr[0].length - 1;
        int rowStart = 0;
        int rowEnd = arr.length - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {

            for (int i = colStart; i <= colEnd; i++) {
                matrix.add(arr[rowStart][i]);
            }

            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                matrix.add(arr[i][colEnd]);
            }

            colEnd--;

            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    matrix.add(arr[rowEnd][i]);
                }

                rowEnd--;

                if (colStart <= colEnd) {
                    for (int i = rowEnd; i >= rowStart; i--) {
                        matrix.add(arr[i][colStart]);
                    }
                }

                colStart++;
            }

        }
        return matrix;
    }
}

