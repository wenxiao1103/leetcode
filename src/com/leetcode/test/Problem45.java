package com.leetcode.test;
//跳跃游戏，使用最少的次数，跳跃到最后的位置
public class Problem45 {
    /*public int jump(int[] nums) {
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for(int i = 0; i < nums.length-1; i++){
            maxPosition = Math.max(maxPosition, nums[i]+i);
            if(i == end){
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }*/
    public int jump(int[] nums){
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for(int i = 0; i < nums.length-1; i++){
            maxPosition = Math.max(i+nums[i], maxPosition);
            if(i == end){
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }
}
