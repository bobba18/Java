package com.company;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {90,89,87,86,85,84,83,82,81,-90};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        boolean sorted = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    sorted = false;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if(sorted) {
                break;
            }
        }
    }
}
