package com.datastructures.searching;


import sun.tools.tree.BinaryLogicalExpression;

//Binary Search can be applied only to sorted arrays.
//search target in the sorted string.
public class BinarySearch {

   /* public static int binarySearch(int[] a, int target) {

        int start = 0;
        int end = a.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (a[mid] < target) {
                start = mid + 1;
            } else if (a[mid] > target) {
                end = mid - 1;
            } else return mid;
            System.out.println( " the searched value is "+ a[mid]);
        }
                return  -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        binarySearch(a, 2);
    }*/


   //approach 2 - using recursion
   public static int binarySearch(int[] a, int left, int right, int target) {


       if (right >= left) {
           int mid = left + (right - left) / 2;

           if (a[mid] == target)
               return mid;

           if (a[mid] > target)
               return binarySearch(a, left, mid-1, target);


           return binarySearch(a, mid-1, right, target);

       }
       return -1;
   }

    public static void main(String[] args) {

        BinarySearch bs = new BinarySearch();
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int left = 0;
        int right = a.length - 1;
        int searchele =2 ;
        int result = bs.binarySearch(a, left, right, searchele);
        if (result == -1) {
            System.out.println(" element not found");
        } else {
            System.out.println(" element found at index " + result);
        }
    }
}
