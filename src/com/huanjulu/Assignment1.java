package com.huanjulu;


import java.util.HashMap;
import java.util.Map;

public class Assignment1 {

    /**
     * Time Complexity : O(n) : one for loop
     * Space Complexity : O(n) : for map
     *
     */

    public int main(int[] nums) {
            int sum=0;
            Map<Integer,Integer> hash=new HashMap<Integer,Integer>();
            for(int i:nums){
                hash.put(i,hash.getOrDefault(i,0)+1);
            }

            for(Map.Entry<Integer,Integer> m:hash.entrySet()){
                if(m.getValue()==1){
                    sum+=m.getKey();
                }
            }
            return sum;

    }
}
