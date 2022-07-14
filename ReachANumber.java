package com.company;

public class ReachANumber {
    public static void main(String[] args) {
        int target = 16;
        System.out.println(reachNumber(target));
    }
    static int reachNumber(int target) {
        target = Math.abs(target);
        int k = 0;
        while (target > 0)
            target -= ++k;
        return target % 2 == 0 ? k : k + 1 + k%2;
    }
}
