package com.datastructures.arrays;

/*1085.Sum of Digits in the Minimum Number
        User Accepted:331
        User Tried:355
        Total Accepted:332
        Total Submissions:413
        Difficulty:Easy
        Given an array A of positive integers,let S be the sum of the digits of the minimal element of A.

        Return 0if S is odd,otherwise return 1.


        Example 1:

        Input:[34,23,1,24,75,33,54,8]
        Output:0
        Explanation:
        The minimal element is 1,and the sum of those digits is S=1 which is odd,so the answer is 0.
        Example 2:

        Input:[99,77,33,66,55]
        Output:1
        Explanation:
        The minimal element is 33,and the sum of those digits is S=3+3=6 which is even,so the answer is 1.


        Note:

        1<=A.length<=100
        1<=A[i].length<=100*/

public class LT1085SumofDigitsintheMinimumNumber {

    public static int sumOfDigits(int[] A) {

        int temp;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length ; j++) {
                if (A[j] < A[i]) {
                    temp = A[j];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        return ( sumDig(A[0])) ;
    }

    static int sumDig(int no){

        int addedNumber =0 ;
        System.out.println(" returned number is "+no);
        while (no != 0){
        addedNumber = addedNumber + no%10;
        no=no/10;
    }

        return (addedNumber%2 == 0 ? 1 : 0);
    }

    public static void main(String[] args) {

        int[] a = {99, 77, 33, 66, 55};
        int[] b = {34,23,1,24,75,33,54,8};
        int[] c = {48,78,15,89,70,90,10,81,3,77,40,18,80,43,22,28,47,19,62,7,51,46,56,76,96,11,61,74,28,32,99,34,63,56,43,95,25,36,38,7,39,86,57,11,77,13,57,11,22,51,4,56,10,92,38,21,79,50,56,75,97,12,24,48,95,57,83,43,60,11,86,54,30,2,58,35,6,9,81,88,90,53,30,16,73,97,28,79,7,87,80,81,99,1};
        System.out.println(" get Smallest -> " + sumOfDigits(c));

    }
}
