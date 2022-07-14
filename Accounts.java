package com.company;

import java.util.Scanner;

/*	4. You are given an m x n integer grid accounts where accounts[i][j] is
 the amount of money the ith customer has in the jth bank. Return the wealth
 that the richest customer has.A customer's wealth is the amount of money
 they have in all their bank accounts. The richest customer is the customer
 that has the maximum wealth.
*/
public class Accounts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter # of rows: ");
        int r = in.nextInt();
        System.out.print("Enter # of cols: ");
        int c = in.nextInt();
        int[][] acc = new int[r][c];
        for (int row = 0; row < r; row++) {
            System.out.print("Enter Elements in row"+(row+1)+" = ");
            for (int col = 0; col < c ; col++) {
                acc[row][col] = in.nextInt();
            }
        }
        int max = 0;
        for (int row = 0; row < acc.length; row++) {
            int sum = 0;
            for (int col = 0; col < acc[row].length; col++) {
                sum = sum + acc[row][col];
                if(sum>max)
                {
                    max=sum;
                }
            }
        }
        System.out.println("Maximum wealth max = " +max);
    }
}


