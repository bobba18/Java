package com.company;

import java.util.Scanner;
/*	7. NUMBER OF GOOD PAIRS
	Given an array of integers nums, return the number of good pairs.
	A pair (i, j) is called good if nums[i] == nums[j] and i < j.
*/
public class Goodpairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i<n ;i++)
        {
            nums[i]=in.nextInt();
        }
        int i = 0;
        int count=0;
        while(i<n) {
            int j = 0;
            while (j < n) {
                if (j != i&&j>i) {
                    if (nums[i] == nums[j]) {
                        count++;
                    }
                }
                j++;
            }
            i++;
        }
//        int count = 0;
//        for(int i = 0 ; i<n ; i++){
//            for(int j = 0 ; j<n ; j++){
//                if(j!=i){
//                    if(nums[i]==nums[j]){
//                        count++;
//                    }
//                }
//                else{
//                    break;
//                }
//            }
//        }
        System.out.println(count);
    }
}
