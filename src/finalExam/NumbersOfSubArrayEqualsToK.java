package finalExam;

import java.util.HashMap;
import java.util.Map;

public class NumbersOfSubArrayEqualsToK {


    public static void main(String[] args) {
        int[] nums=new int[]{1,1,1};
        int k=2;
        int ans1=getAns(nums, k);
        System.out.println(ans1);

        int[] nums1=new int[]{1,2,3};
        int k1=3;
        int ans2=getAns(nums1, k1);
        System.out.println(ans2);

    }
    private static int getAns(int[] nums, int k) {
        Map<Integer,Integer> store=new HashMap<>();
        int count=0;
        int preSum=0;
        store.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            preSum+= nums[i];
            if(store.containsKey(preSum- k)){
                count+=store.get(preSum- k);
            }
            store.put(preSum,store.getOrDefault(preSum,0) +1);
        }
        return count;
    }
}
