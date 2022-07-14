package com.company;
//  PEAK : GREATEST ELEMENT IN AN ARRAY
/*  if my mid > mid + 1 element then it is possible that a greater # than mid is
    present in the left-hand side of mid so end = mid   */
/*  if my mid < mid + 1 element then our peak element is present in the right-hand side
    of the array so start = mid + 1 */
/*  when start and stop will point to same element that element will be our peak    */
public class FindPeak {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,3,2,1};
        System.out.println(findPeak(nums));
    }
    static int findPeak(int[] nums) {
       int start = 0;
       int end = nums.length - 1;
       while (start < end) {
           int mid = start + (end - start) / 2;
           if(nums[mid] > nums[mid + 1]) {
               end = mid;
           } else {
               start = mid + 1;
           }
       }
       return start;
    }
}
