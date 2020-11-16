package com.ms.problem;

/**
 * @author xiaowen
 * @date 2020/8/25 11:51 下午
 */
public class Problem1724 {
    public int[] getMaxMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] nums = new int[n][m+1];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <=m; j++) {
                if(j == 1){
                    nums[i][j] = matrix[i][j-1];
                    continue;
                }
                nums[i][j] = nums[i][j-1] + matrix[i][j-1];
            }
        }
        int[] res = new int[4];
        int ans = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= m; i++) {
            for (int j = i+1; j <= m; j++) {
                ans = nums[0][j] - nums[0][i];
                int r1 = 0;
                int c1 = i;
                if(ans > max) {
                    max = ans;
                    res[0] = r1;
                    res[1] = c1;
                    res[2] = 0;
                    res[3] = j-1;
                }
                for (int k = 1; k < n; k++) {
                    if(ans >= 0){
                        ans += nums[k][j] - nums[k][i];
                    }else{
                        ans = nums[k][j]-nums[k][i];
                        r1 = k;
                        c1 = i;
                    }
                    if(ans > max){
                        max = ans;
                        res[0] = r1;
                        res[1] = c1;
                        res[2] = k;
                        res[3] = j - 1;
                    }
                }
            }
        }
        return res;
    }
}
