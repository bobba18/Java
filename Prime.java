package com.company;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number to check: ");
        int n = in.nextInt();
        int i = 2 ;
        while(i*i<=n)
        {
            if(n%i==0)
            {
                System.out.println("Not prime");
                return;
            }
            else
            {
                i++;
            }
        }
        if(i*i>n)
        {
            System.out.println("PRIME");
        }

    }
}
