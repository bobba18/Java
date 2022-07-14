package com.company;

public class PivotPoint {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
//        {3, 1, 2};
        System.out.println(pivot(nums));
        }

    public static int pivot(int[] nums) {
        int right = nums.length - 1;
        int start = 0;
        int end = nums.length - 1;
        int index = -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] <= nums[right]) {
                index = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return nums[index];
    }
}
