package com.company;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {34, 56, 78, 2, 0, -13};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int max = 0;
            int last = arr.length - i - 1;
            max = findMax(last, arr, max);
            swap(max , last , arr);
        }
    }

    private static void swap(int max, int last, int[] arr) {
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }

    private static int findMax(int end, int[] arr, int max) {
        for(int i = 1; i <= end; i++) {
            if(arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}
