package com.company;

import java.util.Arrays;

public class Firstandlastposition {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = startingIndex(nums, target);
        result[1] = endingIndex(nums, target);
        return result;
    }
    static int startingIndex(int[] nums, int target) {
        int index = -1;

        int start = 0;
        int end = nums.length - 1;
        int mid;
        while(start <= end) {
            mid = (start + end) / 2;
            if(nums[mid] == target) {
                index = mid;
            } if (target <= nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return index;
    }
    static int endingIndex(int[] nums, int target) {
        int index = -1;

        int start = 0;
        int end = nums.length - 1;
        int mid;
        while(start <= end) {
            mid = (start + end) / 2;
            if(nums[mid] == target) {
                index = mid;
            } if (target >= nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return index;
    }
}
