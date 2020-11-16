package com.leetcode.dp;
//编辑距离
public class Problem78 {
    public int minDistance(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();

        int[][] dp = new int[n1+1][n2+1];

        for(int i = 0; i < n1+1; i++)
            dp[i][0] = i;
        for(int j = 0; j < n2+1; j++)
            dp[0][j] = j;
        for(int i = 1; i < n1+1; i++){
            for(int j = 1; j < n2+1; j++){
                if(word1.charAt(i-1) == word2.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1];
                else
                    dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]),dp[i-1][j-1])+1;
            }
            /**
             *动态规划dp[i][j]的更新
             * dp[i][j] 表示从 word1 的前i个字符转换到 word2 的前j个字符所需要的步骤
             * 我们通过观察可以发现，当word1[i] == word2[j]时，
             * dp[i][j] = dp[i - 1][j - 1]，其他情况时，dp[i][j]是其左，
             * 左上，上的三个值中的最小值加1，其实这里的左，上，和左上，
             * 分别对应的增加，删除，修改操作，具体可以参见解法一种的
             * 讲解部分，那么可以得到状态转移方程为
             **/
        }
        return dp[n1][n2];
    }
    //相对简单些
}
