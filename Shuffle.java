package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Shuffle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       System.out.println("Enter size of array:" );
        int n = in.nextInt();
        int[] nums = new int[2*n];
        for(int i = 0 ; i<2*n ; i++)
        {
            nums[i]=in.nextInt();
        }
        int d = n;
        int[] nums2 = new int[nums.length];
        for(int i = 0 ; i<2*n ; i++)
        {
            if(i%2==0)
            {
                nums2[i]=nums[i/2];
            }
            else
            {
                nums2[i]=nums[2*n-d];
                d--;
            }
        }
        System.out.println(Arrays.toString(nums2));
    }
}

