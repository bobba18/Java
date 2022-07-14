package com.company;

public class MaxValueOfEquation {
    public static void main(String[] args) {
        int[][] points = {{1, 3}, {2, 0}, {5, 10}, {6, -10}};
        int k = 1;
        int ans = MaxValueEquation(points, k);
        System.out.println(ans);
    }

    static int MaxValueEquation(int[][] points, int k) {
        int i = 0;
        int j = 1;
        int max = 0;
        while (i < points.length && j < points.length) {
            if (points[j][0] - points[i][0] == k) {
                int equation = points[i][1] + points[j][1] + k;
                if (equation > max) max = equation;
                i++;
                j++;
            } else if (points[j][0] - points[i][0] > k) i++;
            else j++;
        }
        return max;
    }
}

