package com.company;

public class MinimumRotatedSorted {
    public static void main(String[] args) {
        int[] nums = {11,13,15,17};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
//        [4,5,6,7,0,1,2]
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(mid < end && nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }
            if(mid > start && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }
            if(nums[mid] >= nums[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return nums[0];
    }
}
