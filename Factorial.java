package learn.java;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N(Factorial): ");
        int N = in.nextInt();
        int factorialOfN = factorial(N);
        System.out.println(factorialOfN);
    }

    public static int factorial(int N) {
        if(N == 1) {
            return 1;
        }
        return N*factorial(N-1);
    }
}
