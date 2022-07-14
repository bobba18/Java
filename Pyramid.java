package com.company;

import java.util.Scanner;

public class Pyramid  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("height: ");
        int height = in.nextInt();
        make(height);
    }
    static void make(int n){
        if(n<=0){
            return;
        }
        make(n - 1);
        for(int i = 0; i<n ; i++){
            System.out.print("#");
        }
        System.out.print("\n");
    }
}
