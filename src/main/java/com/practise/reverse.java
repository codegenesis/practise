package com.practise;

public class reverse {

    public  static  void  main(String[] args){

        StringBuilder origStr = new StringBuilder("Shashi");
        System.out.println(reverseMe(origStr));
    }

    private static StringBuilder reverseMe(StringBuilder origStr) {

    return origStr.reverse();

    }
}
