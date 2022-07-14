package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Uniquesum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ans = sum(n);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sum(int n){
        int[] nums = new int[n];
        if(n%2==0){
            for(int i=0 ; i<n ;i+=2){
                nums[i]=i+1;
                nums[i+1]=-(i+1);
            }
        }
        else{
            for(int j = 0 ; j<n-1 ;j+=2){
                nums[j]=j+1;
                nums[j+1]=-(j+1);
            }
            nums[n-1]=0;
        }
        return nums;
    }
}
