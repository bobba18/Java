package com.company;

import java.util.Arrays;

public class TwoSumSortedArray {
    public static void main(String[] args) {
        int[] numbers = {12,13,23,28,43,44,59,60,61,68,70,86,88,92,124,125,136,168,173,173,180,199,212,221,227,230,277,282,306,314,316,321,325,328,336,337,363,365,368,370,370,371,375,384,387,394,400,404,414,422,422,427,430,435,457,493,506,527,531,538,541,546,568,583,585,587,650,652,677,691,730,737,740,751,755,764,778,783,785,789,794,803,809,815,847,858,863,863,874,887,896,916,920,926,927,930,933,957,981,997};
        int target = 542;
        int[] ans = twoSum(numbers, target);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] twoSum(int[] numbers, int target) {

        //Time complexity O(n)
                int a_Pointer = 0;
                int b_Pointer = numbers.length - 1;

                while( a_Pointer <= b_Pointer) {

                    int sum = numbers[a_Pointer] + numbers[b_Pointer];

                    if(sum > target) {
                        b_Pointer--;
                    } else if (sum < target) {
                        a_Pointer++;
                    } else {
                        return new int[] {a_Pointer + 1, b_Pointer + 1};
                    }
                }
                return new int[] {a_Pointer + 1, b_Pointer + 1};


//        int[] result = {-1, -1};
//
//        int n = numbers.length;
//
//        for(int i = 0; i < n; i++) {
//
//            int start = i + 1;
//            int end = n - 1;
//
//            int num1 = numbers[i];
//            int num2 = target - num1;
//            result[0] = i+1;
//
//            while (start <= end) {
//                int mid = start + (end - start) / 2;
//                if(numbers[mid] == num2) {
//                    result[1] = mid + 1;
//                    break;
//                } else if(numbers[mid] > num2) {
//                    end = mid - 1;
//                } else {
//                    start = mid + 1;
//                }
//            }
//
//            if(result[1] != -1) {
//                break;
//            }
//        }
//        return result;
    }
}

