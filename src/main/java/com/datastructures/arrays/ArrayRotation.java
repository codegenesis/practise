package com.datastructures.arrays;

import java.util.Arrays;

//This program rotates the array to the left by d positions
public class ArrayRotation {

    public static void main(String[] args){
    leftRotate(new int[]{23, 24, 25, 26, 27, 28, 29}, 2);
    }

    private static void leftRotate(int[] initArr, int d ){

        System.out.println("initialArray is "+ Arrays.toString(initArr));

        int temp;
        for (int i =0 ; i < d  ; i++ ){
            temp= initArr[0];
            System.out.println("temp value is "+temp);
            for (int j=0 ; j< initArr.length - 1; j++){
                initArr[j] = initArr[j+1];
            }
            initArr[initArr.length-1] = temp;
        }

        System.out.println("initialArray after left rotation by "+ d+ "position is" +Arrays.toString(initArr));

    }
}
