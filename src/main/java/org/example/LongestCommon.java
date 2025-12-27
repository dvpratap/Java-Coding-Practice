package org.example;

import java.util.HashSet;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LongestCommon {
    /*1. Longest Common Prefix
    Ex: {"flower","flight","flow"} res: "fl"
     */
    public static String longestCommonPrefix(String[] strs){
        String prefix = strs[0];
        for(String s: strs)
            while(!s.startsWith(prefix))
                prefix = prefix.substring(0,prefix.length()-1);
        return prefix;
    }

    public static String longestUniqueSubstring(String strs){
        Set<Character> set = new HashSet<>();
        char[] chars = strs.toCharArray();
        for(Character c: chars)
            set.add(c);
        return Stream.of(set.toArray()).map(Object::toString).collect(Collectors.joining());
    }
}
