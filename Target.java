package com.company;

import java.util.ArrayList;
import java.util.Scanner;

///*9. Create target array in the given order
//Given two arrays of integers nums and index. Your task is to
//create target array under the following rules:
//	• Initially target array is empty.
//	• From left to right read nums[i] and index[i], insert at index
//	  index[i] the value nums[i] in target array.
//	• Repeat the previous step until there are no elements to read in nums and index.
//Return the target array.
//It is guaranteed that the insertion operations will be valid.
//*/
public class Target {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of your array: ");
        int n = in.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements of  nums: ");
        for(int i = 0 ; i < n ; i++ )
        {
           nums[i]=in.nextInt();
        }
        System.out.println("Enter elements of index: ");
        int[] index = new int[n];
        for(int i = 0 ;i < n ; i++)
        {
            index[i]=in.nextInt();
        }
        target(nums, index , n );
}
public static void target(int[] nums , int[] index , int n)
        {

            ArrayList<Integer> result =  new ArrayList<>(n);
            for(int i = 0 ; i< n ; i++)
            {
                result.add(index[i],nums[i]);
            }
            System.out.println("The target list is:  ");
            for(int i = 0 ; i<n ; i++)
            {
                System.out.print(result.get(i)+" ");
            }

        }

}