package com.company;

import java.io.*;
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int noOfLines = in.nextInt();
        int i = 0;
        while(i <= noOfLines) {
            String s = in.next();
            if(s.charAt(0) == 'H' || s.charAt(0) == 'h') {
                if(s.charAt(1) == 'I' || s.charAt(1) == 'i') {
                        if(s.charAt(3) != 'd' || s.charAt(3) != 'D') {
                            System.out.println(s);
                        }
                }
            }
            i++;
        }
    }
}
