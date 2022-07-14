package com.company;

import java.util.Scanner;

public class Evennodigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int l = in.nextInt();
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            arr[i] = in.nextInt();
        }

        int even = checkdigit(arr, l);
        System.out.println("# having even digits are: "+even);
    }

    public static int checkdigit(int[] arr, int l) {
        int digicount = 0;
            for(int i = 0 ;i < l ; i++)
            {
                int count=0;
                while(arr[i]>0){
                    int r = arr[i]%10;
                    count++;
                    arr[i]/=10;
                }
                if(count%2==0){
                    digicount++;
                }
            }
            return  digicount;

    }
}

