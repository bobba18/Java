package com.company;

import java.util.ArrayList;

public class AllMissingNumbers {
    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(cyclicSort(nums));
    }

    private static ArrayList<Integer> cyclicSort(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>(4);
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]) {
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for(int j = 0; j < nums.length; j++) {
            if(j != nums[j] - 1) {
                result.add(j + 1);
            }
        }
        return result;
    }

    private static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
