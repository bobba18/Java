package com.company;

import java.util.ArrayList;
import java.util.Scanner;
/*10. Check if the sentence is pangram
A pangram is a sentence where every letter of the English alphabet appears at least once.
Given a string sentence containing only lowercase English letters, return true if sentence is a pangram,
or false otherwise.
*/
public class Pangram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sen = in.next();
        System.out.println(check_pangram(sen));
    }
    public static boolean check_pangram(String sen)
    {
        Scanner in = new Scanner(System.in);
        if(sen.length()<26)
        {
            return false;
        }
        //all the alphabets
        char[] arr ;
        arr = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        //check
        int count = 0;
        for(int i = 0 ; i<sen.length() ; i++) {
            for (int j = 0; j < sen.length(); j++) {
                if (sen.charAt(i) == arr[j]) {
                    arr[j]='*';
                    count = 1;
                }
                else{
                    count=0;
                }
            }
        }
        return count == 1;
    }
}