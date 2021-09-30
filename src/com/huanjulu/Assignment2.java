package com.huanjulu;

public class Assignment2 {


    /**
     * Time Complexity : O (n)
     * Space : O (n)
     */
    public int[] sortedSquares(int[] nums) {


        int ans[]=new int[nums.length];
        int idx=nums.length-1;
        int i=0,j=nums.length-1;

        while(i<=j){
            if(nums[i]* nums[i]<nums[j]* nums[j]){
                ans[idx]=nums[j]* nums[j];
                j--;
            }else{
                ans[idx]=nums[i]* nums[i];
                i++;
            }
            idx--;
        }
        return ans;
    }
}
