package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Reshape {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = { {1, 2}, {3, 4}};
        int r = in.nextInt();
        int c = in.nextInt();
        System.out.println(Arrays.deepToString(reshape(arr, r, c)));
    }
    static int[][] reshape(int[][] arr, int r, int c ) {
       int row = arr.length;
       int col = arr[0].length;
       int[][] output = new int[r][c];
       int r_Index = 0;
       int c_Index = 0;
       if (row * col != r * c) {
           return arr;
       }
       for (int i = 0; i < row; i++) {
           for (int j = 0; j < col; j++) {
               output[r_Index][c_Index] = arr[i][j];
               c_Index++;
               if (c_Index == c) {
                   c_Index = 0;
                   r_Index++;
               }
           }
       }
       return output;
    }
}
