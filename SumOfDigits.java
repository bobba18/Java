package learn.java;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter Digit:");
        Scanner in = new Scanner(System.in);
        int digit = in.nextInt();
        int sum = sumOfDigit(digit);
        System.out.println(sum);
    }

    public static int sumOfDigit(int digit) {
        if(digit < 1) {
            return 0;
        }
        return (digit % 10) + sumOfDigit(digit/10);
    }
}
