package com.company;

import java.util.Arrays;
import java.util.Scanner;
/*	There are n kids with candies. You are given an integer array candies,
where each candies[i] represents the number of candies the ith kid has, and
an integer extra Candies, denoting the number of extra candies that you have.
Return a boolean array result of length n, where result[i] is true if, after
giving the ith kid all the extra Candies, they will have the greatest number
of candies among all the kids, or false otherwise.
Note that multiple kids can have the greatest number of candies.
*/
public class Candies{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter lenght of array: ");
        int n = in.nextInt();
        int[] candies = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            candies[i]= in.nextInt();
        }
        System.out.println("Enter the extra candies you have: ");
        int extra = in.nextInt();
//        int[] total = new int[candies.length];
        int max=0;
        boolean[] result = new boolean[candies.length];
        for(int i = 0 ; i<candies.length ; i++)
        {
            int sum = 0;
            sum = candies[i] + extra;
            for(int j = 0 ; j<candies.length ; j++) {
                if(j!=i) {
                    if (sum >= candies[j]) {
                        result[i] = true;
                    }
                    else{
                        result[i] =false;
                        break;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(result));


    }
}
