package com.practise;

public class fibonacciSeries {

    public static void main(String[] argS){

        int t1 =0;
        int t2 =1;
        int n =100;
        int sum =0;

        for(int i=1 ; i<=n ; ++i){

            System.out.println("the fibonacci series is " +sum);

            sum = t1 + t2 ;
            t1 = t2 ;
            t2 = sum ;

        }

    }
}
