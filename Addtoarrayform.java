package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Addtoarrayform {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i< n ;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the value of k: ");
        int k = in.nextInt();
        long[] ans = add(arr,n,k);
        System.out.println(Arrays.toString(ans));
    }
    public static long[] add(int[] arr , int n , int k){
        long sum = 0;
        for(int i = 0 ; i < n ;i++){
            sum=sum*10 + arr[i];
        }
        sum+=k;
        long l_sum = sum;
        int count =0;
        while(l_sum>0){
            long r = l_sum%10;
            count++;
            l_sum/=10;
        }
        System.out.println("sum = "+sum);
        System.out.println(count);
        long[] form = new long[count];
        int i = 1 ;
        while(sum>0){
            long r = sum%10;
            form[count-i]=r;
            i++;
            sum/=10;
        }
        return form;
    }
}
