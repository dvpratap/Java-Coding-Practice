package org.example;

import java.util.HashSet;
import java.util.Set;


public class DuplicateNumber implements SmallProblems{

    public static boolean containsDuplicate(int nums[]){
        Set<Integer> hashSet = new HashSet<>();
        for(int n: nums){
            if(! hashSet.add(n)) return true;
        }
        return false;
    }
    public static int[] removeDuplicateNumbers(int nums[]){
        Set<Integer> set = new HashSet<>();
        for(int n: nums)
            set.add(n);
        return set.stream().mapToInt(x-> x).toArray();
    }

    public static int missingNumber(int nums[]){
        // will use formula for total sum = n*(n+1)/2
        // Array must start from 0 ex: {0,1,2,3,4,7,5,8,9 ....}
        int sum = nums.length*(nums.length+1) / 2;
        for(int n: nums)
            sum -= n;
        return sum;
    }
}
