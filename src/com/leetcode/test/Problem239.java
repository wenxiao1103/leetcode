package com.leetcode.test;

import java.util.ArrayDeque;
import java.util.Deque;

//窗口最大值
public class Problem239 {
//    public int[] maxSlidingWindow(int[] nums, int k) {
//        if (nums == null || k <= 0){
//            return new int[0];
//        }
//        int n = nums.length;
//        int[] r = new int[n-k+1];
//        int ri = 0;
//        Deque<Integer> q = new ArrayDeque<>();
//        for (int i = 0; i < n; i++){
//            while((!q.isEmpty()) && q.peek() < i-k+1){
//                q.poll();
//            }//保证只含有窗口内的的元素的索引
//            while((!q.isEmpty()) && nums[q.peekLast()] < nums[i]) {
//                q.pollLast();
//            }//移除比当前元素小的所有元素，他们不可能是最大的
//            q.offer(i);
//            if ( i >= k-1) {
//                r[ri++] = nums[q.peek()];
//            }//将头部元素加入输出中
//        }
//        return r;
//    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || k <= 0) {
            return new int[0];
        }
        int n = nums.length;
        int[] r = new int[n-k+1];
        int ri = 0;
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            while(!q.isEmpty() && q.peek() < i-k+1){
                q.poll();
            }
            while(!q.isEmpty() && nums[q.peekLast()] < nums[i]){
                q.pollLast();
            }
            q.offer(i);
            if(i >= k-1){
                r[ri++] = nums[q.peek()];
            }
        }
        return r;
    }
    //算法思想
    //算法非常直截了当：
    //
    //处理前 k 个元素，初始化双向队列。
    //
    //遍历整个数组。在每一步 :
    //
    //清理双向队列 :
    //
    //  - 只保留当前滑动窗口中有的元素的索引。
    //
    //  - 移除比当前元素小的所有元素，它们不可能是最大的。
    //将当前元素添加到双向队列中。
    //将 deque[0] 添加到输出中。
    //返回输出数组。
}
