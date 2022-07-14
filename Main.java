package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
/*Given a zero-based permutation nums (0-indexed), build an array ans
of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of Array: ");
        int n = in.nextInt();
        int[] num = new int[n];
        System.out.println("Enter Elements of Array: ");
        for(int i = 0 ; i<num.length ; i++)
        {
            num[i] = in.nextInt();
        }
        int[] ans = permutation(num);

        System.out.println(Arrays.toString(ans));

    }
    public static int[] permutation(int[] num)
    {
        int[] ans = new int[num.length];
        for(int i = 0 ; i<num.length ; i++)
        {
            int n = num[i];//1
            ans[i] = num[n];//2
        }
        return ans;
    }
}
