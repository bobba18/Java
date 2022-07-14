package com.company;

public class Timepass {
    public static void main(String[] args) {
        int[] arr = {6, 76, 56, 43, 24, 99, 34, 65, 97, 45};
        int element = 56;
//        int length = sizeof(arr) / 4;
//        sout("Size of array is: %i\n" , length);
        int ans = binarySearch(arr, element);
        System.out.println("Element is at index: " + ans);
    }
    static int binarySearch(int[] arr, int element) {
        int start = 0;
        int end = arr.length- 1;
        int mid = 0;
        while(start <= end) {
            mid = start + (end - start) / 2;
            if(arr[mid] == element) {
                return mid;
            } else if(element > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
