package com.company;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
//                {4, 5, 6, 7, 8, 10, 0, 1, 2, 3};
//                   {0, 1, 2, 3, 4,  5, 6, 7, 8, 9};
        int target = 4;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int pivot = FindPeak(0 , nums.length - 1, nums , target);
        int index;
        if(pivot == -1) {
            index = BinarySearch(0, nums.length - 1, nums, target);
            return index;
        }
        if(nums[pivot] == target) {
            return pivot;
        }
        if(target >= nums[0]) {
            index = BinarySearch(0, pivot, nums, target);
        }else {
            index = BinarySearch (pivot + 1, nums.length - 1,  nums , target);
        }
        return index;
    }
    public static int FindPeak(int start, int end, int[] nums, int target) {
        int first = nums[0];
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                return mid;
            }
//            if the mid is last index of array mid + 1 will be out of bound therefore mid > end
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
    public static int BinarySearch(int start, int end , int[] nums, int target) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}


