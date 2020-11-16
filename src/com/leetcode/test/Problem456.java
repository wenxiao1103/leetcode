package com.leetcode.test;

import java.util.Stack;

/**
 * @author xiaowen
 * @date 2020/8/28 12:09 上午
 * 456.132模式
 */
public class Problem456 {
//    public boolean find132pattern(int[] nums) {
//        if (nums.length < 3)
//            return false;
//        Stack< Integer > stack = new Stack < > ();
//        int[] min = new int[nums.length];
//        min[0] = nums[0];
//        for (int i = 1; i < nums.length; i++)
//            min[i] = Math.min(min[i - 1], nums[i]);
//        for (int j = nums.length - 1; j >= 0; j--) {
//            if (nums[j] > min[j]) {
//                while (!stack.isEmpty() && stack.peek() <= min[j])
//                    stack.pop();
//                if (!stack.isEmpty() && stack.peek() < nums[j])
//                    return true;
//                stack.push(nums[j]);
//            }
//        }
//        return false;
//    }
//    public boolean find132pattern(int[] nums) {
//        if(nums.length < 3)
//            return false;
//        Stack<Integer> stack = new Stack<>();
//        int[] min = new int[nums.length];
//        min[0] = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            min[i] = Math.min(min[i- 1], nums[i]);
//        }
//        for (int j = nums.length - 1; j >= 0; j--) {
//            if (nums[j] > min[j]){
//                while (!stack.isEmpty() && stack.peek() <= min[j])
//                    stack.pop();
//                if(!stack.isEmpty() && stack.peek() < nums[j])
//                    return true;
//                stack.push(nums[j]);
//            }
//        }
//        return false;
//    }
    public boolean find132pattern(int[] nums) {
        if (nums.length < 3) return false;
        Stack<Integer> stack = new Stack<>();
        int[] min = new int[nums.length];
        min[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            min[i] = Math.min(min[i-1], nums[i]);
        }
        for (int j = nums.length - 1; j >= 0; j--) {
            if (nums[j] > min[j]) {
                while (!stack.isEmpty() && stack.peek() <= min[j])
                    stack.pop();
                if (!stack.isEmpty() && stack.peek() < nums[j])
                    return true;
                stack.push(nums[j]);
            }
        }
        return false;
    }
}