package midterm;

import java.lang.reflect.Array;
import java.util.*;

public class Problem3 {
    public static void main(String[] args) {

        int[] arr=new int[]{1,1,1,22,22,10,10};

        int ans=getSumOfDuplicatedElement(arr);

        int ans2=getAns(arr);

        System.out.println(ans);
        System.out.println(ans2);
    }


    public static int getAns(int[] arr){
        Arrays.sort(arr);
        int max=arr[arr.length-1];
        int[] indices=new int[max+1];
        for (int i: arr){
            indices[i]++;
        }
        int sum=0;
        for (int i=0;i<indices.length;i++){
            if (indices[i]>1){
                sum+=i;
            }
        }
        return sum;
    }

    /**
     * S : O(n) for map store
     * T : O(n) for two loop
     *
     */
    public static int getSumOfDuplicatedElement(int[] arr){
        Map<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for (int i:arr) map.put(i,map.getOrDefault(i,0)+1);
        for (int k:map.keySet()) if (map.get(k)>1)ans+=k;
        return ans;
    }


}
