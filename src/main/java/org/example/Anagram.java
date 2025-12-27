package org.example;

import java.util.*;

public class Anagram implements SmallProblems{
    /*1. check if 2 strings are anagram of each other
    Ex: str1: "trainee" str2: "intreea"
     */
    public static boolean anagramCheck(String s1, String s2){
        int[] count = new int[26];
        for(char c: s1.toCharArray()) count[c - 'a']++;
        for(char c: s2.toCharArray()) count[c - 'a']--;
        for(int c: count) if(c!=0) return false;
        return true;
    }

    /* Group Anagram Strings together in the List
    Ex: Str: {"act","cat","dog","tac","god"} res: [["act","cat","tac"],["dog","god"]]
     */
    public static List<List<String>> groupAnagrams(String[] strs){
        Map<String,List<String>> map = new HashMap<>();
        for(String s: strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.computeIfAbsent(key, k-> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
