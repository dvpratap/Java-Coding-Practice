package org.example;

import java.util.*;

public class ArrayIntersection implements SmallProblems{
    /* 1. Intersection of 2 arrays, get unique elements
    ex: nums1: [4,5,9,10] nums2: [9,6,3,4,2,1]  intersection: [9,4] or [4,9]
     */
    public static int[] intersectionOfArrays(int[] nums1, int[] nums2){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int n: nums1) set1.add(n);
        for(int n: nums2) {
            if(set1.contains(n)) set2.add(n);
        }
        return set2.stream().mapToInt(n->n).toArray();
    }

    /* 2. Intersection of elements which has same frequency in both arrays including duplicates
    ex: nums1: [4,5,5,9,9,10] nums2: [9,9,6,3,4,4,5] intersection: [4,9,9]
     */
    public static int[] trueIntersection(int[] nums1, int[] nums2){
        Map<Integer,Integer> map1 = new HashMap<>();
        for(int n: nums1) map1.put(n, map1.getOrDefault(n,0)+1);
        List<Integer> list1 = new ArrayList<>();
        for(int n: nums2){
            if(map1.containsKey(n) && map1.get(n) > 0){
                list1.add(n);
                map1.put(n, map1.get(n)-1);
            }
        }
        return list1.stream().mapToInt(n->n).toArray();
    }
}
