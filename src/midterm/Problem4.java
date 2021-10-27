package midterm;

import java.util.HashMap;
import java.util.Map;

public class Problem4 {
    public static void main(String[] args) {
        // Test case
        String s="sfsalksdjfladfuaofdhoadfhipasfuaodfaopdfhasopfa";
        String ans=getLongestSubStringWithoutRepeat(s);
        System.out.println(ans);
    }



    /**
     *
     * dynamic programming.
     * t : O (n) for two loop
     * S : O (n) for DP array
     *
     */
    static String getLongestSubStringWithoutRepeat(String s){
        if (s.length() == 0) return "";

        String[] dp=new String[s.length()];
        dp[0]=""+s.charAt(0);
        for (int i=1;i<s.length();i++){
            if (!dp[i-1].contains(""+s.charAt(i))){
                dp[i]=dp[i-1]+s.charAt(i);
            }else{
                String temp=dp[i-1];
                int index=temp.indexOf(s.charAt(i));
                dp[i]=temp.substring(index+1)+s.charAt(i);
            }
        }
        String longSub=dp[0];
        for (String i:dp){
            if(i.length()>longSub.length()){
                longSub=i;
            }
        }
        return longSub;
    }
}
