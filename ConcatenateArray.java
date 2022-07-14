package com.company;

import java.util.Arrays;
import java.util.Scanner;
/*	2. Given an integer array nums of length n, you want to create an
 array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i]
 for 0 <= i < n (0-indexed).
Specifically, ans is the concatenation of two nums arrays.
Return the array ans.

*/
public class ConcatenateArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Size of array: ");
        int n = in.nextInt();
        int[] nums = new int[n];
        int[] ans = new int[2*nums.length];
        for(int i = 0 ; i<nums.length ; i++)
        {
            nums[i] = in.nextInt();
        }
        for(int i = 0 ; i < ans.length ; i++)
        {
            if(i<nums.length) {
                ans[i] = nums[i];
            }
            else {
                ans[i]=nums[i-n];
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
