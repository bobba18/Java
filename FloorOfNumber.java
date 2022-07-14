package com.company;
//Floor of a number - larget number smaller than or equal to target
// {2, 5, 7, 9, 10, 23, 56}
// [0, 1, 2, 3,  4,  5,  6}
// start = 0 , end = 6
// mid = start + end / 2 = (0 + 6) / 2 = 3
//nums[3] = 9 < 19
//start = mid + 1 = 3 + 1 = 4
//mid = (4 + 6) / 2 = 5
//nums[5] = 23 > 19
//end = mid - 1 = 5 - 1 = 4;
//mid = 4 + 4 / 2 = 4
//nums[4] = 10 < 19
//start = mid + 1 = 4 + 1 = 5
//start = 5 , end = 4
//nums[end] = 10 is floor of 19
public class FloorOfNumber {
    public static void main(String[] args) {
        int[] nums = {2, 5, 7, 9, 10, 23, 56};
        int target = 45;
        System.out.println(findFloor(nums, target));
    }
    static int findFloor(int[] nums, int target) {
        if(target < nums[0]) {
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                return nums[mid];
            } else if(nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return nums[end];
    }
}
