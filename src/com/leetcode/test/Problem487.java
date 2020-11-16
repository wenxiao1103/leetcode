package com.leetcode.test;

import java.util.LinkedList;
import java.util.Queue;

//最大连续1的个数2，只能将一个0替换成1后，最大连续1的个数
public class Problem487 {
//    public:
//    int findMaxConsecutiveOnes(vector<int>& nums) {
//        int res = 0, left = 0, k = 1;
//        queue<int> q;
//        for (int right = 0; right < nums.size(); ++right) {
//            if (nums[right] == 0) q.push(right);
//            if (q.size() > k) {
//                left = q.front() + 1; q.pop();
//            }
//            res = max(res, right - left + 1);
//        }
//        return res;
//    }
//};
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int left = 0;
        int k = 1;
        Queue<Integer> queue = new LinkedList<>();
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) queue.add(right);
            if (queue.size() > k) {
                left = queue.peek() + 1;
                queue.poll();
            }
            res = Math.max(res, right-left+1);
        }
        return res;
    }
    //方法一
    //[1,0,1,1,0]
    //双指针，left和right，队列Queue存放窗口中0的位置，并且queue的长度则是0的个数
    //当0的个数大于k后，则窗口右移动当，最近0的位置后一位left = queue.peek() + 1;
    public int longestOnes(int[] A, int K){
        int i = 0;
        int j = 0;
        int max = 0;
        while(j < A.length){
            if(A[j] == 0) K--;
            if(K >= 0) max = Math.max(j-i+1, max);
            if (K < 0){
                while (A[i++] == 1) continue;
                K++;
            }
            j++;
        }
        return max;
    }//方法二

}
