package com.company;
//{'c', 'f', 'j'}
//[ 0 ,  1,   2 ]
//start = 0 , end = 2
//mid = start + end / 2 = (0 + 2) / 2 = 1
//letters[1] = f > c
//end = mid - 1 = 1 - 1 = 0
//start = 0 , end = 0
//mid = 0 + 0 / 2 = 0
//letters[0] = c = c
//start = mid + 1 start = 1
//start = 1 end = 0
//letters[1] = f is smallest letter greater than the target
public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(letters,target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        if(target >= letters[letters.length - 1]) {
            return letters[0];
        }
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letters[start];
    }
}
