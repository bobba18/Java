package com.company;

import java.util.Scanner;

public class Adddiagonal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of matrix: ");
        int m = in.nextInt();
        int[][] matrix = new int[m][m];
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ;j <m ; j++){
                matrix[i][j]=in.nextInt();
            }
        }
        int sum = sumofdigonal(matrix ,m );
        System.out.println("Sum is = "+sum);
    }

    public static int sumofdigonal(int[][] matrix, int m)  {
        int sum =0;
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ;j <m ; j++){
               if((i+j)%2==0){
                   sum+=matrix[i][j];
               }
            }
        }
        return sum;

    }
}
