package com.leetcode.test;

/**
 * @author xiaowen
 * @date 2020/9/10 11:30 下午
 *
 * 27. 移除元素
 */
public class Problem27 {

    public int removeElement(int[] nums, int val) {
        int pos = 0;
        for (int n : nums){
            if(n != val){
                nums[pos++] = n;
            }
        }
        return pos;
    }
}
