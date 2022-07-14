package com.company;

import java.util.ArrayList;

public class FindAllduplicates {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(cyclicSort(nums));
    }

    private static ArrayList<Integer> cyclicSort(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>(4);
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]) {
                swap(nums,correct,i);
            }else {
                i++;
            }
        }
        for( i = 0; i < nums.length; i++) {
            if(i != nums[i] - 1) {
                result.add(nums[i]);
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
