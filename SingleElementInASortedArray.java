package com.company;

public class SingleElementInASortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
//{1,1,2,3,3,4,4,8,8};
//                {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(nums));
    }
//    public static int singleNonDuplicate(int[] nums) {
//        int singal = 0;
//
//        for (int i = 0; i < nums.length; i += 2) {
//            boolean ans = false;
//            int target = nums[i];
//            int start = i + 1;
//            int end = nums.length - 1;
//            int mid = 0;
//
//            while (start <= end) {
//                mid = start + (end - start) / 2;
//                if (nums[mid] == target) {
//                    ans = true;
//                    break;
//                } else if (nums[mid] > target) {
//                    end = mid - 1;
//                } else {
//                    start = mid + 1;
//                }
//            }
//            if (!ans) {
//                singal = target;
//                break;
//            }
//
//        }
//        return singal;
//    }
//    public static int singleNonDuplicate(int[] nums) {
//        int x=0;
//        for(int i=0;i<nums.length;i++)
//        {
//            x = x ^ nums[i];
//        }
//        return x;
//    }
    public static int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length- 1;

        while(left < right) {
            int mid = left + (right - left) / 2;
            boolean isEven = (right - mid) % 2 == 0;
            if(nums[mid] == nums[mid - 1]) {
                if(isEven) {
                    right = mid - 2;
                } else {
                    left = mid + 1;
                }
            } else if(nums[mid] == nums[mid + 1]) {
                if(isEven) {
                    left = mid + 2;
                } else {
                    right = mid - 1;
                }
            } else {
                return nums[mid];
            }
        }
        return nums[left];
    }
}
