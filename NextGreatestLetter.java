package com.company;

public class NextGreatestLetter {
    public static void main(String[] args) {
        char[] letters = {'c', 'f' , 'j'};
        char target = 'a';
        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        int mid = 0;
        char let = letters[0];
        while(start <= end) {
            mid = start + (end - start) / 2;
            if(letters[mid] > target) {
                let = letters[mid];
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return let;
    }
}
