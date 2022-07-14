package com.company;

public class FindPivotIndex {

    public static void main(String[] args) {
        int[] nums = {-1,-1,-1,-1,-1,0};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int[] prefixSum = new int[nums.length];
        int[] postfixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        postfixSum[nums.length - 1] = nums[nums.length - 1];

        //Prefix Array
        for(int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }

        //Postfix Array
        for(int j = nums.length - 2; j >= 0; j--) {
            postfixSum[j] = postfixSum[j+1] + nums[j];
        }


        int leftSum ;
        int rightSum ;
        for(int k = 0; k < nums.length; k++) {
            if(k == 0) {
                leftSum = 0;
            } else {
                leftSum = prefixSum[k-1];
            }
            if(k == nums.length - 1) {
                rightSum = 0;
            } else {
                rightSum = postfixSum[k+1];
            }
            if(leftSum == rightSum) {
                return k;
            }
        }

        return -1;
    }

}

