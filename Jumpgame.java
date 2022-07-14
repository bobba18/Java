package com.company;

public class Jumpgame {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        boolean ans = canJump(nums);
        System.out.println(ans);
//[3,2,1,0,4]
    }

    static boolean canJump(int[] nums) {
        int lastElement = nums.length - 1;
        for(int i = nums.length - 1; i >= 0 ; i--) {
            if(i + nums[i] >= lastElement) {
                lastElement = i;
            }
        }
        return lastElement == 0;
    }
}
