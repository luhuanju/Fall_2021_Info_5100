package com.huanjulu;

public class Assignment5 {


    /**
     *       Time Complexity : O (n)
     *       Space : O (1) :
     *
     */
    public static boolean main(String s) {
        for(int i=0;i<s.length()-1;i++){
            if( !((Character.isDigit(s.charAt(i))&& Character.isLetter(s.charAt(i+1)))
                    ||
                    (Character.isLetter(s.charAt(i))&& Character.isDigit(s.charAt(i+1)))))
                return false;
        }
        return true;
    }
}
