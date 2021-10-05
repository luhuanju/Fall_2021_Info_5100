package assignment2;

public class LeetCodeQ10 {



    /**
     * T : O(n) :
     * S : O(1) :
     */
    public int compress(char[] chars) {
        int cur=0;
        for(int i=0,j=0;j <chars.length; i=j){

            while(j <chars.length && chars[i]==chars[j]){
                j++;
            }
            chars[cur++]=chars[i];
            if(j-i==1){
                continue;
            }
            for(char c : (""+ (j-i)).toCharArray()){
                chars[cur++]=c;
            }
        }
        return cur;

    }

}
