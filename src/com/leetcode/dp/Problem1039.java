package com.leetcode.dp;
//多边形三角剖分的最低得分
public class Problem1039 {
    int[][] cost;
    public int minScoreTriangulation(int[] A){
        int n = A.length;
        cost = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                cost[i][j] = Integer.MAX_VALUE;
            }
        }
        for(int i = 0; i < n-1; i++){
            cost[i][i+1] = 0;
        }

        for(int step = 2; step < n; step++){
            for(int i = 0; i+step < n; i++){
                int j = i+step;
                for(int k = i+1; k <= j-1; k++){
                    cost[i][j] = Math.min(cost[i][j], cost[i][k]+cost[k][j]+A[i]*A[j]*A[k]);
                }
            }
        }
        return cost[0][n-1];
    }
}
