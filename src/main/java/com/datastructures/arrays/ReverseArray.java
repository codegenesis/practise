package com.datastructures.arrays;

public class ReverseArray {

    public static void reverseArray(int[] a ){

        int[] b = new int[a.length] ;
        int j = a.length;
        for (int i =0 ; i< a.length ; ++i){

           b[j-1] = a[i];
           j-- ;
        }

        for (int k=0 ; k<a.length; k++){
            System.out.println(b[k]);
        }

    }

    public static void main(String[] args){

        int[] a = {1,2,3,4,5};
        System.out.println(" initial array "+a);
        reverseArray(a);
    }
}
