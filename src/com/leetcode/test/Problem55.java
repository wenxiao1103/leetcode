package com.leetcode.test;
//跳跃游戏
public class Problem55 {
    public boolean canJump(int[] nums){
        int lostPos = nums.length-1;
        for(int i = nums.length-1; i >= 0; i--){
            if(i+nums[i] >= lostPos){
                lostPos = i;
            }
        }
        return lostPos == 0;
    }
    //判断当前位置能否跳跃到lostPos,如果能够，则lostPos = 当前位置i
}
