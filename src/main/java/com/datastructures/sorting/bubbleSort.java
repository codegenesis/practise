package com.datastructures;

//Author Shashi Kant - Bubble Sort

import java.sql.Array;

public class bubbleSort {

    public static void main(String[] args){


        int[] intArray = new int[]{20,30,40,5,6,7};

        //Before Bubble Sort
        for (  int i =0 ; i < intArray.length ; i++) {
            System.out.println("Before Bubble Sort " + intArray[i]);
        }

        BubbleSort(intArray);

        //After bubble Sort
        for( int j=0 ; j<intArray.length ; j++){

            System.out.println("\n After Bubble Sort " +intArray[j]);

        }



    }

    private static void BubbleSort(int[] intArray) {

       int numberOfElements = intArray.length;
       int temp =0 ;

       for (int i =0 ; i < numberOfElements ; i++){

           for (int j=1 ; j < (numberOfElements-i) ; j++){

               if(intArray[j-1] > intArray[j]){

                   //swap elements
                   temp = intArray[j-1];
                   intArray[j-1] = intArray[j];
                   intArray[j] = temp;

               }
           }

       }

    }


}