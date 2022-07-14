package com.company;
/*24. Maximum subarray(KADANE ALGORITHM)
Given an integer array nums, find the contiguous subarray (containing at least one number)
which has the largest sum and return its sum.A subarray is a contiguous part of an array.*/
public class Subarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = subarraysum(nums);
        System.out.println(ans);
    }
    static int subarraysum(int[] nums) {
        /*
        * one of the method would be to check ever combination i.e brute force method
        * for instance -2 , -2+1 , -2+1+(-3) but its complexity would be O(n3)
        *  or          -2 , -2+1 ,  -1+(-3)  but its complexity would be O(n2)
        *
        *
        * to make our code efficient we will use kadane algorithm
        * so in the array there can be 9 subarrays with different max values
        * these can be [-2] [1] [-3] [4] [-1] [2] [1] [-5] [4]
        * as we start from the left [-2] will be the subarray with max sum
        * [-2]
        * [1]  [1 + (-2) = -1]          current_sum  =  [1]
        * [-3] [-3 + 1 = -2 ]           current_sum  =  [-3 + 1 = -2 ]
        * [4]  [4 + (-3) + 1 = 2]       current_sum  =  [4]
        * [-1] [-1 + 4 = 3]             current_sum  =  [-1 + 4 = 3]
        * [2]  [2 + 3 = 5]              current_sum  =  [2 + 3 = 5]
        * [1]  [1 + 2 + 3 = 6]          current_sum  =  [1 + 2 + 3 = 6]
        * [-5] [-5 + 1 + 2 + 3 = 1]     current_sum  =  [-5 + 1 + 2 + 3 = 1]
         * [4]  [4 + 1 = 5]             current_sum  =    */


        int max_sum = nums[0];
        int current_sum = nums[0] ;
        for (int i = 1 ; i< nums.length ; i++) {
            current_sum = Math.max(nums[i] , nums[i] + current_sum);
            max_sum = Math.max(max_sum, current_sum);
        }
        return max_sum;
    }
}



