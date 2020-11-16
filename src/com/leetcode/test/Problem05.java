package com.leetcode.test;
//最长回文子串
public class Problem05 {
   /* public String longestPalindrome(String s){
        if(s == null || s.length() == 0){
            return "";
        }
        int[] range = new int[2];
        char[] str = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
            i = findLongest(str, i, range);
        }
        return s.substring(range[0], range[1]+1);
    }*/

   //中心扩散，如一个相邻的是相同的，可以直接跳过
   public String longestPalindrome(String s){
       if(s == null || s.length() == 0) return "";
       int[] range = new int[2];
       char[] str = s.toCharArray();
       for(int i = 0; i < str.length; i++)
           i = findLongest(str, i, range);
       return s.substring(range[0], range[1]+1);
   }
    public static int findLongest(char[] str, int low, int[] range){
        int high = low;
        while(high < str.length-1 && str[high+1] == str[low]){
            high++;
        }
        int ans = high;
        while(low > 0 && high < str.length-1 && str[low-1] == str[high+1]){
            low--;
            high++;
        }
        if(high - low > range[1]-range[0]){
            range[0] = low;
            range[1] = high;
        }
        return ans;
    }
}
