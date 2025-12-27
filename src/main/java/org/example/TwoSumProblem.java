package org.example;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem implements SmallProblems{
    /*Problem: get the index of 2 elements whoese sum is equal to target
    ex: nums=[2,5,11,13,9] , target=15 , Ans: [0,3]
     */
    public static int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            int compliment = target-nums[i];
            if(map.containsKey(compliment))
                return new int[]{map.get(compliment), i};
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
