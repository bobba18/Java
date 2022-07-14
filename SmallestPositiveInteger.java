package com.company;

public class SmallestPositiveInteger {
    public static void main(String[] args) {
        int[] nums = {6, 34, 2, 3, 7, 1, 4, 89};
//                {3, 4, -1, 1};
        int ans = search(nums);
        System.out.println(ans);
    }
    static int search(int[] nums) {
        int n = nums.length;
        boolean hasOne = false;
        //step 1 replacing negative integers and integers greater than n t0 1
        for(int i = 0; i < n; i++) {
            if(nums[i] == 1) {
                hasOne = true;
            } else {
                if(nums[i] < 0 || nums[i] > n) {
                    nums[i] = 1;
                }
            }
        }
        if(!hasOne) return 1;

        //step 2 converting the index element to - number
        for(int i = 0; i < n; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] > 0) nums[index] *= -1;
        }

        //step 3 searching for the first positive integer
        for(int i = 0; i < n; i++) {
            if(nums[i] > 0) return i + 1;
        }
        return n + 1;
    }
}
