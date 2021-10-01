package com.huanjulu.assignment1;

public class Assignment4 {


    /**
     *
     *    Time Complexity : O (n)  : two pass
     *    Space : O (1) :  int [26];
     */
    public static boolean main(String ransomNote, String magazine ) {
        int [] arr = new int[26];
        int n = magazine.length();

        for(int i = 0 ; i<n ; i++) {
            arr[magazine.charAt(i) - 'a']++;
        }
        int len = ransomNote.length();
        for(int i = 0 ; i<len ; i++) {
            if(arr[ransomNote.charAt(i) - 'a'] <= 0) {
                return false;
            }
            else {
                arr[ransomNote.charAt(i) - 'a']--;
            }
        }
        return true;
    }
}
