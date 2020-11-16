package com.leetcode.dp;
//最长重复子数组
public class Problem718 {
//    public int findLength(int[] A, int[] B) {
//        int n = A.length, m = B.length;
//        int[][] dp = new int[n + 1][m + 1];
//        int ans = 0;
//        for (int i = n - 1; i >= 0; i--) {
//            for (int j = m - 1; j >= 0; j--) {
//                dp[i][j] = A[i] == B[j] ? dp[i + 1][j + 1] + 1 : 0;
//                ans = Math.max(ans, dp[i][j]);
//            }
//        }
//        return ans;
//    }
    public int findLength(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        int[][] dp = new int[n+1][m+1];
        int ans = 0;
        for (int i = n-1; i >= 0; i--) {
            for (int j = m-1; j >= 0; j--) {
                dp[i][j] = A[i] == B[j] ? dp[i+1][j+1]+1:0;
                ans = Math.max(ans, dp[i][j]);
            }
        }
        return ans;
    }
    //我们希望优化这一过程，使得任意一对 A[i] 和 B[j] 都只被比较一次。
    // 这样我们自然而然想到利用这一次的比较结果。
    // 如果 A[i] == B[j]，那么我们知道 A[i:] 与 B[j:] 的最长公共前缀为 A[i + 1:] 与 B[j + 1:] 的最长公共前缀的长度加一，
    // 否则我们知道 A[i:] 与 B[j:] 的最长公共前缀为零。
    //
    //这样我们就可以提出动态规划的解法：令 dp[i][j] 表示 A[i:] 和 B[j:] 的最长公共前缀，
    // 那么答案即为所有 dp[i][j] 中的最大值。如果 A[i] == B[j]，
    // 那么 dp[i][j] = dp[i + 1][j + 1] + 1，否则 dp[i][j] = 0。
}