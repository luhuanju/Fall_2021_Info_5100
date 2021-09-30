package com.huanjulu;

import java.util.HashMap;
import java.util.Map;

public class Assignment3 {

    /**
     *
     *    Time Complexity : O (n)  : two pass
     *     Space : O (n) :  for map
     */
    public static int main(int[] nums) {

        Map<Integer,Integer> hash=new HashMap<Integer,Integer>();
        for(int i:nums){
            hash.put(i,hash.getOrDefault(i,0)+1);
        }

        for(int i: nums){
            if(hash.get(i)==1)
                return i;
        }
        return -1;
    }
}
