package com.datastructures.hashtables;

/*Given an array of integers, find a pair of integers that sums to a number X.

        For e.g, if A = [6,3,5,2,1,7]. X = 4, Result= [3,1]*/

import java.util.HashSet;
import java.util.Hashtable;

public class PairSum {

    public static void paiSum(int[] a, int sum) {

        HashSet<Integer> values = new HashSet<Integer>();
        for (int i = 0; i < a.length; ++i) {

            int temp = sum - a[i];

            if (values.contains(temp)) {
                System.out.println(" pair of integers are " +temp+ " " +a[i]+ " = " + sum);
            }
            values.add(a[i]);
        }
    }

    public static void main(String[] args){

        int[] a = {6,3,5,2,1,8};
        paiSum(a,8);

    }

}
