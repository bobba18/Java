package com.company;

public class CountNegativeNumbersInASortedMatrix {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));
    }
//    {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}}
//    {{3,2},{1,0}}
//    {{1,-1},{-1,-1}}
//    {{-1}}
    public static int countNegatives(int[][] grid) {
        int m = grid.length;
        int count = 0;

        for(int i = 0; i < m; i++) {
            int n = grid[i].length;
            for(int j = 0; j < n; j++) {
                if(grid[i][j] < 0) {
                    count = count + (n - j);
                    break;
                }
            }
        }
        return count;
    }
}
