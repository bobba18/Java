package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = in.nextInt();
        int[] array = new int[n];
        System.out.println("Enter array elements: ");
        for(int i = 0 ; i < n ; i++) {
            array[i] = in.nextInt();
        }
        int[] ans = reverse(array);
        System.out.println("Reversed array is");
        System.out.println(Arrays.toString(ans));
    }
    static int[] reverse(int[] array) {
        int[] reverse_Array = new int[array.length];
        int i = 0;
        int j = array.length-1;
        while(i<array.length) {
            reverse_Array[i] = array[j];
            i++;
            j--;
        }
       return reverse_Array ;
    }
}
