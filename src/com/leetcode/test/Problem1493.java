package com.leetcode.test;

import java.util.Map;

/**
 * @author xiaowen
 * @date 2020/8/26 10:53 下午
 */
//删掉一个元素以后全为 1 的最长子数组
public class Problem1493 {
//     public int longestSubarray(int[] nums) {
//         int ans = 0;
//         int p0 = 0, p1 = 0;
//         for (int num : nums) {
//             if (num == 0) {
//                 p1 = p0;
//                 p0 = 0;
//             } else {
//                 ++p0;
//                 ++p1;
//             }
//             ans = Math.max(ans, p1);
//         }
//         if (ans == nums.length) {
//             --ans;
//         }
//         return ans;
//     }
    public int longestSubarray(int[] nums) {
        int res = 0;
        int p0 = 0;//连续1的个数
        int p1 = 0;//允许删除一个0的连续1的个数
        for (int num : nums) {
            if (num == 0){
                p1 = p0;
                p0 = 0;
            }else {
                p1++;
                p0++;
            }
            res = Math.max(res, p1);
        }
        if(res == nums.length) {
            res--;
        }
        return res;
    }
}
