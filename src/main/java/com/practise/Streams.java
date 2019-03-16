package com.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.*;


public class Streams {

    public  static  void main(String[] args){

        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(12);
        myList.add(22);
        myList.add(33);
        myList.add(44);
        myList.add(8);
        myList.add(66);
        myList.add(77);
        myList.add(10);

        Stream<Integer> myStream = myList.stream();

        //To get the min value from the stream
        Optional<Integer> minValue = myStream.min(Integer::compare);
        if(minValue.isPresent())
        System.out.println(" The min value in the stream is " + minValue.get());

        //max value from Stream
        myStream = myList.stream();
        Optional<Integer> maxValue = myStream.max(Integer::compare);
        if(maxValue.isPresent())
        System.out.println(" The max value in the stream is " +maxValue.get());

        //Display sortedStream by use of forEach
        Stream<Integer> sortedStream = myList.stream().sorted();
        System.out.println("The sorted stream is ");
        sortedStream.forEach((n) -> System.out.println(n + " "));

        //Display only odd values in the Stream

        System.out.println("\n odd values in the stream are \n");
        Stream<Integer> oddValues =  myList.stream().sorted().filter( (n) -> ( n % 2 )  == 1);
        oddValues.forEach(n -> System.out.println(n + "" ));

        //Display only odd values greater that 33
        System.out.println("\n odd values in the stream which are greater than 33 are \n");
        Stream<Integer> oddValuesgreaterthan = myList.stream().sorted().filter( (n) -> ( n%2) == 1  )
                .filter( (n) -> n > 33);
        oddValuesgreaterthan.forEach(n -> System.out.println(""+n) );



    }
}
