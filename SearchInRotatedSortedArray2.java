package com.company;

public class SearchInRotatedSortedArray2 {
    public static void main(String[] args) {
        int[] nums = {2,5,6,7,8,0,0,1,2};
        int target = 7;
        System.out.println(FindPeak(0 , nums.length, nums,target));
    }
    public static int FindPeak(int start, int end, int[] nums, int target) {
        int first = nums[0];
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            //if the mid is last index of array mid + 1 will be out of bound therefore mid > end
            if(mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            //if the mid is the first index of array mid - 1 will be out of bound therefore mid > start
            if(mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if(nums[mid] >= first) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
