package com.company;

import java.util.Arrays;
import java.util.Scanner;
/*	3. Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
	Return the running sum of nums.
*/
public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i<nums.length ; i++)
        {
            nums[i]= in.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        int[] sum = new int[nums.length];
        int a = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            a = a + nums[i];
            sum[i] = a;
        }
        System.out.println(Arrays.toString(sum));
    }
}
