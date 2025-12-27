package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        int nums[] = {0,1,2,3,4,5,7,8,10,11,13,9,12};
        int nums1[] = {4,4,5,5,9,9,10};
        int nums2[] = {9,6,3,4,4,9,2};
        String[] strs = {"act","cat","dog","tac","god"};
        String[] strs1 = {"flower","flight","flow"};
        String s1= "trainee";
        String s2= "intraee";
        //System.out.print(Arrays.toString(TwoSumProblem.twoSum(nums,15)));
        System.out.println(DuplicateNumber.containsDuplicate(nums));
        System.out.println(Arrays.toString(DuplicateNumber.removeDuplicateNumbers(nums)));
        System.out.println(DuplicateNumber.missingNumber(nums));
        System.out.println(Arrays.toString(ArrayIntersection.intersectionOfArrays(nums1,nums2)));
        System.out.println(Arrays.toString(ArrayIntersection.trueIntersection(nums1,nums2)));
        System.out.println("Is Anagram: "+Anagram.anagramCheck(s1,s2));
        System.out.println(Anagram.groupAnagrams(strs));
        System.out.println(LongestCommon.longestCommonPrefix(strs1));
        System.out.println(LongestCommon.longestUniqueSubstring(s1));
    }
}