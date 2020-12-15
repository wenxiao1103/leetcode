package com.leetcode.test;

import java.util.Arrays;

public class Problem1147 {
//    public int longestDecomposition(String text) {
//        int n=text.length(),ans=1;
//        int dp[]=new int[n/2+1];
//        char[] char1=text.toCharArray();
//        Arrays.fill(dp,-1);
//        dp[0]=0;
//        //设置比较回文的起点
//        int left=0;
//        for(int i=1;i<=n/2;i++)
//            for(int j=left;j<i;j++){
//                //[0:j]中没有段式回文，不用再去比较j后面的了
//                if(dp[j]==-1) continue;
// n              if(!check(char1,j,i,n)) continue;
//                dp[i]=dp[j]+1;
//                //更新left起点,i前面的字符串是段氏回文了，已经处理好了。
//                left=i;
//            }
//        //如果left*2<n说明最中间还有一段字符没有处理，就单独作为一个段氏回文。
//        return Math.max(ans,dp[left]*2+(left*2<n?1:0));
//    }
//    //暴力比较是否是回文字符串
//    boolean check(char[] char1,int j,int i,int n){
//        //n-i为后面字符串的起点,(m-j)为每次增加的量
//        for(int m=j;m<i;m++)
//            if(char1[m]!=char1[n-i+(m-j)]) return false;
//        return true;
//    }
//    public int longestDecomposition(String text){
//        int n = text.length(), ans = 1;
//        int[] dp = new int[n/2+1];
//        char[] char1 = text.toCharArray();
//        Arrays.fill(dp, -1);
//        dp[0] = 0;
//        int left = 0;
//        for (int i = 1; i <= n/2; i++){
//            for (int j = left; j < i; j++){
//                if(dp[j] == -1) continue;
//                if(!check(char1, j, i, n)) continue;
//                dp[i] = dp[j] + 1;
//                left = i;
//            }
//        }
//        return Math.max(ans, dp[left]*2+(left*2 < n?1:0));
//    }
//
//    public boolean check(char[] char1, int j, int i, int n){
//        for(int m = j; m < i; m++){
//            if(char1[m] != char1[n-i+(m-j)]) return false;
//        }
//            return true;
//    }
    //采用动态规划，dp[i]表示字符串0到i的短式回文的个数，如果i到j有短式回文，则dp[j] = dp[i]+1;
    //i到j，对应的字符串位置，为n-i+(m-j),m是在i到j之间
    public int longestDecomposition(String text) {
        int n = text.length();
        int ans = 1;
        int[] dp = new int[n/2 + 1];
        char[] char1 = text.toCharArray();
        Arrays.fill(dp, -1);
        dp[0] = 0;
        int left = 0;
        for (int i = 1; i <= n/2; i++) {
            for (int j = left; j < i; j++) {
                if (dp[j] == -1) continue;
                if (!check(char1, j, i, n)) continue;
                dp[i] = dp[j] + 1;
                left = i;
            }
        }
        return Math.max(ans, dp[left]*2+(left*2 < n?1:0));
    }
    public boolean check(char[] char1, int j, int i, int n) {
        for (int m = j; m < i; m++) {
            if (char1[m] != char1[n-i+(m-j)]) {
                return false;
            }
        }
        return true;
    }
}
