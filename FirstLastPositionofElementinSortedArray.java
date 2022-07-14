package com.company;

import java.util.Arrays;

public class FirstLastPositionofElementinSortedArray {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] index = {-1,-1};

        if(nums.length == 0) {
            return index;
        }

        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                index[0] = mid;
            }
            if(target <= nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if(index[0] == -1) {
            return index;
        }

        start = 0;
        end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                index[1] = mid;
            }
            if(nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return index;
    }

}
