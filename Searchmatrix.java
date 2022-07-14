package com.company;

public class Searchmatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 13;
        System.out.println(searchMatrix(matrix,target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i < matrix.length; i++) {
            if(target <= matrix[i][matrix[i].length - 1]) {
                return binarySearch(0, matrix[i].length - 1, matrix, target, i);
            }
        }
        return false;
    }
    public static boolean binarySearch(int start, int end, int[][] matrix, int target, int i) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(matrix[i][mid] == target) {
                return true;
            } else if(matrix[i][mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
