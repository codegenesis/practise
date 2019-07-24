package com.datastructures.stringsandarrays;

/*Given two strings s and t , write a function to determine if t is an anagram of s.

        Example 1:

        Input: s = "anagram", t = "nagaram"
        Output: true
        Example 2:

        Input: s = "rat", t = "car"
        Output: false
        Note:
        You may assume the string contains only lowercase alphabets.

        Follow up:
        What if the inputs contain unicode characters? How would you adapt your solution to such case?*/

import java.util.HashMap;

public class LC242EValidAnagram {

    static boolean isvalidAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        //populate the hashmap by iterating over the string.
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            Integer value = hashMap.get(key);
            if (value == null) {
                value = 1;
            } else {
                value += 1;
            }
            hashMap.put(key, value);
            System.out.println(" hashmap value is  "+hashMap.get(key));

        }

//Iterate the second string and check if the characters from the second string is present in the hashmap.
        for (int j = 0; j < t.length(); ++j) {
            char key2 = t.charAt(j);
            Integer value2 = hashMap.get(key2);
            System.out.println(" value2 = "+value2 +" for the key "+key2);
            if (value2 == null) {
                System.out.println(" reached here ");
                return false;
            }
            if (value2 == 1){
                System.out.println(" The key removed is "+key2);
                hashMap.remove(key2);
            }
            else {
                System.out.println(" the values are "+hashMap.get(key2));
                hashMap.put(key2,value2 - 1);
            }
            System.out.println(" ------------ ");
        }
        return hashMap.isEmpty();
    }

    public static void main(String[] args){

        boolean isAnagram = isvalidAnagram("anagram", "nagaram");
        System.out.println(" Is the string an anagram "+isAnagram);

    }
}