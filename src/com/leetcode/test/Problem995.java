package com.leetcode.test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author xiaowen
 * @date 2020/11/24 11:21 下午
 *
 * 995. K 连续位的最小翻转次数
 */
public class Problem995 {
//    public int minKBitFlips(int[] A, int K) {
//        int N = A.length;
//        int[] hint = new int[N];
//        int ans = 0, flip = 0;
//        for (int i = 0; i < N; ++i) {
//            flip ^= hint[i];
//            if (A[i] == flip) {  // 我们是否必须翻转从此开始的子数组
//                ans++;  // 翻转子数组 A[i] 至 A[i+K-1]
//                if (i + K > N) return -1;  // 如果没办法翻转整个子数组了，那么就不可行
//                flip ^= 1;
//                if (i + K < N) hint[i + K] ^= 1;
//            }
//        }
//
//        return ans;
//    }
//    public int minKBitFilps(int[] A, int K) {
//        int N = A.length;
//        int[] hint = new int[N];
//        int ans = 0;
//        int flip = 0;
//        for (int i = 0; i < N; i++) {
//            flip ^= hint[i];
//            if (A[i] == flip) {
//                ans++;
//                if (i + K > N) return -1;
//                flip ^= 1;
//                if (i + K < N) hint[i + K] ^= 1;
//            }
//        }
//        return ans;
//    }

//    int minKBitFlips(vector<int>& A, int K) {
//        int n = A.size(),res = 0,hint[n] = {},flip = 0;
//        queue<int> q;
//        for(int i = 0 ; i < n; i ++)
//        {
//            while(!q.empty() && q.front() + K <= i)
//                q.pop();
//            if(A[i] == q.size() % 2)
//            {
//                if(i + K > n) return -1;
//                q.push(i);
//                res ++;
//            }
//        }
//        return res;
//    }
    public int minKBitFilps(int[] A, int K) {
        int n = A.length;
        int res = 0;
        int[] hint = new int[n];
        int flip = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            while (!queue.isEmpty() && queue.peek() + K <= i) {
                queue.poll();
            }
            if (A[i] == queue.size() % 2) {
                if (i + K > n) {
                    return -1;
                }
                queue.add(i);
                res++;
            }
        }
        return res;
    }
}
