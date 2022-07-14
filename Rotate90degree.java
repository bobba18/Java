package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate90degree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of nxn array: ");
        int n = in.nextInt();
        int[][] mat;
        mat = new int[][]{{0,0,0}, {0, 1, 0} , {1, 1, 1}};
//        System.out.println("Enter matrix");
//        for(int i=0; i<n ;i++){
//            for(int j =0 ; j< n; j++){
//                mat[i][j]=in.nextInt();
//            }
//        }
//        System.out.println("Enter target matrix");
        int[][] target ;
//        for(int i=0; i<n ;i++){
//            for(int j =0 ; j< n; j++){
//                target[i][j]=in.nextInt();
//            }
//        }
        target=new int[][]{{1, 1, 1} , {0, 1, 0},{0,0,0} };
        boolean ans = rotate(mat,target,n);
        System.out.println(ans);
    }
    public static boolean rotate(int[][] mat,int[][] target , int n){
        int[][] transpose = new int[n][n];
        for(int r = 0 ;r < 4 ; r++) {
            for (int i = 0; i < n; i++) {
                int c = n - 1;
                for (int j = 0; j < n; j++) {
                    transpose[i][j] = mat[c][i];
                    c--;
                }
            }
                    if(Arrays.deepEquals(transpose, target)){
                System.out.println("We can rotate mat 90 degrees clockwise " + (r+1) +" times to make mat equal to target");
                System.out.println("Matrix " + Arrays.deepToString(mat));
                System.out.println("Target "+Arrays.deepToString(target));
                System.out.println("After rotating "+Arrays.deepToString(transpose));
                return true;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    mat[i][j] = transpose[i][j];
                }
            }

        }
        System.out.println(Arrays.deepToString(mat));
        System.out.println(Arrays.deepToString(target));
        System.out.println(Arrays.deepToString(transpose));
        return  false;
    }
}
