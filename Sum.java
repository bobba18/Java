package com.company;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter first #: ");
            float a = input.nextFloat();
            System.out.print("Please enter second #:" );
            float b = input.nextFloat();
            float sum = a +b ;
            System.out.print("Sum = "+sum);
    }
}
