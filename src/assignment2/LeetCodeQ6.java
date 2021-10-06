package assignment2;

import java.util.HashMap;
import java.util.Map;

public class LeetCodeQ6 {


    /**
     * T : O(n) : for Map store
     * S : O(n) :  for loop
     */
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> hash=new HashMap<>();

        if(s.length()!=t.length()) return false;

        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);

            if(hash.containsKey(c1)){
                if(hash.get(c1)!=c2) return false;
            }
            /**
             * s : ab t: cc
             * in this case,  a->c . b->c ; if you just judge  a, b to case. you can do.
             * so, wo need to know the character in t if has been maped.
             * it means, if one char not be maped in s, but , the correspodding char of t has be mapped.
             * it will return false;
             */
            else if(hash.containsValue(c2)){
                return false;
            }
            hash.put(c1,c2);
        }
        return true;
    }


}
