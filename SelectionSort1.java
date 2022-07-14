package com.company;

import java.util.Arrays;

public class SelectionSort1 {
    public static void main(String[] args) {
        int[] arr = {90, -12, -90, 45, 678, 1, 0, 5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        //for 0 - 5
        //position = 6 - 1 - 0 = 5
        //6 - 1 - 1 = 4
        //6 - 1 - 2 = 3
        //6 - 1 - 3 = 2
        //6 - 1 - 4 = 1
        //6 - 1 - 5 = 0
        //for 0 - 5
        for(int i = 0; i < arr.length; i++) {
            int position = arr.length - 1 - i;
            int max = arr[0];
            int maxPosition = 0;
            for(int j = 1; j <= position; j++) {
                if(max < arr[j]) {
                    max = arr[j];
                    maxPosition = j;
                }
            }
            int temp = arr[maxPosition];
            arr[maxPosition] = arr[position];
            arr[position] = temp;
        }
    }
}