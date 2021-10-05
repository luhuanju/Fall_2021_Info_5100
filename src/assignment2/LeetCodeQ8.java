package assignment2;

public class LeetCodeQ8 {



    /**
     * T : O(n) : for matrix size
     * S : O(1) :  for answer list
     */

    public boolean isPalindrome(String s) {
        if(s==" ")return true;
        for(int i=0,j=s.length()-1;i<j;){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }else if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }else if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                return false;
            }else {
                i++;j--;
            }
        }
        return true;
    }

}
