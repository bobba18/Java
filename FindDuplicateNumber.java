package com.company;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(cyclicSort(nums));
    }

    private static int cyclicSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, correct, i);
            } else {
                i++;
            }
        }
            for (int j = 0; j < nums.length; j++) {
                if (j != nums[j] - 1) {
                    return nums[j];
                }
            }
        return -1;
    }

    public static void swap(int[] nums, int correct, int i) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
