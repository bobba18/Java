package com.company;

import java.util.Arrays;
import java.util.Scanner;
/*8. How Many Numbers Are Smaller Than the Current Number
Given the array nums, for each nums[i] find out how many numbers
in the array are smaller than it. That is, for each nums[i] you have
to count the number of valid j's such that j != i and nums[j] < nums[i].
Return the answer in an array.
*/
public class Smallerthanme {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i<n ;i++)
        {
            nums[i]=in.nextInt();
        }
        int[] result = new int[n];
        for(int i = 0 ; i<n ; i++){
            int count = 0;
            for(int j = 0 ; j < n ; j++){
                if(i!=j)
                {
                    if(nums[i]>nums[j])
                    {
                        count++;
                        result[i]=count;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
