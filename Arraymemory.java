package com.company;

import java.util.Arrays;

public class Arraymemory {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));
        arr = new int[5];
        arr[3] = 4;
        arr[4] = 5;
        System.out.println(Arrays.toString(arr));

    }
}
