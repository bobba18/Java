package com.company;

public class Saddlepoint {
    public static void main(String[] args) {
        int[][] matrix = { {3,6},
                           {7,1},
                           {5,2},
                           {4,8}};
        int ans = saddlepoint(matrix);
        System.out.println(ans);
    }
    static int saddlepoint(int[][] matrix ) {
        for (int[] ints : matrix) {
            int min = ints[0];
            int index = 0;
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] <= min) {
                    min = ints[j];
                    index = j;
                }
            }
            int max = min;
            for (int[] value : matrix) {
                if (value[index] >= max) {
                    max = value[index];
                }
            }
            if (max == min) {
                return max;
            }
        }
        return -1;
    }
}

