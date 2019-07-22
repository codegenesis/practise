package com.datastructures.stringsandarrays;

public class RemoveDuplicatesFromSortedArray {

    private static int removedups(int[] arr, int n){

       /* System.out.println(" sorted array length is "+dupArray.length +" and dup elements are ");
       for (int i =0 ; i<dupArray.length ; i++){
           System.out.println(""+dupArray[i]);
       }*/

       if(n==0 || n==1){
           return n;
       }

        //int[] temp = new int[dupArray.length];
        int j = 0;

        for(int i=0 ; i< n-1 ; i++)
            if(arr[i] != arr[i+1])
                arr[j++] = arr[i];

                arr[j++] = arr[n-1];

            return j;




        /*System.out.println(" sorted array length is "+dupArray.length +" and non dup elements are ");
        for (int i =0 ; i<j ; i++){
            //dupArray[i] = temp[j];
            System.out.println(""+dupArray[i]);
        }*/

    }

    public static void main(String[] args){

        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int n =arr.length;
        n = removedups(arr, n);
        for (int i=0 ; i <n ; ++i){
            System.out.println(arr[i]);
        }
    }
}
