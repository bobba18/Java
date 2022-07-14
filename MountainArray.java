package com.company;
//step 1: find the peak element
//step 2: search in left half first as we want min index
//step 3: if target not found in first half search in second half
public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9 , 22, 3, 1, 0};
        int target = 1;
        System.out.println("Min Index is : " + findInMountainArray(arr, target));
    }
    public static int findInMountainArray(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("The peak element is: " + arr[start]);
//        return start;
        int peak = start;
        //search in the left half first cuz we need minimum index
        start = 0;
        end = peak;
        int minIndex = -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                minIndex = mid;
            }
            if(target <= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if(minIndex == -1) {
            start = peak + 1;
            end = arr.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if(arr[mid] == target) {
                    minIndex = mid;
                }
                if(arr[mid] <= target) {
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }
        }
        return minIndex;
    }
}
