package com.company;
import java.util.Scanner;
public class If {
    public static void main(String[] args) {
//***************if****************************
//        if(true)
//        {
//            System.out.println("HELLO WORLD");
//        }
//**************while************************
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter the limit: ");
//        int n = input.nextInt();
//        int count = 1;
//        while(count<n)
//        {
//            System.out.println(count);
//            count++;
//        }
//***************for**********************
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the limit: ");
        int n = input.nextInt();
        for(int i = 1 ; i<n ; i++)
        {
            System.out.println("HELLO");
        }

    }
}
