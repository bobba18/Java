package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of mxn array: ");
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] matrix = new int[m][n];
        for(int i = 0 ; i< m ; i++){
            for(int j = 0; j<n ; j++){
                matrix[i][j]=in.nextInt();
            }
        }
        System.out.println("MATRIC LENGHT= "+matrix.length);
        int[][] ans = transpose(matrix, m , n);
        System.out.println("Transpose of "+ Arrays.deepToString(matrix)+" is "+Arrays.deepToString(ans));


    }

    public static int[][] transpose(int[][] matrix ,int m , int n) {
        int[][] transpose = new int[n][m];
        for(int i =0 ; i<n ;i++){
            for(int j = 0 ;j<m ; j++){
                transpose[i][j]=matrix[j][i];
            }
        }
        return transpose;

    }
}
