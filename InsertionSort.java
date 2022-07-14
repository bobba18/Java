package com.company;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {90, -12, 15, 40, -6, 92, 12, 0, -4, -2, 123, 6789};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j >= 1; j--) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
