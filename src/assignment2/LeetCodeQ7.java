package assignment2;

public class LeetCodeQ7 {

    /**
     * T : O(n) : for matrix size
     * S : O(n) :  for string builder size
     */
    public String addStrings(String num1, String num2) {
        StringBuilder sb=new StringBuilder();
        int carry=0;
        for(int i=num1.length()-1,j= num2.length()-1;i>=0||j>=0||carry==1;i--,j--){
            int x=i>=0?num1.charAt(i)-'0':0 ;
            int y=j>=0?num2.charAt(j)-'0':0 ;
            int n=(x+y+carry)% 10;
            carry=(x+y+carry)/10;
            sb.append(n);
        }
        return sb.reverse().toString();
    }
}
