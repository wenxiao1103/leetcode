package com.leetcode.JZoffer;

import java.util.ArrayDeque;
import java.util.Deque;
//滑动窗口最大值,对应leetcode239题
public class Problem59 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0) {
            return new int[0];
        }
        int[] res = new int[nums.length-k+1];
        int index = 0;
        Deque<Integer> que = new ArrayDeque<Integer>();
        for (int i = 0; i < nums.length; i++) {
            while( !que.isEmpty() && que.peek() < i-k+1) {
                que.poll();
            }
            while(!que.isEmpty() && nums[que.peekLast()] < nums[i]){
                que.pollLast();
            }
            que.offer(i);
            if(i >= k-1) {
                res[index++] = nums[que.peek()];
            }
        }
        return res;
    }
}
