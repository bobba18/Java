package com.company;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {1,1000};
        System.out.println(cyclicSort(nums));
    }

    private static int cyclicSort(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            /*if the number is a negative number or number > length or 0 ignore that
            number because it will be placed at the index of missing number*/
            if(nums[i] <= 0 || nums[i] > nums.length) {
                i++;
                continue;
            }
            //cyclic sort
            int correct = nums[i] - 1;

            if(nums[i] != nums[correct]) {
                swap(nums, correct, i);
            }else {
                i++;
            }
        }
        for(i = 0; i < nums.length; i++) {
            if(i != nums[i] - 1){
                return i + 1;
            }
        }
        return nums.length + 1;
    }

    private static void swap(int[] nums, int correct, int i) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
