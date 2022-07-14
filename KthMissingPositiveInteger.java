package com.company;

//case 1: [1, 2, 3, 4], k = 2, result = 6 after array
//case 1: [3, 4, 5], k = 2, result = 2 before array
//case 3: [3, 4, 5, 9], k = 5, result = 6 in the array
public class KthMissingPositiveInteger {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 12};
        int k = 8;
        System.out.println(findKthPositive(arr, k));
    }

    public static int findKthPositive(int[] arr, int k) {
        int missedCount = 0;
        if (arr[0] > 1) {
            missedCount = arr[0] - 1;
            if (k <= missedCount) {
                return k;
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            missedCount = missedCount + (arr[i + 1] - arr[i] - 1);
            if (k <= missedCount) {
                int count = arr[i + 1] - arr[i] - 1;
                int j = 1;
                while(j <= count) {
                   if(missedCount - count + j == k) {
                       return arr[i] + j;
                   }
                   j++;
                }
            }
        }
        return arr[arr.length - 1] + (k - missedCount);
    }
}

