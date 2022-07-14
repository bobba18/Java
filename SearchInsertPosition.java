package com.company;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {8,9,13,14};
        int target = 11;
        System.out.println(searchInsert(nums,target));
    }
//    {3,6,7,8,10}
    public static int searchInsert(int[] nums, int target) {
        //case 1: [8,9,13,14] target - 13 result - 2 in the array
        //case 2: [8,9,13,14] target - 17 result - 4(n) outside array ( target > num[n - 1]}
        //case 3: [8,9,13,14] target - 11 result - 2(start) between elements
        //case 4: [8,9,13,14] target - 5 result - 0 outside array ( target < num[0])
        int n = nums.length;
        int start = 0;
        int end = n - 1;

        if(nums[0] > target) {
            return 0;
        } else if (nums[n - 1] < target) {
            return n;
        } else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return start;
    }
}
