package com.company;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(Arrays.toString(cyclicSort(nums)));
    }

    private static int[] cyclicSort(int[] nums) {
        int[] result = new int[2];
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]) {
                swap(nums,correct,i);
            }else {
                i++;
            }
        }
        for(i = 0; i < nums.length; i++) {
            if(i != nums[i] - 1) {
                result[0] = nums[i];
                result[1] = i + 1;
            }
        }
        return result;
    }

    private static void swap(int[] nums, int correct, int i) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
