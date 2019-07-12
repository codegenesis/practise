package com.datastructures.amazon.dynamicprogram;

//This is to find the longest palindrome substring in a string.
public class LongestPalindromeSubstring {


    public static void longestPalSubstr(String s) {

        int strLen = s.length();

        boolean table[][] = new boolean[strLen][strLen];

        int maxlength = 1;
        for (int i = 0; i < strLen; i++) {
            table[strLen][strLen] = true;
        }

        int start = 0;
        for (int i = 0; i < strLen - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1))
                table[strLen][strLen] = true;
            start = i;
            maxlength = 2;
        }

        for(int k=3 ; k<= strLen ; ++k){
            for (int i=0 ; i<strLen-k+1 ;++i){
                int j = i+k-1;

            }
        }

    }


}
