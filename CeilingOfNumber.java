package com.company;
//ceiling of a number - smallest # greater than or equal to target
//  [1,3,5,7,10,12,34,67]
//  [0,1,2,3, 4, 5, 6, 7]
// mid = 0 + 7 / 2 = 3
//nums[3] = 7 < target = 9
//start = mid + 1 = 3 + 1 = 4
//mid = 4 + 7 / 2 = 5
//nums[5] = 12 > 9
//end = mid - 1 = 5 - 1 = 4
//nums[4] = 10 > 9
//end = mid - 1 = 4 - 1 = 3
//start = 4 , end = 3 start > end
//start = 10 ceiling of 9
public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] nums = {1,3,5,7,10,12,34,67};
        int target = 9;
        System.out.println(findCeiling(nums, target));
    }
    static int findCeiling(int[] nums, int target) {
        if(target > nums[nums.length - 1]) {
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
        return nums[start];
    }
}
