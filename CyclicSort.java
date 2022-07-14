package com.company;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 5, 7, 4, 2 , 6, }; //[3, 4, 1, 2, 5]
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclicSort(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            if(arr[i] != arr[arr[i] - 1]) {
                int temp = arr[i];
                arr[i] = arr[arr[i] - 1];
                arr[temp - 1] = temp;
            } else {
                i++;
            }
        }
    }
}
