package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Setmatrixzeros {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 0, 1, 5}, {2, 3, 2, 3, 2}, {0, 4, 1, 8, 7}, {3, 3, 0, 1, 2}};
        //{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        //{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] ans = setZero(matrix);
        System.out.println(Arrays.deepToString(ans));
    }

    static int[][] setZero(int[][] matrix) {

        int count = 0;

        ArrayList<Integer> rowIndex = new ArrayList<>(2);
        ArrayList<Integer> colIndex = new ArrayList<>(2);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rowIndex.add(i);
                    colIndex.add(j);
                    count++;
                }
            }
        }

        int counter = 0;
        int r = 0;
        int c = 0;

        while(counter < count) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (i == rowIndex.get(r) || j == colIndex.get(c)) {
                        matrix[i][j] = 0;
                    }
                }
            }
            counter++;
            r++;
            c++;
        }

        return matrix;
    }
}
