package com.leetcode.test;

import sun.tools.native2ascii.resources.MsgNative2ascii;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author xiaowen
 * @date 2020/10/5 8:12 下午
 *
 * 503. 下一个更大元素 II
 */
public class Problem503 {
//    public int[] nextGreaterElements(int[] nums) {
//        int[] res = new int[nums.length];
//        Stack<Integer> stack = new Stack<>();
//        for (int i = 2 * nums.length - 1; i >= 0; --i) {
//            while (!stack.empty() && nums[stack.peek()] <= nums[i % nums.length]) {
//                stack.pop();
//            }
//            res[i % nums.length] = stack.empty() ? -1 : nums[stack.peek()];
//            stack.push(i % nums.length);
//        }
//        return res;
//    }
//    public int[] nextGreaterElements(int[] nums) {
//        int[] res = new int[nums.length];
//        Arrays.fill(res, -1);
//        Stack<Integer> stack = new Stack<>();
//        for (int i = 0; i < 2 * nums.length; i++) {
//            while (!stack.empty() && nums[stack.peek()] < nums[i % nums.length]) {
//                res[stack.peek() % nums.length] = nums[i % nums.length];
//                stack.pop();
//            }
//            stack.push(i % nums.length);
//        }
//        return res;
//    }
}
