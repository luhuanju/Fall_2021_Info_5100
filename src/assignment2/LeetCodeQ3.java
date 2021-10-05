package assignment2;

public class LeetCodeQ3 {


    /**
     * T : O(n) : one for loop
     * S : O(1) :  constant
     */
    public void moveZeroes(int[] nums) {
        int index=0;
        for(int i:nums){
            if(i!=0){
                nums[index++]=i;
            }
        }
        while(index<nums.length){
            nums[index++]=0;
        }

    }


}
