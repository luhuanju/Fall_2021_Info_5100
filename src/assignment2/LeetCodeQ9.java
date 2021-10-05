package assignment2;

public class LeetCodeQ9 {



    /**
     * T : O(n) : one for loop
     * S : O(n) :  for new String builder size
     */
    public String reverseWords(String s) {
        StringBuilder ans=new StringBuilder();
        int j=s.length()-1;
        while(j>=0){
            while(j>=0 && s.charAt(j)==' ') j--;
            int i=j;

            while(j>=0 &&s.charAt(j)!=' ' ) j--;
            int k=j+1;

            while(k<=i) ans.append(s.charAt(k++));
            while(j>=0 && s.charAt(j)==' ' )  j--;

            if(j>=0) ans.append(" ");
        }
        return ans.toString();
    }

}
