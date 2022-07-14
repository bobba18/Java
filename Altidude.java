package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Altidude {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of n ");
        int n = in.nextInt();
        int[] gain = new int[n];
        for(int i = 0 ; i<n ; i++)
        {
            gain[i]=in.nextInt();
        }
        int[] al = new int[n+1];
        int sum = 0;
        int i = 0;
        al[0]=0;
        while (i<n) {
            sum = sum + gain[i];
            al[i+1] = sum;
            i++;
        }
        System.out.println(Arrays.toString(al));
        int max = 0;
        for(int j = 0 ; j<=n ; j++)
        {
            if(al[j]>max)
            {
                max = al[j];
            }
        }
        System.out.println(max);
    }
}
