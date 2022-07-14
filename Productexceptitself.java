package com.company;

import java.util.Arrays;

public class Productexceptitself {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int[] ans = product(nums);
        System.out.println(Arrays.toString(ans));
//        {-1, 1, 0, -3, 3};
    }
    static int[] product(int[] nums) {
        int[] ans = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] = 1;
        right[nums.length - 1] = 1;

        for(int i = 0; i < nums.length - 1; i++) {
            left[i+1] = left[i] * nums[i];
        }

        for(int i = nums.length - 1 ; i > 0; i--) {
            right[i-1] = right[i] * nums[i];
        }

        for(int i = 0; i < nums.length; i++) {
            ans[i] = left[i] * right[i];
        }
        return ans;

    }
}
