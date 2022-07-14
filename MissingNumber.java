package com.company;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {0,1};
//                {9,6,4,2,3,8,7,0,1};
//                   {0,1,2,3,4,5,6,7,8};
        int missing_Number = missingNumber(nums);
        System.out.println(missing_Number);
    }

    private static int missingNumber(int[] nums) {
        int i = 0;
        if(nums.length == 1 && nums[i] != 0) {
            return 0;
        }
        int correct;
        while(i < nums.length) {
            if(nums[i] == nums.length) {
                i++;
                continue;
            }
            correct = nums[nums[i]];
            if(nums[i] != correct){
                swap(nums,correct,i);
            } else {
                i++;
            }
        }
        for(int j = 0; j < nums.length; j++) {
            if(nums[j] != j) {
                return j;
            }
        }
        return nums.length;
    }

    private static void swap(int[] nums, int correct,int i) {
        int temp = nums[i];
        nums[i] = correct;
        nums[temp] = temp;
    }

}
